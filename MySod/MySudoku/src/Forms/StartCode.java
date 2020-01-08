/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StartCode {
   public static void main(String args[]) throws InterruptedException {
    Start splash = new Start();
    
    for(int i=0;i<=100;i++){
        Thread.sleep(40);
        splash.setVisible(true);
        splash.Loading.setText("Loading"+i+"%");
        splash.Load.setValue(i);
        if(i==100)
        {
            splash.dispose();
            new Login().setVisible(true);
        }
}
    
   }
}
