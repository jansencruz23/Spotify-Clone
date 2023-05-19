package com.spotify.ui.main;

import com.spotify.main.*; 
import com.spotify.playlists.Playlist;
import com.spotify.playlists.PlaylistSerializer;
import com.spotify.songs.Song;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class PlayerUI extends javax.swing.JPanel {
    
    private Song song;
    private Player player = new Player();
    PlaylistSerializer playlists = new PlaylistSerializer();
    ArrayList<Playlist> playlistList = playlists.getPlaylist();
    Playlist playlist = playlistList.get(Spotify.PLAYLIST_ID);
    ArrayList<Song> songs = playlist.getPlaylist();
    
    public PlayerUI() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblShuffle = new javax.swing.JLabel();
        lblPrevious = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();

        setBackground(new java.awt.Color(8, 4, 4));
        setPreferredSize(new java.awt.Dimension(1010, 90));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl3.png"))); // NOI18N
        add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        lblArtist.setText("Arthur Nery");
        add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));

        lblTitle.setText("Binhi");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, -1));

        jPanel1.setBackground(new java.awt.Color(8, 4, 4));
        jPanel1.setLayout(new java.awt.GridLayout(1, 5));

        lblShuffle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShuffle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shuffle.png"))); // NOI18N
        lblShuffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShuffleMouseClicked(evt);
            }
        });
        jPanel1.add(lblShuffle);

        lblPrevious.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prev.png"))); // NOI18N
        lblPrevious.setPreferredSize(new java.awt.Dimension(18, 20));
        lblPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPreviousMouseClicked(evt);
            }
        });
        jPanel1.add(lblPrevious);

        lblPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        lblPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayMouseClicked(evt);
            }
        });
        jPanel1.add(lblPlay);

        lblNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });
        jPanel1.add(lblNext);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 270, 50));
    }// </editor-fold>//GEN-END:initComponents
    
    public void setupPlayer(Song song) {
        
        this.song = song;
        
        lblTitle.setText(song.getTitle());
        lblArtist.setText(song.getArtist());
        lblIcon.setIcon(song.getIcon());
    }
    
    public void changePlayIcon() {
        
        lblPlay.setIcon(new ImageIcon(getClass().getResource("/img/play.png")));
    }
    
    public void changePauseIcon() {
        
        lblPlay.setIcon(new ImageIcon(getClass().getResource("/img/pause.png")));
    }
    
    public void changeShuffleOnIcon() {
        
        lblShuffle.setIcon(new ImageIcon(getClass().getResource("/img/shuffle2.png")));
    }
    
    public void changeShuffleOffIcon() {
        
        lblShuffle.setIcon(new ImageIcon(getClass().getResource("/img/shuffle.png")));
    }
    
    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
                
        if (Spotify.IS_PLAYING)
            changePlayIcon();
        else
            changePauseIcon();
        
        player.playMusic(song);
    }//GEN-LAST:event_lblPlayMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
                      
        Song nextSong = player.playNext(playlist, song);
        
        setupPlayer(nextSong);
        changePauseIcon();
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPreviousMouseClicked
       
        Song prevSong = player.playPrevious(playlist, song);
        
        setupPlayer(prevSong);
        changePauseIcon();
    }//GEN-LAST:event_lblPreviousMouseClicked

    private void lblShuffleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShuffleMouseClicked
        
        if (Spotify.IS_SHUFFLED) {
            changeShuffleOffIcon();
            Spotify.IS_SHUFFLED = false;
        }
        else {
            changeShuffleOnIcon();
            Spotify.IS_SHUFFLED = true;
        }
        
        System.out.println(Spotify.IS_SHUFFLED);
    }//GEN-LAST:event_lblShuffleMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblPrevious;
    private javax.swing.JLabel lblShuffle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

}
