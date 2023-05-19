package com.spotify.songs;

import com.spotify.main.PausablePlayer;
import com.spotify.main.Spotify;
import com.spotify.playlists.Playlist;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javazoom.jl.decoder.JavaLayerException;

public class Song {
    
    static PausablePlayer player;
    
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
    }
    
    public Song() {
        
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
    
    public void playSong() {
        
        if (Spotify.IS_PLAYING) 
            player.stop();
        
        try {
            FileInputStream fileInput = new FileInputStream(file);
            player = new PausablePlayer(fileInput);
            player.play();
            Spotify.IS_PLAYING = true;
            Spotify.PLAYING_SONG = this;
            //Spotify.PLAYLIST = 
        } 
        catch (JavaLayerException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void loopSong() {
        
        try {
            FileInputStream fileInput = new FileInputStream(file);
            player = new PausablePlayer(fileInput);
            player.play();
            Spotify.IS_PLAYING = true;
        } 
        catch (JavaLayerException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void pauseSong() {
        
        if (player != null) {
            player.pause();
            Spotify.IS_PLAYING = false;
        }
    }
    
    public void resumeSong() {
        
        if (player != null) {
            player.resume();
            Spotify.IS_PLAYING = true;
        }
    }
    
    public void stopSong() {
        
        if (player != null) {
            player.stop();
            Spotify.IS_PLAYING = false;
        }
    }
}
