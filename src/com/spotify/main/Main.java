package com.spotify.main;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.spotify.ui.auth.LoginUI;

public class Main {
    
    public static void main(String args[]) {

        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });
    }
}
