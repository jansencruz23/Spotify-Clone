package spotify.playlists;

import spotify.ui.playlist.PlaylistCardUI;
import java.io.Serializable;
import java.util.ArrayList;
import spotify.songs.Song;

public class Playlists implements Serializable {
    
    private ArrayList<PlaylistCardUI> playlistsCards = new ArrayList<>();
    
    public ArrayList<PlaylistCardUI> getPlaylistCards() {
        
        return playlistsCards;
    }
    
    public void addToPlaylistCards(PlaylistCardUI playlist) {
        
        playlistsCards.add(playlist);
    }
}
