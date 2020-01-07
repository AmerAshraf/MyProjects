package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Flights {
    
 private String FlightID ;
 private String FlightName ;
 private String FlightSource ;
 private String FlightDestination ;
 private String DepartureTime ;
 private String ArrivalTime ;
 private String FlightClassA;
 private String FlightClassB;
 private String FlightClassC;
 private String NoOfSeats;
 private String AmountA;
 private String AmountB;
 private String AmountC;

    public static ArrayList<Flights> Flights = new ArrayList<Flights>();
    Manager_Tools Mng = new Manager_Tools();

    public String getFlightID() {
        return FlightID;
    }

    public void setFlightID(String FlightID) {
        this.FlightID = FlightID;
    }

    public String getFlightName() {
        return FlightName;
    }

    public void setFlightName(String FlightName) {
        this.FlightName = FlightName;
    }

    public String getFlightSource() {
        return FlightSource;
    }

    public void setFlightSource(String FlightSource) {
        this.FlightSource = FlightSource;
    }

    public String getFlightDestination() {
        return FlightDestination;
    }

    public void setFlightDestination(String FlightDestination) {
        this.FlightDestination = FlightDestination;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public String getFlightClassA() {
        return FlightClassA;
    }

    public void setFlightClassA(String FlightClassA) {
        this.FlightClassA = FlightClassA;
    }

    public String getFlightClassB() {
        return FlightClassB;
    }

    public void setFlightClassB(String FlightClassB) {
        this.FlightClassB = FlightClassB;
    }

    public String getFlightClassC() {
        return FlightClassC;
    }

    public void setFlightClassC(String FlightClassC) {
        this.FlightClassC = FlightClassC;
    }

    public String getNoOfSeats() {
        return NoOfSeats;
    }

    public void setNoOfSeats(String NoOfSeats) {
        this.NoOfSeats = NoOfSeats;
    }

    public String getAmountA() {
        return AmountA;
    }

    public void setAmountA(String AmountA) {
        this.AmountA = AmountA;
    }

    public String getAmountB() {
        return AmountB;
    }

    public void setAmountB(String AmountB) {
        this.AmountB = AmountB;
    }

    public String getAmountC() {
        return AmountC;
    }

    public void setAmountC(String AmountC) {
        this.AmountC = AmountC;
    }

    public static ArrayList<Flights> getFlights() {
        return Flights;
    }

    
    public Flights() {}
    
    public Flights(String Id , String name , String source , String destination ,String deptime , String arrtime , String fclassA , String fclassB , String fclassC , String numofSeats , String amountA,String amountB,String amountC) {
    
        this.FlightID=Id;
        this.FlightName= name;
        this.FlightSource=source;
        this.FlightDestination=destination;
        this.DepartureTime=deptime;
        this.ArrivalTime=arrtime;
        this.FlightClassA=fclassA;
        this.FlightClassB=fclassB;
        this.FlightClassC=fclassC;
        this.NoOfSeats=numofSeats;
        this.AmountA=amountA;
        this.AmountB=amountB;
        this.AmountC=amountC;
    
    }
    
    
   
    
    
    
 
    private void loadFromFile() {
            Flights = (ArrayList<Flights>) (Object) Mng.read("Fly.txt");
    }
    private void commitToFile() {
        Mng.write(Flights.get(0).getFlightsData(), "Fly.txt", false);
        for (int i = 1; i < Flights.size(); i++) {
            Mng.write(Flights.get(i).getFlightsData(), "Fly.txt", true);
        }

    }
    private String getFlightsData() {
        return this.FlightID + "@" +this.FlightSource + "@" +this.FlightDestination + "@" +this.FlightName +  "@"  + this.DepartureTime + "@" + this.ArrivalTime+ "@" + this.FlightClassA + "@" + this.FlightClassB + "@" + this.FlightClassC + "@" +  this.NoOfSeats + "@" + this.AmountA + "@" + this.AmountB + "@" + this.AmountC ;
    }
    @Override
    public String toString() {
        return "\nThe flight id : " + FlightID + "Source "+FlightSource  + "\n  Destination  "+ FlightDestination+ " Flight Name: " + FlightName + " \n Departure Time " +DepartureTime + "\t ArrivalTime:  " + ArrivalTime + "\n Flight Class A:" + FlightClassA+ "\n Flight Class B:" + FlightClassB+ "\n Flight Class C:" + FlightClassC + "\n Number of Seats : " + NoOfSeats + "\t AmountA " + AmountA+ "\t AmountB " + AmountB+ "\t AmountC " + AmountC ;
    }
    
      private int getFlightsIndex(String FlightID){
        for (int i = 0; i < Flights.size(); i++)
            if(Flights.get(i).getFlightID().equals(FlightID))
                return i;
        
        return -1;
    }
        
     
     public boolean addFlights() {
        if (this.Mng.write(this.getFlightsData(), "Fly.txt", true)) {
            return true;
        } else {
            return false;
        }
    }
    public void updateFlights(String FlightID, Flights x){
        loadFromFile();
        int index = getFlightsIndex(FlightID);
        Flights.set(index, x);
        commitToFile();
    } 
    
    public void deleteFligths(String FlightID){
        loadFromFile();
        int index = getFlightsIndex(FlightID);
        Flights.remove(index);
        commitToFile();
    }
    public String displayAllFlights() {
        loadFromFile();
        String S = "\nAll Flights Data:\n";
        for (Flights x : Flights) {
            S = S + x.toString();
        }
        return S;
    }
    public Flights searchFlight(String id){
        Flights temp = new Flights("", "", "", "", "", "", "", "", "", "", "", "", "");
        loadFromFile();
        int index = getFlightsIndex(id);
        if(index != -1)
            return Flights.get(index);
        else 
            return temp;
    }
    public ArrayList<Flights> listFlight() {
        loadFromFile();
        return Flights;
    }
    //------------
    ArrayList<Flights> FlyD = new ArrayList<Flights>();
    ArrayList<Flights> tempD = new ArrayList<Flights>();
    private int getFlightsIndexByDest(String FlightDest){
        for (int i = 0; i < FlyD.size(); i++)
            if(FlyD.get(i).getFlightDestination().equals(FlightDest))
                return i;
        
        return -1;
    }
    public ArrayList<Flights> SearchFlightDest(String key) {
        
        Scanner Reader = null;
        try {
            System.out.println("Reading ! From " + "Fly.txt");
            File Path = new File("Fly.txt");

            Reader = new Scanner(Path);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
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

                if(seprated[2].equals(key)){
                FlyD.add(x);}
            }

            int index = getFlightsIndexByDest(key);
        if(index != -1)
            return FlyD;
        else 
            return tempD;
    }
}

