package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Adminstration {

    protected String UserName;
    protected String Password;

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
    
    
    
    public  int Login(String User_Name , String Pass_word){
        
        
        Scanner ReaderE = null;
        
        try {
            System.out.println("Reading ! From " + "Emp.txt");
            File PathE = new File("Emp.txt");

            ReaderE = new Scanner(PathE);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

            while (ReaderE.hasNext()) {

                
                String LineE = ReaderE.nextLine();
                String[] sepratedE = LineE.split("@");
                
                // 20140011@Ahmed@Ali@20@2@3.5@CS@STU_1@12345678@
                
                
                if (sepratedE[0].equals(User_Name) && sepratedE[1].equals(Pass_word)) {
                    
                    System.out.println("ok");
                    
                        return 1; 
                        
                }
                 
            }
            System.out.println("no");
            
            
            //------------------------------------------
            
            Scanner ReaderA = null;
        try {
            System.out.println("Reading ! From " + "Admin");
            File PathA = new File("Admin.txt");

            ReaderA = new Scanner(PathA);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

            while (ReaderA.hasNext()) {

                
                String LineA = ReaderA.nextLine();
                String[] sepratedA = LineA.split("@");
                
                // 20140011@Ahmed@Ali@20@2@3.5@CS@STU_1@12345678@
                
                
                if (sepratedA[0].equals(User_Name) && sepratedA[1].equals(Pass_word)) {
                    System.out.println("ook");
                    return 2;
                    
                }
            }
            System.out.println("noo");
            return -1;
        
    
    
}
}
