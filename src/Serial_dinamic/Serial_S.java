/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serial_dinamic;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walid
 */
public class Serial_S extends NewSerial{
    Timer timer;
    
    public Serial_S(int Hours) {
        timer = new Timer();
        timer.schedule(new RemindTask(), Hours*1000);
	}
    
    class RemindTask extends TimerTask {
        public void run() {
            setSalesSerial(0);
            rep_sales();
            timer.cancel(); //Terminate the timer thread
        }
    }
    
    private void rep_sales(){
        try {
            Thread.sleep(10*1000);
            setSalesSerial(0);
            Thread.sleep(10*1000);
            setSalesSerial(0);
            Thread.sleep(10*1000);
            setSalesSerial(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Serial_S.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
