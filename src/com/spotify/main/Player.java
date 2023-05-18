package com.spotify.main;

import com.spotify.playlists.Playlist;
import com.spotify.songs.Song;
import java.util.ArrayList;

public class Player {
    
    private Playlist playlist;

    public void playMusic(Song song) {
        
        if (Spotify.IS_PLAYING)
            song.pauseSong();
        else 
            song.resumeSong();
    }
    
    public void playNext(Playlist playlist, Song song) {
        this.playlist = playlist;
        
        if (Spotify.IS_PLAYING)
            song.stopSong();

        ArrayList<Song> songs = playlist.getPlaylist();
        Song nextSong = songs.get(song.getId() + 1);
        
        nextSong.playSong();
    }
}
