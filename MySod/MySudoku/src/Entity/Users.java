/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import mysudoku.Tool;

/**
 *
 * @author Aboud
 */
public class Users {
    
    private String UserName;
    private String Password;

    
    private int Score;
    private String Email;
    
    
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
    
    public void add() {
        String strInsert = 
                "INSERT INTO players"
                + "(username, password, Score, email)"
                + " VALUES ('"
                + UserName+"','"
                + Password+"',"
                + Score+",'"
                + Email+"')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            Tool.msg("User is added");
        }
    }
    
    public void update(int id){
    
            String strInsert = 
                "UPDATE players SET Score=+"
                 +Score +" WHERE ID="
                 +id;
                
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            Tool.msg("Success");
        }
    }
    
    }
    

