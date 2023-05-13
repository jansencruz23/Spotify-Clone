package com.spotify.songs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

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
    
    public void stopMusic() {
        
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
            }
            catch (FileNotFoundException | JavaLayerException e) {
                e.printStackTrace();
            }
        });
    }
    
    public void playSong() {
        
        if(!thread.isAlive())
            thread.start();          
        else {
            stopMusic();
            playSong();
        }
    }
}
