/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serial_dinamic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Walid
 */
public class NewSerial {
    private static int SalesSerial=1;
    private static int BuyingSerial=1;

    public static int getBuyingSerial() {
        return BuyingSerial;
    }

    public void setBuyingSerial(int buyingSerial) {
        this.BuyingSerial = buyingSerial;
    }

    public static int getSalesSerial() {
        return SalesSerial;
    }

    public void setSalesSerial(int salesSerial) {
        this.SalesSerial = salesSerial;
    }

    
    
    
    public static void increment_Sales(){
        ++SalesSerial;
    }
    
    public static void increment_Buying(){
        ++BuyingSerial;
    }
    
    public String gettDate(){
        Date today;
        SimpleDateFormat simpleDF;
        today = new Date();
        simpleDF = new SimpleDateFormat ("yyyy-MM-dd");
        return simpleDF.format(today);
    }
}
