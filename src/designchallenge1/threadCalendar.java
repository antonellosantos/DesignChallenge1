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
				String month = String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH) + 1);            
				String day = String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
				String year = String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
				int monthInteger = Integer.parseInt(month);
				int yearInteger = Integer.parseInt(year);
				int dayInteger = Integer.parseInt(day);
				
				
				for(int x=0;x<e.getEventNotificationSize();x++) {
					System.out.println(e.getNotifiedEvents().get(x).geteventName());
					if(e.getNotifiedEvents().get(x).getDay() == dayInteger && e.getNotifiedEvents().get(x).getMonth() == monthInteger
							&& e.getNotifiedEvents().get(x).getYear() == yearInteger) {
						cp.updateObservers(e.getNotifiedEvents().get(x));
						e.removeNotifiedEvents(e.getNotifiedEvents().get(x));
					}
				}
				
				
				GregorianCalendar refreshing = new GregorianCalendar();
				Calendar c = new GregorianCalendar();
				Thread.sleep(3000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		};
	}
	

}
