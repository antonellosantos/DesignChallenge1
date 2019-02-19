package designchallenge1;
import java.util.*;
import com.sun.glass.ui.Timer;
import java.text.*;

public class threadCalendar implements Runnable{
	public threadCalendar(Events e, CalendarProgram cp) {
		this.e = e;
		this.cp = cp;
		
		
	}
	
	Events e;
	CalendarProgram cp;
	
	
	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	
    
    
	String repeat = "hello";
	int time;
	GregorianCalendar gregorianCalendar = new GregorianCalendar();            
	String month=String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH) + 1);            
	String day=String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
	String year=String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
	
	public void run() {
		try {
			while(true) {
				for(int x=0;x<e.getEventsSize();x++) {
					System.out.println(e.getEvents().get(x).geteventName());
				}
				Calendar c = new GregorianCalendar();
				Thread.sleep(1500);
			}
		} catch(Exception e) {};
	}
	

}
