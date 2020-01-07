package Classes;

import javax.swing.JOptionPane;

public class Room implements mainData{
    
    private int RoomNumber; 
    private String RoomLocation;
    private int RoomType;
    
    
    public Room(){};
    public Room(int RoomNumber,String RoomLocation,int RoomType){
        this.RoomNumber = RoomNumber;
        this.RoomLocation = RoomLocation;
        this.RoomType = RoomType;
    };

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getRoomLocation() {
        return RoomLocation;
    }

    public void setRoomLocation(String RoomLocation) {
        this.RoomLocation = RoomLocation;
    }

    public int getRoomType() {
        return RoomType;
    }

    public void setRoomType(int RoomType) {
        this.RoomType = RoomType;
    }

    
    @Override
    public void add() {
       String strInsert = "insert into room values (" 
                + RoomNumber +","
                + "'"+ RoomLocation +"',"                
                + RoomType + ")";
        boolean isAdd = Database.Tools.runNonQuery(strInsert);
        if(isAdd){
            JOptionPane.showMessageDialog(null, "Added");
    }
 }
    @Override
    public void update() {
        String strUpdate = "update room set "
                + "ROOMLOCATION='" + RoomLocation + "' ,"
                + "ROOMTYPE=" + RoomType          
                + " where ROOMNUMBER= " + RoomNumber;
        boolean isUpdate = Database.Tools.runNonQuery(strUpdate);
        if(isUpdate){
            JOptionPane.showMessageDialog(null, "updated");
        }
        
    }

    @Override
    public void delete() {
     String StrDelete = "delete From room Where ROOMNUMBER="+ RoomNumber; 
             boolean isDeleted = Database.Tools.runNonQuery(StrDelete);
        if(isDeleted){
            JOptionPane.showMessageDialog(null, "deleted");
        }
    }
}

    
    
    

