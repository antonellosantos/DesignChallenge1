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
	
    
    
	int time;
	
	
	
	public void run() {
		try {
			while(true) {
				GregorianCalendar gregorianCalendar = new GregorianCalendar();            
				String month=String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH) + 1);            
				String day=String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
				String year=String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
				int monthInteger = Integer.parseInt(month);
				int yearInteger = Integer.parseInt(year);
				int dayInteger = Integer.parseInt(day);
				for(int x=0;x<e.getEventsSize();x++) {
					System.out.println(e.getEvents().get(x).geteventName());
					if(e.getEvents().get(x).getDay() == dayInteger && e.getEvents().get(x).getMonth() == monthInteger
							&& e.getEvents().get(x).getYear() == yearInteger) {
						System.out.println("Testing complete");
						cp.updateObservers(e.getEvents().get(x));
					}
					else {
						System.out.println("Testing has failed");
					}
				}
				GregorianCalendar refreshing = new GregorianCalendar();
				Calendar c = new GregorianCalendar();
				Thread.sleep(3000);
			}
		} catch(Exception e) {};
	}
	

}