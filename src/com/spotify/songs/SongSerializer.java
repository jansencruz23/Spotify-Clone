package com.spotify.songs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SongSerializer implements Serializable{
    
    final String fileName = "songs.bin";
    private ArrayList<Song> songs;
    
    public SongSerializer() {
        
        initOriginalSongs();
    }
    
    public ArrayList<Song> getSongs() {
        
        return songs;
    }
    
    public ArrayList<Song> importSongs() {
        
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            SongSerializer song = (SongSerializer) input.readObject();
            this.songs = song.getSongs();
            
            return song.getSongs();
        }
        catch(IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
        }
        
        return new ArrayList<Song>();
    }
    
    public void addToSongs(Song song) {
        
        songs.add(song);
    }
    
    public void exportSongs() {
        
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
            output.writeObject(this);
            output.close();
            System.out.println("Songs saved");
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void initOriginalSongs() {
        
        
    }
}
