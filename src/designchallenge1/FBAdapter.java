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
		
		if(eventColor.toLowerCase().equals("red")) {
			c = Color.RED;
		}
		else if(eventColor.toLowerCase().equals("yellow")) {
			c = Color.YELLOW;
		}
		else if(eventColor.toLowerCase().equals("blue")) {
			c = Color.BLUE;
		}
		else if(eventColor.toLowerCase().equals("green")) {
			c = Color.GREEN;
		}
		
		fb.setVisible(true);
		fb.showNewEvent(newEvent, month, day, year, c);
	}

}
