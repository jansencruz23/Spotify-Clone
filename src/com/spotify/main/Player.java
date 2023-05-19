package com.spotify.main;

import com.spotify.playlists.Playlist;
import com.spotify.songs.Song;
import java.util.Random;

public class Player {
    
    Random random = new Random();
    
    public void playMusic(Song song) {
        
        Spotify.PLAYING_SONG = song;
        if (Spotify.IS_PLAYING)
            song.pauseSong();
        else 
            song.resumeSong();
    }
    
    public Song playNext(Playlist playlist, Song song) {
        
        Spotify.PLAYING_SONG = song;
        
        if (Spotify.IS_PLAYING)
            song.stopSong();
        
        if (Spotify.IS_SHUFFLED) 
            return playShuffle(playlist, song);

        Song nextSong = playlist.getPlaylist()
                                .get(song.getId() + 1);
        
        nextSong.playSong();
        
        return nextSong;
    }
    
    public Song playPrevious(Playlist playlist, Song song) {
        
        Spotify.PLAYING_SONG = song;
        
        if (Spotify.IS_PLAYING)
            song.stopSong();
        
        if (Spotify.IS_SHUFFLED) 
            return playShuffle(playlist, song);

        Song prevSong = playlist.getPlaylist()
                                .get(song.getId() - 1);
        
        prevSong.playSong();
        
        return prevSong;
    }
    
    public Song playShuffle(Playlist playlist, Song song) {
        
        int songId = random.nextInt(playlist.size());
        
        while (songId == song.getId())
            songId = random.nextInt(playlist.size());
        
        Song nextSong = playlist.getPlaylist()
                                .get(songId);
        
        System.out.println(nextSong.getTitle());
        
        nextSong.playSong();
        Spotify.PLAYING_SONG = song;
        
        return nextSong;
    }
}
