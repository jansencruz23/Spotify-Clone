package spotify.run;

import com.formdev.flatlaf.FlatLightLaf;
import spotify.ui.login.LoginUI;
import spotify.ui.main.SpotifyUI;

public class Main {
    
        public static void main(String args[]) {
        
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpotifyUI().setVisible(true);
            }
        });
    }
}
