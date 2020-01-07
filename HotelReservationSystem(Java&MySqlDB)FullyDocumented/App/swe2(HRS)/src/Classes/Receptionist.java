
package Classes;

public class Receptionist extends Staff {

private int ReceptionistID;

public Receptionist(){

}
    public Receptionist(int ReceptionistID, String UserName, String Password, String Gender, String FirstName, String LastName){
    
        this.ReceptionistID = ReceptionistID;
        this.UserName = UserName;
        this.Password = Password;
        this.Gender = Gender;
        this.FirstName = FirstName;
        this.LastName = LastName;
    };

    public int getReceptionistID() {
        return ReceptionistID;
    }

    public void setReceptionistID(int ReceptionistID) {
        this.ReceptionistID = ReceptionistID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
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
    String InsertQuery = "INSERT INTO receptionist (RID, USERNAME, PASSWORD, GENDER, FIRSTNAME, LASTNAME) VALUES "
            + "("+ReceptionistID+","
            + "'"+UserName+"',"
    + "'"+Password+"','"+Gender+"','"+FirstName+"','"+LastName+"')" ;     
     boolean isAdd = Database.Tools.runNonQuery(InsertQuery);
        if(isAdd){
            System.out.println("Receptionist is Add");
        }
    }
    
     @Override
    public void update() {
    String UpdateQuery="UPDATE `receptionist` SET `USERNAME`='"+UserName+"',`PASSWORD`='"+Password+"',`GENDER`='"+Gender+"',`FIRSTNAME`='"+FirstName+"',`LASTNAME`='"+LastName+"' WHERE RID="+ReceptionistID+"";    
    boolean isUpdated = Database.Tools.runNonQuery(UpdateQuery);
        if(isUpdated){
            System.out.println("Receptionist is Updated");
        }
    
    
    }

    @Override
    public void delete() {
        String DeleteQuery="DELETE FROM `receptionist` WHERE RID=" +ReceptionistID;
         boolean isDeleted = Database.Tools.runNonQuery(DeleteQuery);
        if(isDeleted){
            System.out.println("Receptionist is Deleted");
        }
    }
    
    

    
    
    
}
