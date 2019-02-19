package designchallenge1;
import facebook.FBView;
import java.util.*;
import java.awt.*;

public class FBAdapter implements ObserverPattern{

	FBView fb;
//	ArrayList fbArray = new ArrayList();
	public FBAdapter() {
		fb = new FBView();
	}
	
	public void update(EventData e) {
		String newEvent = e.geteventName();
		int month = e.getMonth();
		int day = e.getDay();
		int year = e.getYear();
		Color c = null;
		String eventColor = e.getColor();
		
		if(eventColor == "Red") {
			c = Color.RED;
			
		}
		else if(eventColor == "Yellow") {
			c = Color.YELLOW;
		}
		else if(eventColor == "Blue") {
			c = Color.BLUE;
		}
		else if(eventColor == "Green") {
			c = Color.GREEN;
		}
		
		fb.setVisible(true);
		fb.showNewEvent(newEvent, month, day, year, c);
	}

}
