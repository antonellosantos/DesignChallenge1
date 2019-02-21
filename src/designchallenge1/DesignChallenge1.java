package designchallenge1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Arturo III
 */
public class DesignChallenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Events e = new Events();
    	AddEvent ae = new AddEvent(e);
        CalendarProgram cp = new CalendarProgram(e);
        FBAdapter fba = new FBAdapter();
        SMSAdapter smsa = new SMSAdapter();
        cp.addEvent(ae);
        ae.controllerProgram(cp);
        cp.addObserver(fba);
        cp.addObserver(smsa);
        FileParser fpc = new FileParserCSV(e, cp);        
        fpc.readFile("src\\Sample Files\\Philippine Holidays.csv");
        FileParser fpp = new FileParserPSV(e, cp);
        fpp.readFile("src\\Sample Files\\DLSU Unicalendar.psv");
        
        threadCalendar tc = new threadCalendar(e, cp);
        tc.run();   
        
        
        
        
        
    }
}
