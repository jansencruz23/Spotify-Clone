package spotify.playlists;

import java.io.Serializable;
import java.util.ArrayList;

public class Playlists implements Serializable {
    
    private ArrayList<PlaylistUI> playlists = new ArrayList<>();
    
    public ArrayList<PlaylistUI> getPlaylists() {
        
        return playlists;
    }
    
    public void addToPlaylists(PlaylistUI playlist) {
        
        playlists.add(playlist);
    }
}
