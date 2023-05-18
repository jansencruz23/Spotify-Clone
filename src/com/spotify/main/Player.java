package com.spotify.main;

import com.spotify.songs.Song;

public class Player {

    public void playMusic(Song song) {
        
        if (Spotify.isPlaying) 
            song.pauseSong();
        else 
            song.resumeSong();
    }
}
