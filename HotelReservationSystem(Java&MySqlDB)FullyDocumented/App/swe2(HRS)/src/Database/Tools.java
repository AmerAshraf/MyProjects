package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tools {
  private static String url = "";
    private static Connection con;
    
    private static void setConnection(){
        try {
            setURL();
            con = DriverManager.getConnection(url,"root",""); // root is the user
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static boolean runNonQuery(String sqlStatement){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            stmt.execute(sqlStatement); //execute: is implement from string written in func
            con.close();
            return true;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
    
    private static void setURL(){
        url = "jdbc:mysql://localhost:3306/hrs"  // to arrive database
              + "?useUnicode=true&characterEncoding=UTF-8"; // unicode to accebt arabic
    }
}
