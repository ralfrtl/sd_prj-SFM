
package Frames;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class StartServer {
    
        public static ServerSocket server;
        static Socket connection;
        public static int port = 1000;
        
        static Login LI;
        static SignUp SU;
        
    public static void main(String[] args) {
        
        try {
            Scanner account = new Scanner(new File("src\\Account.txt"));
            LI = new Login();
            LI.setVisible(true);
        } catch (FileNotFoundException fnfe) {
            SU = new SignUp();
            SU.setVisible(true);
        }

        StartServer();
        
    }
    
    public static void StartServer(){
        
        try {
            server = new ServerSocket(port);
        } catch (IOException ex) {
            port++;
            StartServer();
        }
        
        System.out.println("Server Started");
        
        while (true) {  
            try {
                connection = server.accept();
            } catch (IOException e) {
                System.out.println(e);
            }
            
            try {
                
                String message = null;
                ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
                message = (String) input.readObject();
                if (message.substring(0, 5).equalsIgnoreCase("Send:")) { // If user is requesting for a file
                    sendData(message.substring(5));
                } else if (message.substring(0, 5).equalsIgnoreCase("Save:")) { // If user is saving a file here
                    getData(message.substring(5));
                } else if (message.substring(0, 5).equalsIgnoreCase("Load:")) { // If user is saving a file here
                    loadData(message.substring(5));
                }
                input.close();
                
            } catch (IOException e) {
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }
                
            try {
                connection.close();
            } catch (IOException e) {
                System.out.println(e);
            }

        }
         
    }
    public static void sendData(String path) throws FileNotFoundException, IOException{
        try {
            File transferFile = new File(path); // dir to send
            byte[] bytearray = new byte[(int) transferFile.length()];
            FileInputStream fin = new FileInputStream(transferFile);
            BufferedInputStream bin = new BufferedInputStream(fin);
            bin.read(bytearray, 0, bytearray.length);
            
            OutputStream output = connection.getOutputStream();
            
            output.write(bytearray, 0, bytearray.length);
            output.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void getData(String path) throws FileNotFoundException, IOException{
        try {
            InputStream input = connection.getInputStream();
            FileOutputStream fos = new FileOutputStream(path); //dir to save
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            int count;
            byte[] byte_data = new byte[1024];
            while ((count = input.read(byte_data)) > 0) {
                bos.write(byte_data, 0, count);
            }
            
            bos.flush();
            input.close();
            fos.close();
            bos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void loadData(String path) throws FileNotFoundException, IOException{
        try {
            File[] f = new File(path).listFiles();
            ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
            out.writeObject(f);
            out.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
