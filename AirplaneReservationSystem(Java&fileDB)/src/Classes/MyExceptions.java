
package Classes;

import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

public class MyExceptions extends Exception implements Serializable{
   
    public MyExceptions() {
        super();
    }

    public MyExceptions(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "My Exception";
    }
    
    
    int checkPositive(String x) {
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for " + x + " !"));
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Try Again :(");
            }
        } while (number <= 0);

        return number;
    }
   
    String checkEmail(String x) {
        String email;
        String a=" ";
        String b="@";
        String c="@";
        do {
            email =JOptionPane.showInputDialog("Enter Valid input for " + x + " !");
            if (!email.contains("@") || !email.contains(".") || a.equals(email.charAt(0)) || b.equals(email.charAt(0)) || c.equals(email.charAt(0))) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
            }
        } while (!email.contains("@") || !email.contains(".") || a.equals(email.charAt(0)) || b.equals(email.charAt(0)) || c.equals(email.charAt(0))  );
 
        return email;
    }
   
    String checkPassLength(String x) {
        String pass;
        do {
            pass = JOptionPane.showInputDialog("Enter more than 8 char for " + x + " !");
            if (pass.length() < 8) {
                JOptionPane.showMessageDialog(null, "Not valid Password length Try Again :(");
            }
        } while (pass.length() < 8);

        return pass;
    }

    
}

