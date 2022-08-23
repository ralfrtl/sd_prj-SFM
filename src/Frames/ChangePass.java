
package Frames;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class ChangePass extends javax.swing.JFrame {

    Connection con = DB.Connector();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
       
    Home home;
    
    int xMouse, yMouse, x, y;
    
    public ChangePass() {
        initComponents();
        BG.setBackground(new Color(0,155,52, 240));
        this.setBackground(new Color(0, 0, 0, 0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Border = new javax.swing.JPanel();
        NB = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        button_signout = new javax.swing.JButton();
        BG = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        panel_pass1 = new javax.swing.JPanel();
        input_pass1 = new javax.swing.JPasswordField();
        separator_pass1 = new javax.swing.JSeparator();
        lbl_2 = new javax.swing.JLabel();
        panel_pass2 = new javax.swing.JPanel();
        input_pass2 = new javax.swing.JPasswordField();
        separator_pass2 = new javax.swing.JSeparator();
        lbl_3 = new javax.swing.JLabel();
        panel_pass3 = new javax.swing.JPanel();
        input_pass3 = new javax.swing.JPasswordField();
        separator_pass3 = new javax.swing.JSeparator();
        panel_enterborder = new javax.swing.JPanel();
        button_enter = new javax.swing.JButton();

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
        label_logo.setText("Change Pass");
        label_logo.setPreferredSize(new java.awt.Dimension(200, 30));

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
                .addComponent(label_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
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
                    .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        Border.add(NB);
        NB.setBounds(2, 2, 346, 40);

        BG.setBackground(new java.awt.Color(0, 155, 52));
        BG.setPreferredSize(new java.awt.Dimension(346, 456));
        BG.setLayout(null);

        L1.setBackground(new java.awt.Color(255, 255, 255));
        L1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("Please fill-up the following fields ");
        BG.add(L1);
        L1.setBounds(10, 40, 330, 40);

        L2.setBackground(new java.awt.Color(255, 255, 255));
        L2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setText("to change your password.");
        BG.add(L2);
        L2.setBounds(10, 80, 330, 40);

        lbl_1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_1.setText("Current password:");
        lbl_1.setPreferredSize(new java.awt.Dimension(300, 30));
        BG.add(lbl_1);
        lbl_1.setBounds(20, 160, 300, 30);

        panel_pass1.setBackground(new Color(0,0,0,0));
        panel_pass1.setPreferredSize(new java.awt.Dimension(270, 33));
        panel_pass1.setLayout(null);

        input_pass1.setBackground(new java.awt.Color(255, 255, 255));
        input_pass1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        input_pass1.setForeground(new java.awt.Color(0, 155, 52));
        input_pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_pass1.setToolTipText("Password");
        input_pass1.setBorder(null);
        input_pass1.setCaretColor(new java.awt.Color(0, 155, 52));
        input_pass1.setPreferredSize(new java.awt.Dimension(270, 30));
        input_pass1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        input_pass1.setSelectionColor(new java.awt.Color(0, 188, 64));
        input_pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_pass1KeyPressed(evt);
            }
        });
        panel_pass1.add(input_pass1);
        input_pass1.setBounds(0, 0, 270, 30);

        separator_pass1.setBackground(new java.awt.Color(255, 255, 255));
        separator_pass1.setForeground(new java.awt.Color(255, 255, 255));
        separator_pass1.setOpaque(true);
        separator_pass1.setPreferredSize(new java.awt.Dimension(310, 10));
        panel_pass1.add(separator_pass1);
        separator_pass1.setBounds(0, 30, 270, 3);

        BG.add(panel_pass1);
        panel_pass1.setBounds(40, 200, 270, 33);

        lbl_2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_2.setText("New Password:");
        lbl_2.setPreferredSize(new java.awt.Dimension(300, 30));
        BG.add(lbl_2);
        lbl_2.setBounds(20, 240, 300, 30);

        panel_pass2.setBackground(new Color(0,0,0,0));
        panel_pass2.setLayout(null);

        input_pass2.setBackground(new java.awt.Color(255, 255, 255));
        input_pass2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        input_pass2.setForeground(new java.awt.Color(0, 155, 52));
        input_pass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_pass2.setToolTipText("Password");
        input_pass2.setBorder(null);
        input_pass2.setCaretColor(new java.awt.Color(0, 155, 52));
        input_pass2.setPreferredSize(new java.awt.Dimension(270, 30));
        input_pass2.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        input_pass2.setSelectionColor(new java.awt.Color(0, 188, 64));
        input_pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_pass2KeyPressed(evt);
            }
        });
        panel_pass2.add(input_pass2);
        input_pass2.setBounds(0, 0, 270, 30);

        separator_pass2.setBackground(new java.awt.Color(255, 255, 255));
        separator_pass2.setForeground(new java.awt.Color(255, 255, 255));
        separator_pass2.setOpaque(true);
        separator_pass2.setPreferredSize(new java.awt.Dimension(310, 10));
        panel_pass2.add(separator_pass2);
        separator_pass2.setBounds(0, 30, 270, 3);

        BG.add(panel_pass2);
        panel_pass2.setBounds(40, 280, 270, 33);

        lbl_3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_3.setText("Re-type:");
        lbl_3.setPreferredSize(new java.awt.Dimension(300, 30));
        BG.add(lbl_3);
        lbl_3.setBounds(20, 320, 300, 30);

        panel_pass3.setBackground(new Color(0,0,0,0));
        panel_pass3.setLayout(null);

        input_pass3.setBackground(new java.awt.Color(255, 255, 255));
        input_pass3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        input_pass3.setForeground(new java.awt.Color(0, 155, 52));
        input_pass3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_pass3.setToolTipText("Password");
        input_pass3.setBorder(null);
        input_pass3.setCaretColor(new java.awt.Color(0, 155, 52));
        input_pass3.setPreferredSize(new java.awt.Dimension(270, 30));
        input_pass3.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        input_pass3.setSelectionColor(new java.awt.Color(0, 188, 64));
        input_pass3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_pass3KeyPressed(evt);
            }
        });
        panel_pass3.add(input_pass3);
        input_pass3.setBounds(0, 0, 270, 30);

        separator_pass3.setBackground(new java.awt.Color(255, 255, 255));
        separator_pass3.setForeground(new java.awt.Color(255, 255, 255));
        separator_pass3.setOpaque(true);
        separator_pass3.setPreferredSize(new java.awt.Dimension(310, 10));
        panel_pass3.add(separator_pass3);
        separator_pass3.setBounds(0, 30, 270, 3);

        BG.add(panel_pass3);
        panel_pass3.setBounds(40, 360, 270, 33);

        panel_enterborder.setBackground(new java.awt.Color(0, 188, 64));
        panel_enterborder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panel_enterborder.setPreferredSize(new java.awt.Dimension(120, 30));
        panel_enterborder.setLayout(new java.awt.CardLayout());

        button_enter.setBackground(new java.awt.Color(255, 255, 255));
        button_enter.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        button_enter.setForeground(new java.awt.Color(255, 255, 255));
        button_enter.setText("Change");
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
        panel_enterborder.setBounds(190, 410, 120, 30);

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
        String pass1 = new String(input_pass1.getPassword());
        String pass2 = new String(input_pass2.getPassword());
        String pass3 = new String(input_pass3.getPassword());
        if ((pass1.isEmpty()==false) && (pass2.isEmpty()==false) && (pass3.isEmpty()==false)){
            try {
                String current_pass = "";
                ps = con.prepareStatement("SELECT * FROM tbl_user WHERE User_ID = ?");
                ps.setString(1, home.label_user.getName());
                
                rs = ps.executeQuery();
                if (rs.next()){
                    current_pass = rs.getString("User_Pass");
                    if (pass2.length()>=8) {
                        if (pass1.equals(current_pass)) {
                            if (pass2.equals(pass3)) {
                                ps = con.prepareStatement("UPDATE tbl_user SET User_Pass = ? WHERE User_ID = ?");
                                ps.setString(1, pass2);
                                ps.setString(2, home.label_user.getName());
                                ps.execute();
                                
                                ps = con.prepareStatement("INSERT INTO tbl_log (Log_Detail, User_ID) VALUES (?, ?)");
                                ps.setString(1, "You change your password.");
                                ps.setString(2, home.label_user.getName());
                                ps.execute();
                                
                                try {
                                    Formatter account = new Formatter(new File("src\\Account.txt"));
                                    account.format("%s %s", home.label_user.getText(), pass2);
                                    account.close();
                                } catch (FileNotFoundException fnfe) {
                                }
                                
                                JOptionPane.showMessageDialog(null, "Password change sucessfuly.", "", JOptionPane.INFORMATION_MESSAGE);
                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "New password didn't match.", "", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "You enter your current password incorectly.", "", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password must be atleast 8 characters.", "", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
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
            if (pass3.isEmpty()==true){
            separator_pass3.setBackground(new Color(255,51,51));input_pass3.requestFocus();}
            if (pass2.isEmpty()==true){
            separator_pass2.setBackground(new Color(255,51,51));input_pass2.requestFocus();}
            if (pass1.isEmpty()==true){
            separator_pass1.setBackground(new Color(255,51,51));input_pass1.requestFocus();}
        }
    }//GEN-LAST:event_button_enterActionPerformed

    private void input_pass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_pass2KeyPressed
        separator_pass2.setBackground(Color.white);
    }//GEN-LAST:event_input_pass2KeyPressed

    private void button_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signoutActionPerformed
        this.dispose();
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

    private void input_pass1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_pass1KeyPressed
        separator_pass1.setBackground(Color.white);
    }//GEN-LAST:event_input_pass1KeyPressed

    private void input_pass3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_pass3KeyPressed
        separator_pass3.setBackground(Color.white);
    }//GEN-LAST:event_input_pass3KeyPressed

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Border;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JPanel NB;
    private javax.swing.JButton button_enter;
    private javax.swing.JButton button_signout;
    private javax.swing.JPasswordField input_pass1;
    private javax.swing.JPasswordField input_pass2;
    private javax.swing.JPasswordField input_pass3;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JPanel panel_enterborder;
    private javax.swing.JPanel panel_pass1;
    private javax.swing.JPanel panel_pass2;
    private javax.swing.JPanel panel_pass3;
    private javax.swing.JSeparator separator_pass1;
    private javax.swing.JSeparator separator_pass2;
    private javax.swing.JSeparator separator_pass3;
    // End of variables declaration//GEN-END:variables

}
