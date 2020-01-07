package db;

import company_sql.tools;
import company_sql.tools.table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class go {
    
    private static String url = "";
    private static Connection con;
    
    
    private static void setURL(){
        url = "jdbc:mysql://localhost:3306/company"  // to arrive database
              + "?useUnicode=true&characterEncoding=UTF-8"; // unicode to accebt arabic
    }
    private static void setConnection(){
        try {
            setURL();
            con = DriverManager.getConnection(url,"root",""); // root is the user
        } catch (SQLException ex) {
            tools.msg(ex.getMessage());
        }
    }
    public static boolean checkUserAndPass(String username , String password){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strCheck = 
                    "select * from users where " +
                    "username='" + username + "'and "
                    + "pass='" + password +"'";
            stmt.executeQuery(strCheck); //executeQuery: is impelement from String 
            while( stmt.getResultSet().next() ){ // next: to stop statement in the first result show to loop other
                con.close();
                return true;
            }
            con.close();
        }
        catch(SQLException ex){
            tools.msg(ex.getMessage());
        }
        return false;
    }
    
    public static boolean runNonQuery(String sqlStatement){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            stmt.execute(sqlStatement); //execute: is implement from string written in func
            con.close();
            return true;
        }
        catch(SQLException ex){
            tools.msg(ex.getMessage());
            return false;
        }
    }
    
    public static String getAutoNumber(String tableName , String columnName){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strAuto = "select max(" + columnName + ")+1 as 'autonum'"
                    + " from " + tableName;
            stmt.executeQuery(strAuto);
            String Num = "";
            while (stmt.getResultSet().next()){
                Num = stmt.getResultSet().getString("autonum");  
            }
            con.close();
            if(Num == null || "".equals(Num) ){
                    return "1";
                }
                else{
                    return Num;
                }
        }
        catch(SQLException ex){
            tools.msg(ex.getMessage());
            return "0";
        }
    }
    
    public static table getTableData(String statement){// vedio 241
        tools t = new tools();
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(statement);  // other way for while(stmt.getresult().next())
            ResultSetMetaData rsmd = rs.getMetaData(); // to get num of columns
            int c = rsmd.getColumnCount();
            table table = t.new table(c);
            while(rs.next()){
                Object row[] = new Object[c];
                for(int i=0 ; i<c ; i++){
                    row[i]=rs.getString(i+1); // rs.getString : not index not start with zero it start with one
                }
                table.addrow(row);
            }
            con.close();
            return table;
        }
        catch(SQLException ex){
            tools.msg(ex.getMessage());
            return t.new table(0);
        }
    }
    
    public static void fillCombo(String tableName , String columnName , JComboBox combo){ // video 242
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            String strSelect = "select " + columnName + " from " + tableName;
            rs = stmt.executeQuery(strSelect);
            rs.last(); // to set the pointer on the last row
            int c = rs.getRow(); // get the row which pointer on it
            rs.beforeFirst(); // to set pointer before first when i write (.next) start from the first row
                             //but if i write "rs.first()" when i write (.next) start from the second row and i lost one row
            String values[] = new String[c];
            int i = 0;
            while(rs.next()){
                values[i]= rs.getString(1);
                i++;
            }
            con.close();
            combo.setModel(new DefaultComboBoxModel(values)); // to set values of row in comboBox
            
        }
        catch(SQLException ex){
            tools.msg(ex.getMessage());
        }
    }
    
    public static void fillToJTable(String tableNameOrselectStatement , JTable table){ // video 243
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            String strSelect;
            if( "select ".equals(tableNameOrselectStatement.substring(0, 7).toLowerCase()) ){ // "substring" to cut from character 0 to 7 from the user entered in func
                                                                                              // "tolowercase" to avoid if the user enter capital or small      
               strSelect=tableNameOrselectStatement;
            }
            else{
                strSelect = "select * from " + tableNameOrselectStatement;
            }
            rs = stmt.executeQuery(strSelect);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            DefaultTableModel model =(DefaultTableModel)table.getModel();
            Vector row = new Vector();
            model.setRowCount(0); // to remove all row in table which call from database
            while(rs.next()){ // to loop in all row
                row = new Vector(c); // to set num of columns
                for(int i=1; i<=c ; i++){ // to loop in all column
                    row.add(rs.getString(i)); //to add info of column
                    
                }
                model.addRow(row);
            }
            if(table.getColumnCount() != c){
                tools.msg("JTable columns count not equal to Query columns count \n JTable coulmns count is: "+ table.getColumnCount() + "\n Query columns count is: " + c);
            }
            con.close();
        }
        catch(SQLException ex){
            tools.msg(ex.getMessage());
        }
    }
    
}
