package operatingsystem_1;

import Class.Process;
import Class.Round_Robin;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OperatingSystem_1 {


    public static void main(String[] args) {
       /* 
       java.util.List<Process> WaitingQueue = new java.util.ArrayList<Process> ();
       java.util.List<Process> Processes = new java.util.ArrayList<Process> ();
       //java.util.List<Process> SortedProcess = new java.util.ArrayList<Process> ();
       java.util.List<Process> ProcessInRun = new java.util.ArrayList<Process> ();
       
       int x=0 , Q=0 , NoP=0 , T=0 , r=0;
       Process temp=null;
       
       Scanner sc = new Scanner(System.in);
       Scanner ss = new Scanner(System.in);
       
        System.out.println("Enter number of processes");
        NoP = sc.nextInt();
        for(int i=0 ; i<NoP ; i++){     // process creating
            Processes.add(new Process());
        }
        
        System.out.println("Enter Quantum value");
        Q = sc.nextInt();
        
        //------  Data Entry   ------
        for(int i=0 ; i<NoP ; i++){
            System.out.println("Enter Name of process "  + String.valueOf(i+1) + ":" );
            Processes.get(i).setName(ss.nextLine());
            System.out.println("Enter Arrival Time of process "  + String.valueOf(i+1) + ":" );
            Processes.get(i).setAT(sc.nextInt());
            System.out.println("Enter Burst Time of process "  + String.valueOf(i+1) + ":" );
            Processes.get(i).setBT(sc.nextInt());
        }
        
        //---- Sorted processes with arrival time ---------
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
        
        //--------RUN----------//
        
        
        for(int t=0 ; t<WaitingQueue.size() ; t++){
            //System.out.println("order of gantt chart of processes");
            System.err.println(WaitingQueue.get(t).getName());
        }
        for(int t=0 ; t<WaitingQueue.size() ; t++){
            //System.out.println("in and out of processes");
            System.err.println(WaitingQueue.get(t).getIn());
            System.err.println(WaitingQueue.get(t).getOut());
        }
        System.err.println(T);
        /*
        int w=0,avg=0; 
        for(int tt=0 ; tt<NoP ; tt++){
            w = w + Processes.get(tt).Waiting_Time();
            System.err.println("The waiting time " + Processes.get(tt).Waiting_Time());
        }
        w = w/NoP;
        System.err.println("the wait avg is" + w);

        for(int ttt=0 ; ttt<NoP ; ttt++){
            w = w + Processes.get(ttt).TurnAroundTime();
            System.err.println("The TAT time " + Processes.get(ttt).TurnAroundTime());
        }
        w = w/NoP;
        System.err.println("the TAT avg is" + w);
        for(int tttt=0 ; tttt<NoP ; tttt++){
            w = w + Processes.get(tttt).ResponseTime();
            System.err.println("The Res time " + Processes.get(tttt).ResponseTime());
        }
        w = w/NoP;
        System.err.println("the Rs avg is" + w);
//  
   //     System.err.println(T);
     //   System.err.println(Processes.get(0).getIn());
       // System.err.println(Processes.get(0).getOut());
       */
       
        Round_Robin x = new Round_Robin(3, 5);
        x.SetProcess(0, "P1", 0, 30);
        x.SetProcess(1, "P2", 0, 6);
        x.SetProcess(2, "P3", 0, 8);
        //x.SetProcess(3, "P4", 3, 5);
        //x.SetProcess(4, "E", 9, 1);
        x.SortProcess();
        x.Run_RR();
        //for(int i=0; i<x.WaitingQueue.size() ;i++){
          //  System.out.println(x.WaitingQueue(i));
        //}
        //System.err.println(x.INQueue(2));
        //System.err.println(x.OutQueue(2));
        System.err.println(x.INQueue(2));
        System.err.println(x.OutQueue(2));
        //System.err.println(x.AVGTurnAroundTime());
        //System.err.println(x.AVGResponsedTime());
        //JOptionPane.showMessageDialog(null, x.WaitingQueue.get(1).getIn().get(0));
        
    }
    
}
