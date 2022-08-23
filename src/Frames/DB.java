
package Frames;

import java.sql.*;
import javax.swing.*;

public class DB {
    
    static Connection con = null;
    
    public static Connection Connector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_file_management", "root", "");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Try:\n"
                    + "• Starting the database server\n"
                    + "• Checking if the database is available\n"
                    + "• Cheking if you're eligible to access the database", "Database error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
        
}
