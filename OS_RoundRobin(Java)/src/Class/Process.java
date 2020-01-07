package Class;

public class Process {
    
    private String Name;
    private int AT;   // Arrival time
    private int BT;  // Butst Time 
    private java.util.List<Integer> In = new java.util.ArrayList<Integer> (); 
    private java.util.List<Integer> Out = new java.util.ArrayList<Integer> ();
    
    //------------------(setter & Getter)------------------------//
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getAT() {
        return AT;
    }

    public void setAT(int AT) {
        if(AT >= 0){
            this.AT = AT;
        }
        else{
            System.out.println("Enter Positive Number Only ...!");
        }
    }

    public int getBT() {
        return BT;
    }

    public void setBT(int BT) {
        if(BT >= 0){
            this.BT = BT;
        }
        else{
            System.out.println("Enter Positive Number Only ...!");
        }
    }

    public java.util.List<Integer> getIn() {
        return In;
    }

    public void setIn(int in) {
        this.In.add(in);
    }

    public java.util.List<Integer> getOut() {
        return Out;
    }

    public void setOut(int out) {
        this.Out.add(out);
    }
    //----------------------------------------------//
    public int Waiting_Time(){
        int x=0,y=0;
        x = ( this.AT )-( this.In.get(0) );
        if( x < 0){
            x = x*-1;
        }
        for(int i=0 ; i<In.size() -1 ; i++){
            y = y + ( ( this.In.get(i+1) )-( this.Out.get(i) ) );
        }
        if((x+y) < 0){
            return (x+y)*-1;
        }
        else{
            return (x+y) ;
        }
    }
    public int TurnAroundTime(){
        int x=0;
        x = ( this.Out.get( this.Out.size() -1 ) ) - ( this.AT );
        return x;
    }
    public int ResponseTime(){
        int x=0;
        x = ( this.AT ) - ( this.In.get(0) );
        if( x < 0){
            return x*-1;
        }
        else{
            return x ;
        }
    }
}
