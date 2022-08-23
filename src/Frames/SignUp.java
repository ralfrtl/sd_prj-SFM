
package Frames;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class SignUp extends javax.swing.JFrame {

    Connection con = DB.Connector();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    StartServer SS;
    
    int xMouse, yMouse, x, y;
    
    public SignUp() {
        initComponents();
        BG.setBackground(new Color(0,155,52, 230));
        this.setBackground(new Color(0, 0, 0, 0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Border = new javax.swing.JPanel();
        NB = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        button_minimize = new javax.swing.JButton();
        button_signout = new javax.swing.JButton();
        BG = new javax.swing.JPanel();
        lbl_1 = new javax.swing.JLabel();
        panel_user = new javax.swing.JPanel();
        input_user = new javax.swing.JTextField();
        separator_user = new javax.swing.JSeparator();
        lbl_2 = new javax.swing.JLabel();
        panel_pass = new javax.swing.JPanel();
        input_pass = new javax.swing.JPasswordField();
        separator_pass = new javax.swing.JSeparator();
        panel_enterborder = new javax.swing.JPanel();
        button_enter = new javax.swing.JButton();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File Manager");
        setBackground(new java.awt.Color(0, 102, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Sys Img/Logo/Logo.png")));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        Border.setBackground(new java.awt.Color(255, 255, 255));
        Border.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Border.setOpaque(false);
        Border.setPreferredSize(new java.awt.Dimension(350, 500));
        Border.setLayout(null);

        NB.setBackground(new java.awt.Color(8, 65, 26));
        NB.setPreferredSize(new java.awt.Dimension(346, 40));

        label_logo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_logo.setForeground(new java.awt.Color(255, 255, 255));
        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Folder.png"))); // NOI18N
        label_logo.setText("File Manager");
        label_logo.setPreferredSize(new java.awt.Dimension(200, 30));

        button_minimize.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        button_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Minimize.png"))); // NOI18N
        button_minimize.setToolTipText("Minimize");
        button_minimize.setBorder(null);
        button_minimize.setBorderPainted(false);
        button_minimize.setContentAreaFilled(false);
        button_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_minimize.setFocusPainted(false);
        button_minimize.setFocusable(false);
        button_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_minimizeActionPerformed(evt);
            }
        });

        button_signout.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        button_signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Icon/Close.png"))); // NOI18N
        button_signout.setToolTipText("Close");
        button_signout.setBorder(null);
        button_signout.setBorderPainted(false);
        button_signout.setContentAreaFilled(false);
        button_signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_signout.setFocusPainted(false);
        button_signout.setFocusable(false);
        button_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_signoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NBLayout = new javax.swing.GroupLayout(NB);
        NB.setLayout(NBLayout);
        NBLayout.setHorizontalGroup(
            NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NBLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(label_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(button_minimize)
                .addGap(10, 10, 10)
                .addComponent(button_signout)
                .addContainerGap())
        );
        NBLayout.setVerticalGroup(
            NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NBLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(NBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_signout)
                    .addComponent(button_minimize)
                    .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        Border.add(NB);
        NB.setBounds(2, 2, 346, 40);

        BG.setBackground(new java.awt.Color(0, 155, 52));
        BG.setPreferredSize(new java.awt.Dimension(346, 456));
        BG.setLayout(null);

        lbl_1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_1.setText("Username:");
        lbl_1.setPreferredSize(new java.awt.Dimension(300, 30));
        BG.add(lbl_1);
        lbl_1.setBounds(23, 250, 300, 30);

        panel_user.setBackground(new Color(0,0,0,0));
        panel_user.setLayout(null);

        input_user.setBackground(new java.awt.Color(255, 255, 255));
        input_user.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        input_user.setForeground(new java.awt.Color(0, 155, 52));
        input_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_user.setToolTipText("Username");
        input_user.setBorder(null);
        input_user.setCaretColor(new java.awt.Color(0, 155, 52));
        input_user.setPreferredSize(new java.awt.Dimension(270, 30));
        input_user.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        input_user.setSelectionColor(new java.awt.Color(0, 188, 64));
        input_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_userActionPerformed(evt);
            }
        });
        input_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_userKeyPressed(evt);
            }
        });
        panel_user.add(input_user);
        input_user.setBounds(0, 0, 270, 30);

        separator_user.setBackground(new java.awt.Color(255, 255, 255));
        separator_user.setForeground(new java.awt.Color(255, 255, 255));
        separator_user.setOpaque(true);
        separator_user.setPreferredSize(new java.awt.Dimension(310, 10));
        panel_user.add(separator_user);
        separator_user.setBounds(0, 30, 270, 3);

        BG.add(panel_user);
        panel_user.setBounds(38, 290, 270, 33);

        lbl_2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_2.setText("Password:");
        lbl_2.setPreferredSize(new java.awt.Dimension(300, 30));
        BG.add(lbl_2);
        lbl_2.setBounds(23, 330, 300, 30);

        panel_pass.setBackground(new Color(0,0,0,0));
        panel_pass.setLayout(null);

        input_pass.setBackground(new java.awt.Color(255, 255, 255));
        input_pass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        input_pass.setForeground(new java.awt.Color(0, 155, 52));
        input_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_pass.setToolTipText("Password");
        input_pass.setBorder(null);
        input_pass.setCaretColor(new java.awt.Color(0, 155, 52));
        input_pass.setPreferredSize(new java.awt.Dimension(270, 30));
        input_pass.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        input_pass.setSelectionColor(new java.awt.Color(0, 188, 64));
        input_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_passActionPerformed(evt);
            }
        });
        input_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_passKeyPressed(evt);
            }
        });
        panel_pass.add(input_pass);
        input_pass.setBounds(0, 0, 270, 30);

        separator_pass.setBackground(new java.awt.Color(255, 255, 255));
        separator_pass.setForeground(new java.awt.Color(255, 255, 255));
        separator_pass.setOpaque(true);
        separator_pass.setPreferredSize(new java.awt.Dimension(310, 10));
        panel_pass.add(separator_pass);
        separator_pass.setBounds(0, 30, 270, 3);

        BG.add(panel_pass);
        panel_pass.setBounds(38, 370, 270, 33);

        panel_enterborder.setBackground(new java.awt.Color(0, 188, 64));
        panel_enterborder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panel_enterborder.setPreferredSize(new java.awt.Dimension(120, 30));
        panel_enterborder.setLayout(new java.awt.CardLayout());

        button_enter.setBackground(new java.awt.Color(255, 255, 255));
        button_enter.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        button_enter.setForeground(new java.awt.Color(255, 255, 255));
        button_enter.setText("Finish");
        button_enter.setToolTipText("Sign In");
        button_enter.setBorder(null);
        button_enter.setBorderPainted(false);
        button_enter.setContentAreaFilled(false);
        button_enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_enter.setPreferredSize(new java.awt.Dimension(120, 30));
        button_enter.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        button_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_enterActionPerformed(evt);
            }
        });
        panel_enterborder.add(button_enter, "card2");

        BG.add(panel_enterborder);
        panel_enterborder.setBounds(190, 415, 120, 30);

        L1.setBackground(new java.awt.Color(255, 255, 255));
        L1.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("WELCOME!");
        BG.add(L1);
        L1.setBounds(40, 60, 270, 40);

        L2.setBackground(new java.awt.Color(255, 255, 255));
        L2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setText("Let's start by setting your username and ");
        BG.add(L2);
        L2.setBounds(10, 150, 330, 40);

        L3.setBackground(new java.awt.Color(255, 255, 255));
        L3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        L3.setForeground(new java.awt.Color(255, 255, 255));
        L3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L3.setText("password to secure your files.");
        BG.add(L3);
        L3.setBounds(10, 170, 330, 40);

        Border.add(BG);
        BG.setBounds(2, 42, 346, 456);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_enterActionPerformed
        String pass = new String(input_pass.getPassword());
        if ((input_user.getText().isEmpty()==false) && (pass.isEmpty()==false)){
            try {
                int match = 0;
                ps = con.prepareStatement("SELECT * FROM tbl_user WHERE User_Name = ?");
                ps.setString(1, input_user.getText());
                rs = ps.executeQuery();
                if (rs.next()){
                    match++;
                }
                if (match==0) {
                    if (pass.length()>=8){
                        String my_ip = "";
                        try {
                            String ip;
                            Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
                            for (; n.hasMoreElements();) {
                                NetworkInterface e = n.nextElement();

                                Enumeration<InetAddress> a = e.getInetAddresses();
                                for (; a.hasMoreElements();) {
                                    InetAddress addr = a.nextElement();
                                    ip = "" + addr.getHostAddress();
                                    if (ip.contains(":") == false) {
                                        my_ip = "" + addr.getHostAddress();
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        ps = con.prepareStatement("INSERT INTO tbl_user (User_Name, User_Pass, User_IP, User_Port) VALUES (?, ?, ?, ?)");
                        ps.setString(1, input_user.getText());
                        ps.setString(2, pass);
                        ps.setString(3, my_ip);
                        ps.setInt(4, SS.port);
                        ps.execute();
                        
                        Formatter account = new Formatter("src\\Account.txt");
                        account.format("%s %s", input_user.getText(), pass);
                        account.close();
                        
                        ps = con.prepareStatement("SELECT * FROM tbl_user WHERE User_Name = ? AND User_Pass = ?");
                        ps.setString(1, input_user.getText());
                        ps.setString(2, pass);
                        rs = ps.executeQuery();
                        if (rs.next()) {
                            
                            Home home = new Home();
                            home.label_user.setText(input_user.getText());
                            home.label_user.setName("" + rs.getInt("User_ID"));
                            home.setVisible(true);

                            this.dispose();

                        }
                    }else {
                        JOptionPane.showMessageDialog(null, "Password must contain atleast 8 characters.", "Notice.", JOptionPane.INFORMATION_MESSAGE);
                        separator_pass.setBackground(new Color(255,51,51));input_pass.requestFocus();
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Username is already taken, please choose another one.", "Notice.", JOptionPane.INFORMATION_MESSAGE);
                    separator_user.setBackground(new Color(255,51,51));input_user.requestFocus();
                }   

            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            } finally {
                if (rs != null) {
                    try { rs.close(); } catch (SQLException e) {}
                }
                if (ps != null) {
                    try { ps.close(); } catch (SQLException e) {}
                }
            }
        }
        else{
            if (pass.isEmpty()==true){
            separator_pass.setBackground(new Color(255,51,51));input_pass.requestFocus();}
            if (input_user.getText().isEmpty()==true){
            separator_user.setBackground(new Color(255,51,51));input_user.requestFocus();}
        }
    }//GEN-LAST:event_button_enterActionPerformed

    private void input_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_passActionPerformed
        button_enterActionPerformed(evt);
    }//GEN-LAST:event_input_passActionPerformed

    private void input_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_userActionPerformed
        button_enterActionPerformed(evt);
    }//GEN-LAST:event_input_userActionPerformed

    private void input_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_userKeyPressed
        separator_user.setBackground(Color.white);
    }//GEN-LAST:event_input_userKeyPressed

    private void input_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_passKeyPressed
        separator_pass.setBackground(Color.white);
    }//GEN-LAST:event_input_passKeyPressed

    private void button_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_signoutActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse ,y - yMouse);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_formMouseReleased

    private void button_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_minimizeActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_button_minimizeActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Border;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JPanel NB;
    private javax.swing.JButton button_enter;
    private javax.swing.JButton button_minimize;
    private javax.swing.JButton button_signout;
    private javax.swing.JPasswordField input_pass;
    private javax.swing.JTextField input_user;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JPanel panel_enterborder;
    private javax.swing.JPanel panel_pass;
    private javax.swing.JPanel panel_user;
    private javax.swing.JSeparator separator_pass;
    private javax.swing.JSeparator separator_user;
    // End of variables declaration//GEN-END:variables

}
