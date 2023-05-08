package spotify.ui.playlist;

import components.CirclePanel;
import helper.fonts.Fonts;
import java.awt.Color;
import spotify.contracts.IPlaylistClickCallback;
import spotify.playlists.Playlist;
import spotify.ui.main.SpotifyUI;

public class PlaylistCardUI extends CirclePanel {
    
    private Playlist playlist;
    private SpotifyUI main;
    
    private IPlaylistClickCallback callback;
    
    public PlaylistCardUI() {
        super(10);
    }

    public PlaylistCardUI(Playlist playlist) {
        super(10, new Color(46,42,44));
        
        this.playlist = playlist;
        //this.main = main;
        
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

    public void setCallback(IPlaylistClickCallback callback) {
        
        this.callback = callback;
    }
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        if (callback != null) {
            callback.onPlaylistCardClick();
            new PlaylistUI(playlist).setVisible(true);
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
