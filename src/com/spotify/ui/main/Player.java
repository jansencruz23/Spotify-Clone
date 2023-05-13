package com.spotify.ui.main;

import com.spotify.playlists.PlaylistSerializer;
import com.spotify.songs.Song;
import com.spotify.songs.SongSerializer;

public class Player extends javax.swing.JPanel {

    public Player() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1010, 90));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl3.png"))); // NOI18N
        add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        jLabel1.setText("Arthur Nery");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));

        jLabel2.setText("Binhi");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, -1));

        lblPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s1.png"))); // NOI18N
        lblPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayMouseClicked(evt);
            }
        });
        add(lblPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
        
        PlaylistSerializer playlist = new PlaylistSerializer();
        //if (!Song.getThread().isAlive()) {
            //Song song = playlist.getPlaylist().get(0);
            //song.playSong();
        //}
    }//GEN-LAST:event_lblPlayMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblPlay;
    // End of variables declaration//GEN-END:variables
}
