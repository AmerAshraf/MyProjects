
package Classes;

import static java.awt.event.PaintEvent.UPDATE;
import javax.swing.JOptionPane;

public class Customer extends Person{
    
    private int CustomerAccount;
    private int NIC;
    private String Telephone;
    private String Email;
    private String Registration_Date;

    public Customer(){
    
    }
    
    public Customer(int CustomerAccount,String FirstName,String LastName,String Gender,int NIC,String Telephone,String Email,String Registration_Date){
        this.CustomerAccount = CustomerAccount;
        this.FirstName = FirstName;
        this.LastName = LastName;    
        this.Gender = Gender;
        this.NIC = NIC;        
        this.Telephone = Telephone;
        this.Email = Email;
        this.Registration_Date = Registration_Date;
    
    
    }
    
    public int getCustomerAccount() {
        return CustomerAccount;
    }

    public void setCustomerAccount(int CustomerAccount) {
        this.CustomerAccount = CustomerAccount;
    }

    public int getNIC() {
        return NIC;
    }

    public void setNIC(int NIC) {
        this.NIC = NIC;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRegistration_Date() {
        return Registration_Date;
    }

    public void setRegistration_Date(String Registration_Date) {
        this.Registration_Date = Registration_Date;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
    
    @Override
    public void add() {
       String strInsert = "insert into Customer values (" 
                + ""+ CustomerAccount +","
                + "'"+ FirstName +"',"
                +"'"+ LastName +"','"
                + Gender 
                + "','"+ NIC + "',"
                + "'" + Telephone + "','"
                + Email + "','"
                + Registration_Date + "'" + ")";
        boolean isAdd = Database.Tools.runNonQuery(strInsert);
        if(isAdd){
            JOptionPane.showMessageDialog(null, "Added");
    }
 }
    @Override
    public void update() {
        String strUpdate = "update customer set "
                + "FIRSTNAME='" + FirstName + "',"
                + "LASTNAME='" + LastName + "',"
                + "GENDER='" + Gender + "',"
                + "NIC='" + NIC + "',"
                + "TELEPHONE='" + Telephone + "',"
                + "EMAIL='" + Email + "',"
                + "REGISTRATION_DATE='" + Registration_Date 
                + "' where CUSTOMERACCOUNT=" + CustomerAccount;
        boolean isUpdate = Database.Tools.runNonQuery(strUpdate);
        if(isUpdate){
            JOptionPane.showMessageDialog(null, "updated");
        }
        
    }

    @Override
    public void delete() {
     String StrDelete = "delete From Customer Where CustomerAccount="+ CustomerAccount; 
             boolean isDeleted = Database.Tools.runNonQuery(StrDelete);
        if(isDeleted){
            JOptionPane.showMessageDialog(null, "deleted");
        }
    }
}
