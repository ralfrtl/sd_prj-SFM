
package Frames;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.filefilter.FileFileFilter;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        
//            SendFileList();
            
//            try {
//                ReceiveFileList();
//            } catch (IOException ex) {
//                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//            }

//        ArrangeFiles();
        
    }
    
    public void SendFileList(){
        try {
            
            ServerSocket server = new ServerSocket(1223);
            asd.setText(asd.getText()+"Server Started\n");
            Socket connection = server.accept();
            asd.setText(asd.getText()+"Connected.\n\n");
            
            File[] f = new File("D:/Desktop").listFiles();
            
            ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
            out.writeObject(f);
            out.flush();
            asd.setText(asd.getText()+"Sending: "+f.toString()+"\n");
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public void ReceiveFileList() throws IOException, ClassNotFoundException{
        
        Socket connection = new Socket("127.0.0.1", 1223);
        asd.setText(asd.getText()+"Connected.\n\n");
        
        File[] message;
                    
        ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
        message = (File[]) input.readObject();

        for (int i = 0; i < message.length; i++) {
            asd.setText(asd.getText()+message[i].getAbsolutePath()+"\n");
        }
        
    }
    
    public void ArrangeFiles(){
        File f = new File("D:/Desktop");
        File[] ff = f.listFiles((FileFilter) FileFileFilter.FILE);
        
        Arrays.sort(ff, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return Long.compare(f2.lastModified(), f1.lastModified()); // switch
            }
        });
        
        for (int i = 0; i < ff.length; i++) {
            asd.setText(asd.getText()+ff[i]+"\n");
        }
        for (File file : ff) {
            System.out.println(file.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        asd = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        asd.setColumns(20);
        asd.setRows(5);
        jScrollPane1.setViewportView(asd);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 350));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Border.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Shadow.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sys Img/Border.png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseExited

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea asd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
