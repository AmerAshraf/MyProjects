/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import mysudoku.Tool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aboud
 */
public class go {
 
    private static String url = "";
    private static Connection con;
    
    
    private static void setURL(){
        url = "jdbc:mysql://localhost:3306/mysudoku" // to arrive database
              + "?useUnicode=true&characterEncoding=UTF-8"; // unicode to accebt arabic
    }
    private static void setConnection(){
        try {
            setURL();
            con = DriverManager.getConnection(url,"root",""); // root is the user
        } catch (SQLException ex) {
            Tool.msg(ex.getMessage());
        }
    }
    public static boolean checkUserAndPass(String username , String password){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strCheck = 
                    "select * from players where " +
                    "username='" + username + "'and "
                    + "password='" + password +"'";
            stmt.executeQuery(strCheck); //executeQuery: is impelement from String 
            while( stmt.getResultSet().next() ){ // next: to stop statement in the first result show to loop other
                con.close();
                return true;
            }
            con.close();
        }
        catch(SQLException ex){
            Tool.msg(ex.getMessage());
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
            Tool.msg(ex.getMessage());
            return false;
        }
    }
    
}
