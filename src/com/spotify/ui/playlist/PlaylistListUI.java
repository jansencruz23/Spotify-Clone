package com.spotify.ui.playlist;

import com.spotify.swing.CirclePanel;
import com.spotify.fonts.Fonts;
import java.awt.Color;
import com.spotify.contracts.IPlaylistClickCallback;
import com.spotify.main.Spotify;
import com.spotify.playlists.Playlist;
import com.spotify.ui.main.PlayerUI;

public class PlaylistListUI extends CirclePanel {
    
    private Playlist playlist;
    private PlayerUI player;
    private IPlaylistClickCallback callback;
    
    public PlaylistListUI() {
        super(10);
    }

    public PlaylistListUI(Playlist playlist) {
        super(10, new Color(46,42,44));
        
        this.playlist = playlist;
        
        initComponents();
        
        lblIcon.setIcon(playlist.getIcon());
        lblTitle.setText(playlist.getTitle());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(58, 42, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl1.png"))); // NOI18N
        add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 65));

        lblTitle.setFont(Fonts.getSpotifyBoldFont(16f));
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Hot Hits Philippines");
        lblTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 10, 285, 50));
    }// </editor-fold>//GEN-END:initComponents

    public void setCallback(IPlaylistClickCallback callback, PlayerUI player) {
        
        this.callback = callback;
        this.player = player;
    }
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        if (callback != null) {
            callback.onPlaylistCardClick();
            Spotify.PLAYLIST_ID = playlist.getId();
            new PlaylistUI(playlist, player).setVisible(true);
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
