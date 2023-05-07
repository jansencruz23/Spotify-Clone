package spotify.ui.song;

import helper.fonts.*;
import spotify.songs.Song;

public class SongUI extends javax.swing.JPanel {
    
    public SongUI(Song song) {
        
        initComponents();
        lblIcon.setIcon(song.getIcon());
        lblTitle.setText(song.getTitle());
        lblArtist.setText(song.getArtist());
        lblDuration.setText(song.getDuration() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 33, 56));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s1.png"))); // NOI18N
        add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, 45, 45));

        lblArtist.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        lblArtist.setForeground(new java.awt.Color(255, 255, 255));
        lblArtist.setText("Dilaw");
        add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 210, -1));

        lblDuration.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        lblDuration.setForeground(new java.awt.Color(255, 255, 255));
        lblDuration.setText("4:01");
        add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, -1));

        lblTitle.setFont(Fonts.getSpotifyMediumFont(15f)
        );
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Uhaw (Tayong Lahat)");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 210, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}