package spotify.songs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Song {
    
    private int id;
    private File file;
    private String title;
    private String artist;
    private int duration;
    private ImageIcon icon;
    
    public Song(File file, String title, String artist, int duration, ImageIcon icon) {
        
        this.file = file;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.icon = icon;
    }
    
    public File getFile() {
        
        return file;
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
        
        try {
            
            FileInputStream fileInputStream = new FileInputStream(file);
            Player player = new Player(fileInputStream);
            System.out.println(title + " is playing...");
            player.play();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
