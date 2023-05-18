package com.spotify.ui.main;

import com.spotify.main.Spotify;
import com.spotify.playlists.PlaylistSerializer;
import com.spotify.songs.Song;

public class PlayerUI extends javax.swing.JPanel {
    
    private Song song;
    
    public PlayerUI() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();

        setBackground(new java.awt.Color(8, 4, 4));
        setPreferredSize(new java.awt.Dimension(1010, 90));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl3.png"))); // NOI18N
        add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        lblArtist.setText("Arthur Nery");
        add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));

        lblTitle.setText("Binhi");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, -1));

        lblPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        lblPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayMouseClicked(evt);
            }
        });
        add(lblPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    public void setupPlayerUI(Song song) {
        
        this.song = song;
        
        lblTitle.setText(song.getTitle());
        lblArtist.setText(song.getArtist());
        lblIcon.setIcon(song.getIcon());
    }
    
    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
        
        PlaylistSerializer playlist = new PlaylistSerializer();

        if (Spotify.isPlaying) {
            song.pauseSong();
            //song.resumeSong(song.getTimestamp());
        }
        else {
            song.resumeSong();
            //song.pauseSong();
        }
        //if (!Song.getThread().isAlive()) {
            //Song song = playlist.getPlaylist().get(0);
            //song.playSong();
        //}
    }//GEN-LAST:event_lblPlayMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

}
