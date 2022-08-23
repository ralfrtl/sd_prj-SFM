
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
        String MYIP="";
        InetAddress ip;
        String subnet = null;
        try {
            
            ip = InetAddress.getLocalHost();
            MYIP = ip.getHostAddress();
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(ip);
            subnet = networkInterface.getInterfaceAddresses().get(0).getNetworkPrefixLength()+"";
            int timeout=100;
            for (int i=1;i<255;i++){
                String host = subnet + "." + i;
                System.out.println(host);
                if (InetAddress.getByName(host).isReachable(timeout)){
                    System.out.println(host + " is reachable");
                }
            }
            
        }catch(Exception e){e.printStackTrace();}
        System.out.println(MYIP);
        
        
        
        
        
        
//        String my_ip = "";
//        try {
//            String ip;
//            Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
//            for (; n.hasMoreElements();){
//                NetworkInterface e = n.nextElement();
//
//                Enumeration<InetAddress> a = e.getInetAddresses();
//                for (; a.hasMoreElements();)
//                {
//                    InetAddress addr = a.nextElement();
//                    ip = ""+addr.getHostAddress();
////                    if ((ip.contains(":")==false)&&(!ip.equals("127.0.0.1"))){
//                    if (ip.contains(":")==false){
//                        my_ip = ""+addr.getHostAddress();
//                        break;
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println(my_ip);
        
//        Vector<String> container=new Vector<String>();
//        container.add("hello");
//        String m = MYIP;
//        for(int i=1;i<255;i++) {
//            try {
//                String n="192.168.1."+i;
//                new Thread(new client(n,container)).start();
//                System.out.println(i);
//            }catch(Exception e){e.printStackTrace();}
//        }

        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        asd.setColumns(20);
        asd.setRows(5);
        jScrollPane1.setViewportView(asd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
