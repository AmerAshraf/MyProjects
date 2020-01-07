package Classes;

public class Admin extends Adminstration{
    
    public Admin(){}
    
    //        Employee
    
    public boolean Add_Employee(String Name , String Gender , String Address,String DateOfBirth,String Qualification,String PhoneNo,String DateOfJoining,String UserName , String Password , String ID)
    {
        Employee x=new Employee(Name,Gender,Address , DateOfBirth,Qualification ,PhoneNo ,DateOfJoining ,UserName,Password ,ID);
        if(x.addEmployee())
    {   
        System.out.println(" \n Added Successfully .. ! ");
            return true;
    }   else {
        System.out.println(" Failed ");
            return false;
    }
    }
    public void updateEmployee(String oldID, Employee newEmployeeValues) {
        Employee x = new Employee();
        x.updateEmployee(oldID, newEmployeeValues);
        System.out.println("Updated Successfully ... !");
    }
    public void deleteEmployee(String Id) {
        Employee x = new Employee();
        x.deleteEmployee(Id);
        System.out.println("deleted Successfully ... !");
    }
    public void displayEmployee() {
        Employee x = new Employee();
        System.out.println(x.displayAllEmployee());
    }
    public void searchForEmployee(String id) {
        Employee x = new Employee();
        System.out.println(x.searchEmployee(id));
    }
    

//        Flight

public boolean AddNewFlights (String FlightId , String FlightName , String FlightSource , String FlightDestination , String DepartureTime , String ArrivalTime , String FlightClassA , String FlightClassB , String FlightClassC , String NomOfSeats , String AmountA, String AmountB, String AmountC){
         Flights x ;
         x = new Flights (FlightId , FlightName , FlightSource , FlightDestination , DepartureTime , ArrivalTime , FlightClassA ,FlightClassB,FlightClassC, NomOfSeats ,AmountA ,AmountB,AmountC);
      if (x.addFlights() ) {
            System.out.println( "Added Successfully ... !");
            return true;
        } else {
            System.out.println("Failed to insert ... !");
            return false;
        }
     }
     public void updateFlight(String Flight_ID, Flights newFlightValues) {
        Flights x = new Flights();
        x.updateFlights(Flight_ID, newFlightValues);
        System.out.println("Updated Successfully ... !");
    }
         public void deleteFlight(String Flight_ID) {
        Flights x = new Flights();
        x.deleteFligths(Flight_ID);
        System.out.println("deleted Successfully ... !");
    }
     public void displayFlights() {
        Flights x = new Flights();
        System.out.println(x.displayAllFlights()
        );
    }
     public void searchForFlight(String id) {
        Flights x = new Flights();
        System.out.println(x.searchFlight(id));
    }
     
}