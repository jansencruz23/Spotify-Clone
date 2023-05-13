package com.spotify.main;

import com.formdev.flatlaf.FlatDarkLaf;
import com.spotify.ui.auth.LoginUI;

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
