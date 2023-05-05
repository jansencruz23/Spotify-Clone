package spotify.login;

import spotify.io.Register;
import components.*;
import java.awt.Color;
import helper.fonts.*;
import spotify.registration.RegisterUI;

public class LoginUI extends javax.swing.JFrame {

    Register register = new Register();
    
    public LoginUI() {
        
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new CirclePanel(20, new Color(20, 20, 20));
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLogin = new RoundedButton("Log in");
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        jTextField1.setForeground(new java.awt.Color(184, 184, 184));
        jTextField1.setText("Username");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 0, 0));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 330, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo w name.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, 484, 75));

        jLabel2.setFont(Fonts.getSpotifyBoldFont(30f)
        );
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Millions of songs.");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 107, 484, 42));

        jLabel3.setFont(Fonts.getSpotifyBoldFont(30f)
        );
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Free on Spotify.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 147, 484, 42));

        jLabel4.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 250, 400, -1));

        jLabel5.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("To continue,  log in to Spotify.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 480, -1));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        jTextField2.setForeground(new java.awt.Color(184, 184, 184));
        jTextField2.setText("Password");
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 0, 0));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 330, 40));

        jLabel6.setFont(Fonts.getSpotifyMediumFont(13f));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 330, 400, -1));

        lblRegister.setFont(Fonts.getSpotifyBoldFont(13)
        );
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("Sign up free");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 90, -1));

        jLabel8.setFont(Fonts.getSpotifyMediumFont(13)
        );
        jLabel8.setForeground(new java.awt.Color(151, 149, 132));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("New to Spotify?");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 120, -1));

        btnLogin.setBackground(new java.awt.Color(30, 215, 96));
        btnLogin.setFont(Fonts.getSpotifyMediumFont(15f)
        );
        btnLogin.setText("Log in");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 110, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 35, 490, 550));

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        getContentPane().add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        
        this.dispose();
        new RegisterUI().setVisible(true);
    }//GEN-LAST:event_lblRegisterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblRegister;
    // End of variables declaration//GEN-END:variables
}
