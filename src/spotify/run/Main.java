package spotify.run;

import com.formdev.flatlaf.FlatDarkLaf;
import spotify.ui.login.LoginUI;

public class Main {
    
    public static void main(String args[]) {

        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }
}
