package com.spotify.ui.playlist;

import com.spotify.playlists.Playlist;
import com.spotify.fonts.Fonts;
import com.spotify.main.Spotify;
import com.spotify.playlists.PlaylistSerializer;
import java.util.ArrayList;
import java.awt.Dimension;
import com.spotify.songs.Song;
import com.spotify.ui.main.PlayerUI;
import com.spotify.ui.main.SpotifyUI;
import com.spotify.ui.song.SongUI;

public class PlaylistUI extends javax.swing.JFrame {

    ArrayList<SongUI> songsUi = new ArrayList<>();
    ArrayList<Song> songs = new ArrayList<>();
    Playlist playlist;
    PlayerUI player;
    
    public PlaylistUI(Playlist playlist, PlayerUI player) {
        
        this.songs = playlist.getPlaylist();
        this.playlist = playlist;
        this.player = player;
        
        initComponents();
        displayPlaylistInfo();
        mapSongsToUI();
        displaySongs();
        displayPlayer();
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
        panelMain = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblPlaylistTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        panelBodyHeader = new javax.swing.JPanel();
        panelSongs = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        panelPlayer.setMinimumSize(new java.awt.Dimension(1010, 90));
        panelPlayer.setLayout(new java.awt.GridLayout(1, 0));

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

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");

        panelMain.setBackground(new java.awt.Color(18, 18, 18));
        panelMain.setLayout(new java.awt.GridBagLayout());

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        panelMain.add(lblBack, gridBagConstraints);

        panelHeader.setBackground(new java.awt.Color(18, 18, 18));
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl.png"))); // NOI18N
        panelHeader.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 190));

        lblPlaylistTitle.setFont(Fonts.getSpotifyBoldFont(40f));
        lblPlaylistTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaylistTitle.setText("Playlist");
        panelHeader.add(lblPlaylistTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 480, 70));

        jLabel3.setFont(Fonts.getSpotifyBoldFont(15f));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Playlist");
        panelHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 130, -1, -1));

        lblInfo.setFont(Fonts.getSpotifyBoldFont(15f));
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("Username");
        panelHeader.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelMain.add(panelHeader, gridBagConstraints);

        panelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBodyHeader.setBackground(new java.awt.Color(18, 18, 18));

        javax.swing.GroupLayout panelBodyHeaderLayout = new javax.swing.GroupLayout(panelBodyHeader);
        panelBodyHeader.setLayout(panelBodyHeaderLayout);
        panelBodyHeaderLayout.setHorizontalGroup(
            panelBodyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        panelBodyHeaderLayout.setVerticalGroup(
            panelBodyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        panelBody.add(panelBodyHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelSongs.setBackground(new java.awt.Color(18, 18, 18));
        panelSongs.setPreferredSize(new java.awt.Dimension(0, 70));
        panelSongs.setLayout(new java.awt.GridLayout(0, 1, 0, 3));
        panelBody.add(panelSongs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 770, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        panelMain.add(panelBody, gridBagConstraints);

        jScrollPane2.setViewportView(panelMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        
        this.dispose();
        PlaylistSerializer playlistz = new PlaylistSerializer();
        PlayerUI player = new PlayerUI();
        player.setupPlayer(Spotify.PLAYING_SONG);
        
        new SpotifyUI(playlistz, player).setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void displayPlaylistInfo() {
        
        lblIcon.setIcon(playlist.getIcon());
        lblPlaylistTitle.setText(playlist.getTitle());
    }
    
    private void displayPlayer() {
        
        panelPlayer.add(player);
    }
    
    private void mapSongsToUI() {
     
        songs.forEach(s -> songsUi.add(new SongUI(s, player)));
    }
    
    private void displaySongs() {
        
        songsUi.forEach(s -> {
            panelSongs.setPreferredSize(new Dimension(panelSongs.getWidth(), panelSongs.getHeight()));
            panelSongs.setSize(panelSongs.getWidth(), panelSongs.getHeight() + 56);
            
            panelSongs.add(s);
                
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPlaylistTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelBodyHeader;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelSongs;
    // End of variables declaration//GEN-END:variables
}
