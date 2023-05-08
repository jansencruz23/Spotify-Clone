package spotify.run;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import spotify.playlists.Playlists;
import spotify.ui.main.SpotifyUI;

public class Main {
    
    public static void main(String args[]) {

        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Playlists playlist = new Playlists();
                new SpotifyUI(playlist).setVisible(true);
            }
        });
    }
}
