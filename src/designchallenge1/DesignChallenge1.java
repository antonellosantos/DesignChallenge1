/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designchallenge1;

import sms.SMSView;
import facebook.FBView;

/**
*
* @author Rafael Cruz and Antonello Santos 
*/
public class DesignChallenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalendarProgram cp = new CalendarProgram();
        SMSView smsApp = new SMSView();
        FBView fbApp = new FBView();
        
    	String date = "2/8/2019";
		String[] sDate = date.split("/");
		String year = sDate[2];
		String month = sDate[1];
		String day = sDate[0];
    	int dYear = Integer.parseInt(year);
		int dMonth = Integer.parseInt(month);
		int dDay = Integer.parseInt(day);
    	
       
        

        
        
    }
}
