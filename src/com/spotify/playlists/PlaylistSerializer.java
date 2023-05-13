package com.spotify.playlists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.spotify.ui.playlist.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import com.spotify.songs.Song;

public class PlaylistSerializer implements Serializable {
    
    final String fileName = "playlists.bin";
    private ArrayList<PlaylistListUI> playlistsList = new ArrayList<>();
    private ArrayList<PlaylistCardUI> playlistCards = new ArrayList<>();
    private ArrayList<Playlist> playlists;
    
    public PlaylistSerializer() {
        
        playlists = importPlaylists();
        initOriginalPlaylist();
    }
    
    public ArrayList<PlaylistListUI> getPlaylistList() {
        
        playlists.forEach(p -> playlistsList.add(new PlaylistListUI(p)));
        return playlistsList;
    }
    
    public ArrayList<PlaylistCardUI> getPlaylistCard() {
        
        playlists.forEach(p -> playlistCards.add(new PlaylistCardUI(p)));
        return playlistCards;
    }
    
    public void addToPlaylistCards(PlaylistListUI playlist) {
        
        playlistsList.add(playlist);
    }
    
    public ArrayList<Playlist> getPlaylist() {
        
        return playlists;
    }
    
    public ArrayList<Playlist> importPlaylists() {
        
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            PlaylistSerializer playlist  = (PlaylistSerializer) input.readObject();
            
            return playlist.getPlaylist();
        }
        catch(IOException | ClassNotFoundException ex) {
            // ex.printStackTrace();
        }
        
        return new ArrayList<>();
    }
    
    public void addToPlaylist(int id, Song song) {
        
        playlists.stream()
                 .filter(p -> p.getId() == id)
                 .forEach(p -> p.addToPlaylist(song));
    }
    
    public void exportPlaylist() {
        
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
            output.writeObject(this);
            output.close();
            System.out.println("Songs saved");
        }
        catch(IOException ex) { }
    }
    
    public void initOriginalPlaylist() {
        
        Thread thread = new Thread();
        
        Playlist p1 = new Playlist(0, "Top Hits Philippines", new ImageIcon(getClass().getResource("/img/pl1.png")));
        p1.addToPlaylist(new Song(new File("songs/song.mp3"), 1, "panaginip", "iluna", 500, new ImageIcon(getClass().getResource("/img/s1.png")), p1.getId()));
        p1.addToPlaylist(new Song(new File("songs/lofi.mp3"), 2, "Nahuhulog Na Sa'yo", "Noah Alejandre", 401, new ImageIcon(getClass().getResource("/img/s1.png")), p1.getId()));
        p1.addToPlaylist(new Song(new File("songs/move.mp3"), 3, "Uhaw (Tayong Lahat)", "Noah Alejandre", 401, new ImageIcon(getClass().getResource("/img/s1.png")), p1.getId()));
        playlists.add(p1);
        
        Playlist p2 = new Playlist(1, "This is Taylor Swift", new ImageIcon(getClass().getResource("/img/pl2.png")));
        playlists.add(p2);
        
        Playlist p3 = new Playlist(2, "Chillax Ka Muna!", new ImageIcon(getClass().getResource("/img/pl3.png")));
        playlists.add(p3);
        
        Playlist p4 = new Playlist(3, "Liked Songs", new ImageIcon(getClass().getResource("/img/pl4.png")));
        playlists.add(p4);
        
        Playlist p5 = new Playlist(4, "Today's Top Hits", new ImageIcon(getClass().getResource("/img/pl5.png")));
        playlists.add(p5);
        
        Playlist p6 = new Playlist(5, "Mang Kanor", new ImageIcon(getClass().getResource("/img/pl6.png")));
        playlists.add(p6);
    }
}
