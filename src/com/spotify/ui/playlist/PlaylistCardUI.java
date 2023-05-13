package com.spotify.ui.playlist;

import com.spotify.contracts.IPlaylistClickCallback;
import com.spotify.fonts.Fonts;
import com.spotify.playlists.Playlist;
import com.spotify.swing.CirclePanel;
import com.spotify.ui.main.PlayerUI;

public class PlaylistCardUI extends CirclePanel {

    private IPlaylistClickCallback callback;
    private PlayerUI player;
    
    public PlaylistCardUI(Playlist playlist) {
        super(10);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblArtists = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 24, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pn1.png"))); // NOI18N

        lblTitle.setFont(Fonts.getSpotifyBoldFont(20f)
        );
        lblTitle.setText("Daily Mix 1");

        lblArtists.setFont(Fonts.getSpotifyMediumFont(15f)
        );
        lblArtists.setText("Artists...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblArtists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArtists, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setCallback(IPlaylistClickCallback callback, PlayerUI player) {
        
        this.callback = callback;
        this.player = player;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblArtists;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
