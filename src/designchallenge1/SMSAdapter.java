package designchallenge1;
import java.awt.Color;
import java.util.*;

import sms.SMS;
import sms.SMSView;

public class SMSAdapter implements ObserverPattern{
	
	SMSView smsViewing;
	SMS sms;
	
	public SMSAdapter() {
		smsViewing = new SMSView();
	}

	public void update(EventData e) {
		String newEvent = e.geteventName();
		int month = e.getMonth();
		int day = e.getDay();
		int year = e.getYear();
		Color c = null;
		String eventColor = e.getColor();
		Calendar cl;
		
		cl = new GregorianCalendar(year,month - 1,day);
		
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
		
		smsViewing.setVisible(true);
		sms = new SMS(newEvent, cl, c);
		smsViewing.sendSMS(sms);
	}

	
}
