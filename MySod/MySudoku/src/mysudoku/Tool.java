
package mysudoku;

import java.awt.Component;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Aboud
 */
public class Tool {
    
    public static void msg(String message){
    JOptionPane.showMessageDialog(null, message);
}
public static boolean confirmMsg(String message){
    int msgC = JOptionPane.showConfirmDialog(null, message); // showConfirmDialog: it return number (int)
    if (msgC == JOptionPane.YES_OPTION){ // .YES_OPTION too know the number was returned from "showConfirmDialog" and stored in msgC
        return true;
    }
    else{
        return false;
    }
}

public static void open_form(JFrame file){
    try {
        file.setLocationRelativeTo(null);
        file.setVisible(true);
    } catch (Exception ex) {
        Logger.getLogger(Tool.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public static void clear_text(Container form){
    for(Component c : form.getComponents()){
        if(c instanceof JTextField){
            JTextField txt = (JTextField)c;
            txt.setText("");
        }
        else if(c instanceof Container){
            clear_text((Container)c);
        }
    }
}
    
}
