package com.spotify.ui.song;

import com.spotify.fonts.Fonts;
import com.spotify.songs.Song;

public class SongUI extends javax.swing.JPanel {
    
    private Song song;
    
    public SongUI(Song song) {
        
        this.song = song;
        
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
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(Fonts.getSpotifyMediumFont(14)
        );
        jLabel1.setForeground(new java.awt.Color(153, 167, 167));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 33, 56));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s1.png"))); // NOI18N
        add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, 45, 45));

        lblArtist.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        lblArtist.setForeground(new java.awt.Color(153, 167, 167));
        lblArtist.setText("Dilaw");
        add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 210, -1));

        lblDuration.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        lblDuration.setForeground(new java.awt.Color(153, 167, 167));
        lblDuration.setText("4:01");
        add(lblDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, -1));

        lblTitle.setFont(Fonts.getSpotifyMediumFont(15f)
        );
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Uhaw (Tayong Lahat)");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 210, -1));

        jButton1.setText("stop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        song.playSong();
    }//GEN-LAST:event_formMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        song.stopMusic();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
