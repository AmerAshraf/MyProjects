package Classes;


public class Reservation implements mainData {
    
    private int ReservationID ;
    private int CustomerAccount ;
    private int RoomNo ;
    private int TypeOfMeal ;
    private int Customerrequest ;
    private int Duration ;
    private String CheckInDate ;
    
    
    public Reservation(){}
    
    public Reservation(int ReservationID ,int customerAccount,int RoomNo,int TypeOfMeal,int Customerrequest,int Duration,String CheckInDate){
        
        this.CheckInDate = CheckInDate;
        this.CustomerAccount = customerAccount;
        this.Customerrequest = Customerrequest;
        this.Duration = Duration;
        this.ReservationID = ReservationID;
        this.RoomNo = RoomNo;
        this.TypeOfMeal = TypeOfMeal;
    
    
    }
    
    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public int getCustomerAccount() {
        return CustomerAccount;
    }

    public void setCustomerAccount(int CustomerAccount) {
        this.CustomerAccount = CustomerAccount;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo) {
        this.RoomNo = RoomNo;
    }

    public int getTypeOfMeal() {
        return TypeOfMeal;
    }

    public void setTypeOfMeal(int TypeOfMeal) {
        this.TypeOfMeal = TypeOfMeal;
    }

    public int getCustomerrequest() {
        return Customerrequest;
    }

    public void setCustomerrequest(int Customerrequest) {
        this.Customerrequest = Customerrequest;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public String getCheckInDate() {
        return CheckInDate;
    }

    public void setCheckInDate(String CheckInDate) {
        this.CheckInDate = CheckInDate;
    }

    @Override
    public void add() {
    String InsertQuery = "INSERT INTO reservation(RESERVATIONID, CA, ROOMNO, TYPEOFMEAL, CUSTOMERREQUEST, DURATION, CHECKINDATE) VALUES "
            + "("+ReservationID+","+CustomerAccount+","+RoomNo+","+TypeOfMeal+","+Customerrequest+","+Duration+",'"+CheckInDate+"')" ;     
     boolean isAdd = Database.Tools.runNonQuery(InsertQuery);
        if(isAdd){
            System.out.println("Reservation is Add");
        }
    }
    
     @Override
    public void update() {
    String UpdateQuery="UPDATE reservation SET CA="+CustomerAccount+",ROOMNO="+RoomNo+",TYPEOFMEAL="+TypeOfMeal+",CUSTOMERREQUEST="+Customerrequest+",DURATION="+Duration+",CHECKINDATE='"+CheckInDate+"' WHERE RESERVATIONID="+ReservationID+"";    
    boolean isUpdated = Database.Tools.runNonQuery(UpdateQuery);
        if(isUpdated){
            System.out.println("Reservation is Updated");
        }
    
    
    }

    @Override
    public void delete() {
        String DeleteQuery="DELETE FROM reservation WHERE RESERVATIONID=" +ReservationID;
         boolean isDeleted = Database.Tools.runNonQuery(DeleteQuery);
        if(isDeleted){
            System.out.println("Reservation is Deleted");
        }
    }
    
    
    
    
}