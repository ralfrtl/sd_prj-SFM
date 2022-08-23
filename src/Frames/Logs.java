
package Frames;

import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Logs extends javax.swing.JFrame {

    Connection con = DB.Connector();
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
       
    Home home;
    
    int xMouse, yMouse, x, y;
    
    public Logs() {
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
        scrollpane_log = new javax.swing.JScrollPane();
        table_log = new javax.swing.JTable();

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

        scrollpane_log.setBackground(new java.awt.Color(255, 255, 255));
        scrollpane_log.setBorder(null);
        scrollpane_log.setForeground(new java.awt.Color(255, 255, 255));
        scrollpane_log.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        table_log.setBackground(new java.awt.Color(255, 255, 255));
        table_log.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_log.setForeground(new java.awt.Color(0, 0, 0));
        table_log.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_log.setRowHeight(25);
        scrollpane_log.setViewportView(table_log);

        BG.add(scrollpane_log);
        scrollpane_log.setBounds(10, 10, 327, 435);

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
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
               new Logs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Border;
    private javax.swing.JPanel NB;
    private javax.swing.JButton button_signout;
    private javax.swing.JLabel label_logo;
    private javax.swing.JScrollPane scrollpane_log;
    private javax.swing.JTable table_log;
    // End of variables declaration//GEN-END:variables

    public void LoadData(int id){
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"DateTime", "Details"});
            Object[] row = new Object[2];
            ps = con.prepareStatement("SELECT * FROM tbl_log WHERE User_ID = ? ORDER BY DateCreated DESC");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                row[0] = rs.getString("DateCreated");
                row[1] = rs.getString("Log_Detail");
                model.addRow(row);
            }
            table_log.setModel(model);
        } catch (SQLException sqle) {
        }
    }
    
}
