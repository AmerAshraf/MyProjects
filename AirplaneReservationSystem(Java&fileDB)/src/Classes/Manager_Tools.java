package Classes;

import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Manager_Tools {

public boolean write(String Statement, String FilePath, boolean AppendType) {

        PrintWriter writter = null;
        try {
            System.out.print("\n Writting in ! " + FilePath);

            writter = new PrintWriter(new FileWriter(new File(FilePath), AppendType));
            writter.println(Statement);

            System.out.println(" Operation Success ");
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            writter.close();
        }
        return false;
    }


    public ArrayList<Object> read(String FilePath) {
        Scanner Reader = null;
        try {
            System.out.println("Reading ! From " + FilePath);
            File Path = new File(FilePath);

            Reader = new Scanner(Path);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        if (FilePath.equals("Emp.txt")) {

            ArrayList<Employee> Emp = new ArrayList<Employee>();
            Employee x;

            while (Reader.hasNext()) {

                x = new Employee();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                // 20140011@Ahmed@Ali@20@2@3.5@CS@STU_1@12345678@
                x.setUserName(seprated[0]);
                x.setPassword(seprated[1]);
                x.setName(seprated[2]);
                x.setGender(seprated[3]);
                x.setAddress(seprated[4]);
                x.setDateOfBirth(seprated[5]);
                x.setQualification(seprated[6]);
                x.setPhoneNo(seprated[7]);
                x.setDateOfJoining(seprated[8]);
                x.setID(seprated[9]);

                Emp.add(x);
            }

            return (ArrayList<Object>) (Object) Emp;
        }
        
         else if (FilePath.equals("Cust.txt")) {

            ArrayList<Customers> Cust = new ArrayList<Customers>();
            Customers x;

            while (Reader.hasNext()) {

                x = new Customers();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                // 1@Ayman@Ezzat@30@8000.0@Mon 12pm to 2pm@CS@Prof_1@12345678@
                x.setCustomer_id(seprated[0]);
                x.setFirst_name(seprated[1]);
                x.setLast_name(seprated[2]);
                x.setCustomer_gender(seprated[3]);
                x.setCustomer_DOB(seprated[4]);
                x.setCustomer_Phone(seprated[5]);
                x.setCustomer_Adress(seprated[6]);
                x.setPicPath(seprated[7]);
                
                Cust.add(x);
            }

            return (ArrayList<Object>) (Object) Cust;
            
            }else if (FilePath.equals("Fly.txt")) {

            ArrayList<Flights> Fly = new ArrayList<Flights>();
            Flights x;

            while (Reader.hasNext()) {

                x = new Flights();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                x.setFlightID(seprated[0]);
                x.setFlightSource(seprated[1]);
                x.setFlightDestination(seprated[2]);
                x.setFlightName(seprated[3]);
                x.setDepartureTime(seprated[4]);
                x.setArrivalTime(seprated[5]);
                x.setFlightClassA(seprated[6]);
                x.setFlightClassB(seprated[7]);
                x.setFlightClassC(seprated[8]);
                x.setNoOfSeats(seprated[9]);
                x.setAmountA(seprated[10]);
                x.setAmountB(seprated[11]);
                x.setAmountC(seprated[12]);

                
                Fly.add(x);
            }

            return (ArrayList<Object>) (Object) Fly;

        }else if (FilePath.equals("Tic.txt")) {

            ArrayList<Ticket> Tic = new ArrayList<Ticket>();
            Ticket x;

            while (Reader.hasNext()) {

                x = new Ticket();
                String Line = Reader.nextLine();
                String[] seprated = Line.split("@");

                
                x.setCustId(seprated[3]);
                x.setCustName(seprated[4]);
                x.setDepartureTime(seprated[2]);
                x.setDestination(seprated[1]);
                x.setSource(seprated[0]);
                x.setCustPath(seprated[5]);
                
                Tic.add(x);
            }

            return (ArrayList<Object>) (Object) Tic;
            
            }
            else{return null;}
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
    public void printReport(JTable table , String title){
     try {
            MessageFormat header = new MessageFormat(title);
            MessageFormat footer = new MessageFormat("page - {0}");
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } 
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
    public void ClearTable(JTable table){
        DefaultTableModel model;
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }
    public void ListTable(JTable table , String Name) {
        DefaultTableModel model;
        if(Name.equals("Fly")){
            
        model = (DefaultTableModel) table.getModel();
        
        Object rowData[] = new Object[13];
        Flights Fl = new Flights();
        ArrayList<Flights> Fly = new ArrayList<Flights>();
        
        Fly= Fl.listFlight();

        for (Flights x : Fly) {
            rowData[0] = x.getFlightID();
            rowData[1] = x.getFlightName();
            rowData[2] = x.getFlightSource();
            rowData[3] = x.getFlightDestination();
            rowData[4] = x.getDepartureTime();
            rowData[5] = x.getArrivalTime();
            rowData[6] = x.getNoOfSeats();
            rowData[7] = x.getFlightClassA();
            rowData[8] = x.getFlightClassB();
            rowData[9] = x.getFlightClassC();
            rowData[10] = x.getAmountA();
            rowData[11] = x.getAmountB();
            rowData[12] = x.getAmountC();
            
            

            model.addRow(rowData);
        }
    }
        else if(Name.equals("Cust")){
            model = (DefaultTableModel) table.getModel();
        
        Object rowData[] = new Object[7];
        Customers cu = new Customers();
        ArrayList<Customers> Cust = new ArrayList<Customers>();
        
        Cust= cu.listCustomer();

        for (Customers x : Cust) {
            rowData[0] = x.getCustomer_id();
            rowData[1] = x.getFirst_name();
            rowData[2] = x.getLast_name();
            rowData[3] = x.getCustomer_gender();
            rowData[4] = x.getCustomer_Phone();
            rowData[5] = x.getCustomer_Adress();
            rowData[6] = x.getCustomer_DOB();
            

            model.addRow(rowData);
        }
        }
        else if(Name.equals("Emp")){
            model = (DefaultTableModel) table.getModel();
        
        Object rowData[] = new Object[10];
        Employee cu = new Employee();
        ArrayList<Employee> Cust = new ArrayList<Employee>();
        
        Cust= cu.listEmployee();

        for (Employee x : Cust) {
            rowData[0] = x.getID();
            rowData[1] = x.getName();
            rowData[2] = x.getDateOfBirth();
            rowData[3] = x.getGender();
            rowData[4] = x.getPhoneNo();
            rowData[5] = x.getAddress();
            rowData[6] = x.getQualification();
            rowData[7] = x.getDateOfJoining();
            rowData[8] = x.getUserName();
            rowData[9] = x.getPassword();
            

            model.addRow(rowData);
        }
        }
    }

}
    

