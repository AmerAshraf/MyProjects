package Classes;

import java.util.ArrayList;

public class Employee extends Adminstration{
    
    private String Name;
    private String Gender;
    private String Address;
    private String DateOfBirth;
    private String Qualification;
    private String PhoneNo;
    private String DateOfJoining;
    private String ID; 
    
    public static ArrayList<Employee> Emp = new ArrayList<Employee>();
    Manager_Tools Mng = new Manager_Tools();
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getDateOfJoining() {
        return DateOfJoining;
    }

    public void setDateOfJoining(String DateOfJoining) {
        this.DateOfJoining = DateOfJoining;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    
    public Employee(){}
    
    public Employee(String Name,String Gender,String Address,String DateOfBirth,String Qualification,String PhoneNo,String DateOfJoining,String UserName,String Password , String ID){
        
        this.Name=Name;
        this.Gender=Gender;
        this.Address=Address;
        this.DateOfBirth=DateOfBirth;
        this.Qualification=Qualification;
        this.PhoneNo=PhoneNo;
        this.DateOfJoining=DateOfJoining;
        this.UserName=UserName;
        this.Password=Password;
        this.ID= ID;
    }
    
    private void loadFromFile() {
            Emp = (ArrayList<Employee>) (Object) Mng.read("Emp.txt");
    }
    private void commitToFile() {
        Mng.write(Emp.get(0).getEmployeeData(), "Emp.txt", false);
        for (int i = 1; i < Emp.size(); i++) {
            Mng.write(Emp.get(i).getEmployeeData(), "Emp.txt", true);
        }
    }
    private String getEmployeeData() {
        return this.UserName + "@" + this.Password + "@" +this.Name + "@" + this.Gender + "@" + this.Address + "@" + this.DateOfBirth + "@" + this.Qualification + "@" + this.PhoneNo + "@" + this.DateOfJoining + "@" + this.ID;
    }
    @Override
    public String toString() {
        return "\nI'm Eng : " + Name + "I'm "+Gender  + "\n  I live in  "+ Address+ " I was born in " + DateOfBirth
                + " \n I'm " +Qualification + "\t MyPhone:  " + PhoneNo + "\n joined at " + DateOfJoining + "\n UserName : " + UserName + "\t Password: " + Password +  "\n"+ "and my ID:" + ID;
    }
    private int getEmployeeIndex(String id){
        for (int i = 0; i < Emp.size(); i++)
            if(Emp.get(i).getID().equals(id))
                return i;
        
        return -1;
    }
    public boolean addEmployee() {
        if (this.Mng.write(this.getEmployeeData(), "Emp.txt", true)) {
            return true;
        } else {
            return false;
        }
    }
    public void updateEmployee(String oldID, Employee x){
        loadFromFile();
        int index = getEmployeeIndex(oldID);
        Emp.set(index, x);
        commitToFile();
    }
    public void deleteEmployee(String id){
        loadFromFile();
        int index = getEmployeeIndex(id);
        Emp.remove(index);
        commitToFile();
    } 
    public String displayAllEmployee() {
        loadFromFile();
        String S = "\nAll Employee Data:\n";
        for (Employee x : Emp) {
            S = S + x.toString();
        }
        return S;
    }
    public Employee searchEmployee(String id){
        Employee temp = new Employee("", "", "", "", "", "", "", "", "", "");
        loadFromFile();
        int index = getEmployeeIndex(id);
        if(index != -1)
            return Emp.get(index);
        else 
            return temp;
    }
    public ArrayList<Employee> listEmployee() {
        loadFromFile();
        return Emp;
    }
    
                //   Customer
    
    public boolean AddNewCustomer(String id, String FirstName, String LastName, String Cgender,String Cdate_Of_Birth ,String Phone, String Caddress,String Path) {
        
        Customers x = new Customers (id, FirstName , LastName , Cgender , Cdate_Of_Birth , Phone , Caddress , Path);
        
        if (x.addCustomer()) {
            System.out.println(  "Added Successfully ... !");
            return true;
             } 
        else {
            System.out.println("Failed to insert ... !");
            return false;
             }
}
    public void UpdateCustomer(String oldID, Customers newCustomerValues) {
        Customers x = new Customers();
        x.updateCustomer(oldID, newCustomerValues);
        System.out.println("Updated Successfully ... !");
    }
    public void DeleteCustomer(String Id) {
        Customers x = new Customers();
        x.deleteCustomer(Id);
        System.out.println("deleted Successfully ... !");
    }
    public void displayCustomer() {
        Customers x = new Customers();
        System.out.println(x.displayAllCustomers());
    }
    public void searchForCustomer(String id) {
        Customers x = new Customers();
        System.out.println(x.searchCustomer(id));
    }
    
    // Ticket
    
    public boolean Add_Tic(String CId,String CName,String DTime,String Destination,String Source,String CustPath)
    {
        Ticket x=new Ticket(CId,CName,DTime,Destination,Source,CustPath);
        if(x.addTic())
    {   
        System.out.println(" \n Added Successfully .. ! ");
            return true;
    }   else {
        System.out.println(" Failed ");
            return false;
    }
    }
    public void updateTic(String oldTicNo, Ticket newx) {
        Ticket x = new Ticket();
        x.updateTic(oldTicNo, newx);
        System.out.println("Updated Successfully ... !");
    }
    public void deleteTic(String TicNo) {
        Ticket x = new Ticket();
        x.deleteTic(TicNo);
        System.out.println("deleted Successfully ... !");
    }
    public void displayTic() {
        Ticket x = new Ticket();
        System.out.println(x.displayAllTic());
    }
    public void searchForTic(String TicNo) {
        Ticket x = new Ticket();
        System.out.println(x.searchTic(TicNo));
    }
}
