package com.spotify.ui.main;

import com.spotify.playlists.PlaylistSerializer;
import com.spotify.fonts.Fonts;
import com.spotify.ui.playlist.PlaylistListUI;
import java.util.ArrayList;
import com.spotify.contracts.IPlaylistClickCallback;
import com.spotify.main.Spotify;
import com.spotify.ui.playlist.PlaylistCardUI;
import java.awt.Dimension;

public class SpotifyUI extends javax.swing.JFrame implements IPlaylistClickCallback {

    PlaylistSerializer playlists = new PlaylistSerializer();
    ArrayList<PlaylistListUI> playlistList;
    ArrayList<PlaylistCardUI> playlistCard;
    PlayerUI player;
    
    public SpotifyUI(PlaylistSerializer playlist, PlayerUI player) {
        
        playlistList = playlists.getPlaylistList();
        playlistCard = playlists.getPlaylistCard();
        this.player = player;
        
        initComponents();
        displayPlayer();
        displayPlaylistList();
        displayPlaylistCard();
        setLocationRelativeTo(null);
    }
    
    public SpotifyUI(PlaylistSerializer playlist) {
        
        playlistList = playlists.getPlaylistList();
        playlistCard = playlists.getPlaylistCard();
        
        initComponents();
        displayPlayer();
        displayPlaylistList();
        displayPlaylistCard();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        panelPlayer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblGreet = new javax.swing.JLabel();
        panelTopPL = new javax.swing.JPanel();
        panelPlaylistCard = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1010, 620));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 280;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        panelPlayer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1010;
        gridBagConstraints.ipady = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelPlayer, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = 244;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");

        jPanel4.setBackground(new java.awt.Color(18, 18, 18));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel5.setBackground(new java.awt.Color(18, 18, 18));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(18, 18, 18));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGreet.setFont(Fonts.getSpotifyBoldFont(30f)
        );
        lblGreet.setForeground(new java.awt.Color(255, 255, 255));
        lblGreet.setText("Good afternoon");
        lblGreet.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblGreet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(lblGreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 329, 45));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 60));

        panelTopPL.setBackground(new java.awt.Color(18, 18, 18));
        panelTopPL.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 10));
        jPanel5.add(panelTopPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 760, 240));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -35;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jPanel5, gridBagConstraints);

        panelPlaylistCard.setLayout(new java.awt.GridLayout(1, 0, 5, 5));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 785;
        gridBagConstraints.ipady = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(panelPlaylistCard, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(Fonts.getSpotifyBoldFont(20f)
        );
        jLabel1.setText("Made For You");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        jPanel3.add(jLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 675;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel4.add(jPanel3, gridBagConstraints);

        jScrollPane2.setViewportView(jPanel4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 754;
        gridBagConstraints.ipady = 524;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void onPlaylistCardClick() {
        
        dispose();
    }
        
    private void displayPlaylistList() {
        
        playlistList.forEach(p -> {
            panelTopPL.add(p);
            p.setCallback(this, player);
        });   
    }
    
    private void displayPlayer() {
        
        player = new PlayerUI();
        
        if (Spotify.PLAYING_SONG != null) 
            player.setupPlayer(Spotify.PLAYING_SONG);
        
        panelPlayer.add(player);
    }
    
    private void displayPlaylistCard() {
        
        playlistCard.subList(0, 3).forEach(p -> {
            p.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
            p.setSize(p.getWidth(), p.getHeight() + 300);
            panelPlaylistCard.add(p);
            p.setCallback(this, player);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGreet;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelPlaylistCard;
    private javax.swing.JPanel panelTopPL;
    // End of variables declaration//GEN-END:variables
}
