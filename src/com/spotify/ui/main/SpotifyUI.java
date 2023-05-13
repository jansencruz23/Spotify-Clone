package com.spotify.ui.main;

import com.spotify.playlists.PlaylistSerializer;
import com.spotify.fonts.Fonts;
import com.spotify.ui.playlist.PlaylistListUI;
import java.util.ArrayList;
import com.spotify.contracts.IPlaylistClickCallback;
import com.spotify.ui.playlist.PlaylistCardUI;

public class SpotifyUI extends javax.swing.JFrame implements IPlaylistClickCallback {

    PlaylistSerializer playlists = new PlaylistSerializer();
    ArrayList<PlaylistListUI> playlistList;
    ArrayList<PlaylistCardUI> playlistCard;
    PlayerUI player;
    
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 280));

        panelPlayer.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1010, 90));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 250));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");

        jPanel4.setBackground(new java.awt.Color(18, 18, 18));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 735, 318));

        panelPlaylistCard.setLayout(new java.awt.GridLayout(1, 3, 15, 0));
        jPanel4.add(panelPlaylistCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 770, 150));

        jPanel3.setLayout(new java.awt.GridLayout());

        jLabel1.setFont(Fonts.getSpotifyBoldFont(20f)
        );
        jLabel1.setText("Made For You");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 1));
        jPanel3.add(jLabel1);

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 770, 60));

        jScrollPane2.setViewportView(jPanel4);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 770, 530));

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
        panelPlayer.add(player);
    }
    
    private void displayPlaylistCard() {
        
        playlistCard.subList(0, 3).forEach(p -> {
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
