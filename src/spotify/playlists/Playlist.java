package spotify.playlists;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import spotify.songs.Song;

public class Playlist {
    
    private ArrayList<Song> playlist = new ArrayList<>();
    
    private int id;
    private String title;
    private ImageIcon icon;
    
    public Playlist(String title, ImageIcon icon) {
        
        this.title = title;
        this.icon = icon;
    }
    
    public ArrayList<Song> getPlaylist() {
        
        return playlist;
    }
    
    public String getTitle() {
        
        return title;
    }
    
    public ImageIcon getIcon() {
        
        return icon;
    }
    
    public void addToPlaylist(Song song) {
        
        playlist.add(song);
    }
}
