package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {

    private String Source;
    private String Destination;
    private String CustName;
    private String CustId;
    private String DepartureTime;
    private String CustPath;

    public static ArrayList<Ticket> Tic = new ArrayList<Ticket>();
    Manager_Tools Mng = new Manager_Tools();
    
    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public String getCustId() {
        return CustId;
    }

    public void setCustId(String CustId) {
        this.CustId = CustId;
    }

    public String getCustPath() {
        return CustPath;
    }

    public void setCustPath(String CustPath) {
        this.CustPath = CustPath;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }
    
    public Ticket(){};
    
    public Ticket(String CId,String CName,String DTime,String Destination,String Source,String CustPath){
        
        this.CustId=CId;
        this.CustName=CName;
        this.DepartureTime=DTime;
        this.Destination=Destination;
        this.Source=Source;
        this.CustPath=CustPath;
    }
    
    private void loadFromFile() {
            Tic = (ArrayList<Ticket>) (Object) Mng.read("Tic.txt");
    }
    private void commitToFile() {
        Mng.write(Tic.get(0).getTicData(), "Tic.txt", false);
        for (int i = 1; i < Tic.size(); i++) {
            Mng.write(Tic.get(i).getTicData(), "Tic.txt", true);
        }
    }
    private String getTicData() {
        return this.CustId + "@" + this.CustName + "@" +this.DepartureTime + "@" + this.Destination + "@" + this.Source + "@" + this.CustPath;
    }
    @Override
    public String toString() {
        return "\nCustomer id : " + CustId + "and Name "+CustName  + "\n  departure time  "+ DepartureTime+ " I destination " + Destination
                + " \n source " +Source + "\t Ticket no:  " + CustPath;
    }
    private int getTicIndex(String TicNo){
        for (int i = 0; i < Tic.size(); i++)
            if(Tic.get(i).getCustPath().equals(TicNo))
                return i;
        
        return -1;
    }
    public boolean addTic() {
        if (this.Mng.write(this.getTicData(), "Tic.txt", true)) {
            return true;
        } else {
            return false;
        }
    }
    public void updateTic(String oldTicNo, Ticket x){
        loadFromFile();
        int index = getTicIndex(oldTicNo);
        Tic.set(index, x);
        commitToFile();
    }
    public void deleteTic(String TicNo){
        loadFromFile();
        int index = getTicIndex(TicNo);
        Tic.remove(index);
        commitToFile();
    } 
    public String displayAllTic() {
        loadFromFile();
        String S = "\nAll Tic Data:\n";
        for (Ticket x : Tic) {
            S = S + x.toString();
        }
        return S;
    }
    public String searchTic(String TicNo){
        loadFromFile();
        int index = getTicIndex(TicNo);
        if(index != -1)
            return "\nFound ...!" + Tic.get(index).toString();
        else 
            return "\nNot Found ...!";
    }
    public Ticket listTicket() {
        loadFromFile();
        
        return Tic.get(0);
    }
    
}
