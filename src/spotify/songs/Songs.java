package spotify.songs;

import java.io.Serializable;
import java.util.ArrayList;

public class Songs implements Serializable{
    
    private ArrayList<Song> songs = new ArrayList<>();
    
    public ArrayList<Song> getSongs() {
        
        return songs;
    }
}
