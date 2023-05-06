package spotify.songs;

import java.io.File;

public class Song {
    
    private File file;
    private String title;
    private String artist;
    private int duration;
    
    public Song(File file, String title, String artist, int duration) {
        
        this.file = file;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
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
}
