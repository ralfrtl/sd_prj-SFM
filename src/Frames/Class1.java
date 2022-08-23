
package Frames;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Vector;

class Class1 {
    
    public static void main(String[] args) throws IOException {

//        Vector<String> Available_Devices=new Vector<>();
//        String myip=InetAddress.getLocalHost().getHostAddress();
//        String mynetworkips=new String();
//
//        for(int i=myip.length();i>0;--i){
//            if(myip.charAt(i-1)=='.'){
//                 mynetworkips=myip.substring(0,i);
//                 break; 
//            }
//        }
//        
//        System.out.println("My Device IP: " + myip+"\n");
//
//        System.out.println("Search log:");
//        for(int i=90;i<=254;++i){
//            try {
//                InetAddress addr = InetAddress.getByName(mynetworkips + new Integer(i).toString());
//                if (addr.isReachable(0)){
//                    System.out.println("Available: " + addr.getHostAddress());
//                    Available_Devices.add(addr.getHostAddress());
//                }
//            }catch (IOException ioex){}
//        }
//
//        System.out.println("\nAll Connected devices (" + Available_Devices.size() +"):");
//        for (String Available_Device : Available_Devices) {
//            System.out.println(Available_Device);
//        }
        
        System.out.println(InetAddress.getLocalHost().getHostName());

        try {
            String currentIP = InetAddress.getLocalHost().toString();
            int firstSeparator = currentIP.lastIndexOf("/");
            int lastSeparator = currentIP.lastIndexOf(".");
            String subnet = currentIP.substring(firstSeparator+1, lastSeparator+1);
            System.out.println("subnet: " + subnet);

            for (int i=99;i<254;i++){

                String host = subnet + i;

                if (InetAddress.getByName(host).isReachable(1000)){
                    System.out.println(InetAddress.getByName(host).getHostName());
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
        
}    

