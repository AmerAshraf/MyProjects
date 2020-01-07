package company_sql;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class tools{

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
public static void create_folder(String name , String path){
    File f = new File(path + "/" + name);
    f.mkdir();
}
public static void create_folder(String name){
    File f = new File(name);
    f.mkdir();
}
public static void open_form(JFrame file){
    try {
        file.setLocationRelativeTo(null);
        Image img = ImageIO.read(tools.class.getResource("1.png"));
        file.setIconImage(img);
        file.setDefaultCloseOperation(2);
        file.getContentPane().setBackground(Color.white);
        file.setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(tools.class.getName()).log(Level.SEVERE, null, ex);
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
public static void creat_file(String name){
    try {
        File f = new File(name);
        f.createNewFile();
    } catch (IOException ex) {
        Logger.getLogger(tools.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public static void create_files(String names[]){
    for(String x : names){
        creat_file(x);
    }
}
public static void creat_custom_file (String name , Object data[]){
    try {
        PrintWriter p = new PrintWriter(name + ".txt");
        for (Object obj : data){
            p.println(obj);
        }
        p.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(tools.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public static void creat_custom_files (String names[] , Object data[][]){
    for(int x=0; x<names.length; x++){
        creat_custom_file(names[x], data[x]);
    }
}
public static Object input(Object in){
    Object obj = JOptionPane.showInputDialog(in);
    return obj;
}
public static String get_number(String in){
    String val = "";
    for(char x : in.toCharArray()){
        if(x=='0' || x=='1' || x=='2'
        || x=='3' || x=='4' || x=='5'
        || x=='6' || x=='7' || x=='8' 
        || x=='9'){
            val += x;
        }
    }
    return val;
}
public static String Remove_number(String in){
    String val = "";
    for(char x : in.toCharArray()){
        if( !(x=='0' || x=='1' || x=='2'
        || x=='3' || x=='4' || x=='5'
        || x=='6' || x=='7' || x=='8' 
        || x=='9')  ){
            val += x;
        }
    }
    return val;
}
public static void printscreen(String name , JFrame form){
    try {
        form.setState(1); // to dont show form in capture for screen
        Robot r = new Robot();
        Rectangle rec=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage img = r.createScreenCapture(rec);
        ImageIO.write(img,"jpg" , new File(name + ".jpg"));
        form.setState(0);
    } catch (Exception ex) {
        Logger.getLogger(tools.class.getName()).log(Level.SEVERE, null, ex);
    }
}
//-----------------------------------------------
public class CharByChar {
    String text;
    private String rev;
    String texts[];
    String textarr;
public CharByChar(String text){
   this.text=text; 
}
public CharByChar(String texts[]){
    this.texts=texts;
}
public void split (){
    for (char x : text.toCharArray()){
        System.out.println(x);
    }
}
public void inverse(){
    StringBuilder sb = new StringBuilder(text);
    rev = sb.reverse().toString();
    for (char c : rev.toCharArray()){
        System.out.println(c);
    }
}
public void print_string(){
    for(String y : texts){
        System.out.println(y);
    }
}
public String print_string_together(){
    for(String y : texts){
        textarr += y + " ";
    }
    return textarr;
}
}
//----------------------------------------------
public class table{
    public int columns;
    public Object item [][];
public table (int columns){
    this.columns=columns;
    item = new Object [0][columns];
}
public void addrow(Object row[]){
    Object temp[][] = item;
    item = new Object[item.length+1][columns];
    for (int x=0 ; x<temp.length ; x++){
        item[x]=temp[x];
    }
    item[item.length-1] = row;
}
public void print (){
    for(Object c[] : item){
        for(Object cc : c){
            System.out.print(cc + " ; ");
        }
        System.out.println();
    }
}
public void edit (int rowindex , int colindex ,Object newdata){
    item[rowindex][colindex]=newdata;
}
public void deleterow (int rowindex){
    Object tempp [][]= item;
    item = new Object[item.length -1][columns];
    int y = 0;
    for(int x = 0 ; x < tempp.length; x++){
        if(x != rowindex){
            item[y] = tempp[x];
            y++;
        }
        
    }
}
public Object getvalue(int rowindex , int colindex){
    Object g = item[rowindex][colindex];
    return g ;
}
public Object[] getrow(int rowindex){  
    return item[rowindex];
}
}
//---------------------------------
public class mergArray{
    public Object arr1[]; 
    public Object arr2[];
public mergArray (Object arr1[] , Object arr2[]){
    this.arr1=arr1;
    this.arr2=arr2;
}
public Object[] merg (){
    int a1=arr1.length;
    int a2=arr2.length;
    Object arr3[] = new Object[a1+a2];
    System.arraycopy(arr1, 0, arr3, 0, a1);
    System.arraycopy(arr2, 0, arr3, a1, a2);
    return arr3;
}
}

public static void setReport(JTable table){
            table.getTableHeader().setBackground(new Color (0,0,20));
        table.getTableHeader().setForeground(Color.white);
}

public static void printReport(JTable table , String title){
     try {
            MessageFormat header = new MessageFormat(title + "Report");
            MessageFormat footer = new MessageFormat("page - {0}");
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } 
        catch (Exception ex) {
            tools.msg(ex.getMessage());
        }
}

}