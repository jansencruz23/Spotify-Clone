package com.spotify.songs;

import com.spotify.main.Spotify;
import java.beans.Customizer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class Song {
    
    static Thread thread;
    static Player player;
    
    private int id;
    private File file;
    private String title;
    private String artist;
    private int duration;
    private ArrayList<Integer> includedPlaylist = new ArrayList<>();
    private ImageIcon icon;
    
    private long pauseOffset;
    private long songLength;
    
    public Song(File file, int id, String title, String artist, int duration, ImageIcon icon, int playlistId) {
        
        this.id = id;
        this.file = file;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.icon = icon;
        this.includedPlaylist.add(playlistId);
        
        initThread();
    }
    
    public Song() {
        
        initThread();
    }
    
    public File getFile() {
        
        return file;
    }
    
    public int getId() {
        
        return id;
    }
    
    public String getTitle() {
        
        return title;
    }
    
    public String getArtist() {
        
        return artist;
    }
    
    public int getDuration() {
        
        return duration;
    }
    
    public ImageIcon getIcon() {
        
        return icon;
    }
    
    public Thread getThread() {
        
        return thread;
    }
            
    public void stopSong() {
        
        Spotify.isPlaying = false;
        thread.interrupt();
        player.close();
        initThread();
    }
    
    private void initThread() {
        
        thread = new Thread(() -> {
            
            try {

                FileInputStream fileInputStream = new FileInputStream(file);
                player = new Player(fileInputStream);
                System.out.println(title + " is playing...");
                player.play();
                songLength = fileInputStream.available();
            }
            catch (FileNotFoundException | JavaLayerException e) {
                e.printStackTrace();
            }
            catch (IOException e) {}
        });
    }
    
    public void playSong() {
        
        System.out.println(getTitle());
        if(!thread.isAlive()) {
            initThread();
            thread.start();       
            Spotify.isPlaying = true;
        }
        else {
            stopSong();
            playSong();
        }
    }
    
    public void pauseSong() {
        
        pauseOffset = player.getPosition();
        stopSong();
    }
    
    public void resumeSong() {
     
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.skip(songLength - pauseOffset);
            AdvancedPlayer adPlayer = new AdvancedPlayer(fis);
            
            adPlayer.play((int) pauseOffset, Integer.MAX_VALUE);
        }
        catch(JavaLayerException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
