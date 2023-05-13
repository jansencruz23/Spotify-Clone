package com.spotify.ui.auth;

import com.spotify.fonts.Fonts;
import com.spotify.swing.RoundedButton;
import com.spotify.swing.CirclePanel;
import com.spotify.auth.io.Register;
import java.awt.Color;
import javax.swing.JOptionPane;
import com.spotify.ui.auth.LoginUI;

public class RegisterUI extends javax.swing.JFrame {

    Register register = new Register();
    
    String username;
    String password;
    String confirmPW;
    
    public RegisterUI() {
        
        initComponents();        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new CirclePanel(20, new Color(20, 20, 20));
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmPW = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRegister = new RoundedButton("Sign up");
        txtPassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(51, 51, 51));
        txtUsername.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        txtUsername.setForeground(new java.awt.Color(184, 184, 184));
        txtUsername.setText("Enter your username.");
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 0, 0));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 330, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo w name.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 75));

        jLabel2.setFont(Fonts.getSpotifyBoldFont(30f)
        );
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign up for free");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 490, 42));

        jLabel3.setFont(Fonts.getSpotifyBoldFont(30f)
        );
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("to start listening.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 490, 42));

        jLabel4.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("What's your username?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 230, 400, -1));

        jLabel5.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign up with your username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 490, -1));

        txtConfirmPW.setBackground(new java.awt.Color(51, 51, 51));
        txtConfirmPW.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        txtConfirmPW.setForeground(new java.awt.Color(184, 184, 184));
        txtConfirmPW.setText("Confirm your password.");
        txtConfirmPW.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 0, 0));
        jPanel1.add(txtConfirmPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 330, 40));

        jLabel6.setFont(Fonts.getSpotifyMediumFont(13f));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Confirm your password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 390, 400, -1));

        lblLogin.setFont(Fonts.getSpotifyBoldFont(13)
        );
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Log in");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 540, 90, -1));

        jLabel8.setFont(Fonts.getSpotifyMediumFont(13)
        );
        jLabel8.setForeground(new java.awt.Color(151, 149, 132));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Have an account?");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 540, 110, -1));

        btnRegister.setBackground(new java.awt.Color(30, 215, 96));
        btnRegister.setFont(Fonts.getSpotifyMediumFont(15f)
        );
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Sign up");
        btnRegister.setBorder(null);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 475, 110, 45));

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setFont(Fonts.getSpotifyMediumFont(13f)
        );
        txtPassword.setForeground(new java.awt.Color(184, 184, 184));
        txtPassword.setText("Create a password.");
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 0, 0));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 330, 40));

        jLabel9.setFont(Fonts.getSpotifyMediumFont(13f));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Create a password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 310, 400, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 490, 580));

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        getContentPane().add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean confirmPassword() {
        
        if (password.equals(confirmPW))
            return true;
        
        return false;
    }
    
    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        
        this.dispose();
        new LoginUI().setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
                
        username = txtUsername.getText();
        password = txtPassword.getText();
        confirmPW = txtConfirmPW.getText();
        
        if (username.contains(" ") || password.contains(" "))
             JOptionPane.showMessageDialog(null, "Username cannot contain spaces");
        
        else if (register.isUserExisting(username))
            JOptionPane.showMessageDialog(null, "Username already exists");
        
        else {
            
            if (confirmPassword()) {
                register.registerUser(username, password);
                
                this.dispose();
                new LoginUI().setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Passwords do not match");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtConfirmPW;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
