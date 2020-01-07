package Classes;

import java.util.ArrayList;

public class Customers {
    
String Customer_id;
String First_name;
String Last_name;
String Customer_gender;
String Customer_DOB;
String Cusomer_Phone;
String Customer_Adress;
String PicPath;


Manager_Tools Mng = new Manager_Tools();
public static ArrayList<Customers> Cust = new ArrayList<Customers>();
//PROFILE_IMAGE;


    
    public String getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(String Customer_id) {
        this.Customer_id = Customer_id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public String getCustomer_gender() {
        return Customer_gender;
    }

    public void setCustomer_gender(String Customer_gender) {
        this.Customer_gender = Customer_gender;
    }

    public String getCustomer_DOB() {
        return Customer_DOB;
    }

    public void setCustomer_DOB(String Customer_DOB) {
        this.Customer_DOB = Customer_DOB;
    }

    public String getCustomer_Phone() {
        return Cusomer_Phone;
    }

    public void setCustomer_Phone(String Customer_Phone) {
        this.Cusomer_Phone = Customer_Phone;
    }

    public String getCustomer_Adress() {
        return Customer_Adress;
    }

    public void setCustomer_Adress(String Customer_Adress) {
        this.Customer_Adress = Customer_Adress;
    }

    public String getPicPath() {
        return PicPath;
    }

    public void setPicPath(String PicPath) {
        this.PicPath = PicPath;
    }
    
    
    public Customers(){}
    
    public Customers(String Id, String FName , String LName , String Cgender , String Cdate_Of_Birth , String Phone , String Caddress,String Path){
    
    this.Customer_id= Id;
    this.First_name= FName;
    this.Last_name= LName;
    this.Customer_gender= Cgender;
    this.Customer_DOB= Cdate_Of_Birth;
    this.Cusomer_Phone= Phone;
    this.Customer_Adress= Caddress;
    this.PicPath=Path;
};
    

    
    
    private void loadFromFile() {
        Cust = (ArrayList<Customers>) (Object) Mng.read("Cust.txt");
    }
    private void commitToFile() {
        Mng.write(Cust.get(0).GetCustomerData(), "Cust.txt", false);
        for (int i = 1; i < Cust.size(); i++) {
            Mng.write(Cust.get(i).GetCustomerData(), "Cust.txt", true);
        }

    }
    public String GetCustomerData(){
        return Customer_id + '@' + First_name +'@' + Last_name + '@' + Customer_gender + '@' + Customer_DOB + '@' + Cusomer_Phone + '@' + Customer_Adress+ '@' + PicPath ;
    } 
    @Override
    public String toString() {
        return "\nCustomer Id : " + Customer_id + "\t" + "Customer Name : " + First_name + Last_name + "\t" + "Customer Gender: " + Customer_gender + "\t" + "Customer Date Of Birth" + Customer_DOB + "\t" + "Customer Phone" + Cusomer_Phone + "\t" + "Customer Address" + Customer_Adress + "\n" +"and my pic path is"+ PicPath;
    }
    private int GetCustomerIndex(String id){
        for (int i = 0; i < Cust.size(); i++)
         if(Cust.get(i).getCustomer_id().equals(id))
                return i;
        
        return -1;
    }
    public boolean addCustomer() {
        if (this.Mng.write(this.GetCustomerData(), "Cust.txt", true)) {
            return true;
        } else {
            return false;
        }
    }
    public void updateCustomer(String oldID, Customers x){
        loadFromFile();
        int index = GetCustomerIndex(oldID);
        Cust.set(index, x);
        commitToFile();
    } 
    public void deleteCustomer(String id){
        loadFromFile();
        int index = GetCustomerIndex(id);
        Cust.remove(index);
        commitToFile();
    }
    public String displayAllCustomers() {
        loadFromFile();
        String S = "\nAll Customers Data:\n";
        for (Customers x : Cust) {
            S = S + x.toString();
        }
        return S;
    }
    public Customers searchCustomer(String id){
        Customers temp = new Customers("", "", "", "", "", "", "", "");
        loadFromFile();
        int index = GetCustomerIndex(id);
        if(index != -1)
            return Cust.get(index);
        else 
            return temp;
    }
    public ArrayList<Customers> listCustomer() {
        loadFromFile();
        return Cust;
    }
}
    
    
    
    

