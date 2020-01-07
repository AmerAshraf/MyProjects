package Classes;

import java.awt.Component;
import java.awt.Container;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Manager_Tools {

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
    public void printReport(JTable table , String title){
     try {
            MessageFormat header = new MessageFormat(title);
            MessageFormat footer = new MessageFormat("page - {0}");
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } 
        catch (PrinterException ex) {
            System.err.println(ex);
        }
    }
    public void ClearTable(JTable table){
        DefaultTableModel model;
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

}
    

