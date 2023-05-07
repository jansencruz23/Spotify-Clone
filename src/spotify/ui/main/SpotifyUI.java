package spotify.ui.main;

import spotify.ui.playlist.PlaylistCardUI;
import helper.fonts.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import spotify.playlists.*;
import components.*;

public class SpotifyUI extends javax.swing.JFrame {

    Playlists playlists = new Playlists();
    ArrayList<PlaylistCardUI> playlistCards;
    
    public SpotifyUI() {
        
        playlistCards = playlists.getPlaylistCards();
        
        initComponents();
        initPlaylists();
        displayPlaylists();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblGreet = new javax.swing.JLabel();
        panelTopPL = new javax.swing.JPanel();

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1010, 90));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 210, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 770, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initPlaylists() {
        
        playlistCards.add(new PlaylistCardUI(new Playlist("Top Hits Philippines", new ImageIcon(getClass().getResource("/img/pl1.png"))), this));
        playlistCards.add(new PlaylistCardUI(new Playlist("This is Taylor Swift", new ImageIcon(getClass().getResource("/img/pl2.png"))), this));
        playlistCards.add(new PlaylistCardUI(new Playlist("Chillax Ka Muna!", new ImageIcon(getClass().getResource("/img/pl3.png"))), this));
        playlistCards.add(new PlaylistCardUI(new Playlist("Liked Songs", new ImageIcon(getClass().getResource("/img/pl4.png"))), this));
        playlistCards.add(new PlaylistCardUI(new Playlist("Today's Top Hits", new ImageIcon(getClass().getResource("/img/pl5.png"))), this));
        playlistCards.add(new PlaylistCardUI(new Playlist("Mang Kanor", new ImageIcon(getClass().getResource("/img/pl6.png"))), this));
    }
    
    private void displayPlaylists() {
        
        playlistCards.forEach(p -> panelTopPL.add(p));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGreet;
    private javax.swing.JPanel panelTopPL;
    // End of variables declaration//GEN-END:variables
}
