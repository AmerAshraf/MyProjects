package Class;

import java.util.ArrayList;
import java.util.List;

public class Round_Robin {

       private int Q;
       private int NoP;
       private int T;
       private Process temp=null;
       
       public java.util.List<Process> WaitingQueue = new java.util.ArrayList<Process> ();
       public java.util.List<Process> Processes = new java.util.ArrayList<Process> ();
       //java.util.List<Process> SortedProcess = new java.util.ArrayList<Process> ();
       public java.util.List<Process> ProcessInRun = new java.util.ArrayList<Process> ();
       
       public Round_Robin() {}
       
       public Round_Robin(int number_of_process , int Quantum) {
       
            this.NoP=number_of_process;
            for(int i=0 ; i<number_of_process ; i++){     // process creating
                Processes.add(new Process());
            }
            this.Q = Quantum;
       }
       
       public void SetProcess(int Pno,String Pname,int PAT,int PBT){
        
            Processes.get(Pno).setName(Pname);
            Processes.get(Pno).setAT(PAT);        
            Processes.get(Pno).setBT(PBT);
       }
            //---- Sorted processes with arrival time ---------
        public void SortProcess(){
            for ( int i=0; i<NoP ;i++) 
        {
            for (int j=i+1 ; j<NoP ;j++) 
            {
                if (Processes.get(i).getAT() > Processes.get(j).getAT()) 
                {
                    temp = Processes.get(i);
                    Processes.set(i, Processes.get(j));;
                    Processes.set(j, temp);
                }
            }
        }
        }
       
       public void Run_RR(){
            int x=0;
            int r=0;
            WaitingQueue.add(Processes.get(0));
            ProcessInRun.add(Processes.get(0));
            x++;

            int c=0;
            while( c < WaitingQueue.size() ){
                WaitingQueue.get(c).setIn(T);
                if( Q <= WaitingQueue.get(c).getBT() ){
                    WaitingQueue.get(c).setBT( ( (WaitingQueue.get(c).getBT()) - (Q) ) );
                    T=T+Q;
                   }
                else{
                    r = WaitingQueue.get(c).getBT();
                    WaitingQueue.get(c).setBT( 0 );
                    T=T+r;
                }
                WaitingQueue.get(c).setOut(T);
                if( ProcessInRun.size() != NoP ){
                    for(int i=x ; i<NoP ; i++){
                        if(Processes.get(i).getAT() < T){
                            WaitingQueue.add(Processes.get(i));
                            ProcessInRun.add(Processes.get(i));
                            x++;
                        }
                    }
                }
                if(WaitingQueue.get(c).getBT() != 0){
                    WaitingQueue.add(WaitingQueue.get(c));
                }
                c++;
            }
        }
       
       public String WaitingQueue(int i){
           return WaitingQueue.get(i).getName();
       }
       
       public List<Integer> INQueue(int i){
           return Processes.get(i).getIn();
       }
       
       public List<Integer> OutQueue(int i){
           return Processes.get(i).getOut();
       }
       
       public float AVGWaitingTime(){
           float avg=0;
           for(int i=0 ; i<NoP ; i++){
            avg= avg + Processes.get(i).Waiting_Time();
           }
           return avg/NoP;
        }
       
       public float AVGTurnAroundTime(){
           float avg=0;
           for(int i=0 ; i<NoP ; i++){
            avg= avg + Processes.get(i).TurnAroundTime();
           }
           return avg/NoP;
        }
       
       public float AVGResponsedTime(){
           float avg=0;
           for(int i=0 ; i<NoP ; i++){
            avg= avg + Processes.get(i).ResponseTime();
           }
           return avg/NoP;
        }
       
       public double WaitingTime(int i){
           return Processes.get(i).Waiting_Time();
        }
       
       public double TurnAroundTime(int i){
           return Processes.get(i).TurnAroundTime();
        }
       
       public double ResponseTime(int i){
           return Processes.get(i).ResponseTime();
        }
       
       public int NoOfProcesses(){
           return NoP;
       }
}
