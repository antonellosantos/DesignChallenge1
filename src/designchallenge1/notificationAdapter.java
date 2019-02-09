package designchallenge1;
import java.awt.Color;
import java.util.Arrays;
import sms.SMS;
import facebook.FBView;

public class notificationAdapter implements notificationCenter{
	
	SMS sms;
	FBView fb;
	String eventName;
	int year,day,month;
	Color color; 
	
	
	
	
	public notificationAdapter(SMS textPhone, FBView messageFacebook) {
		sms = textPhone;
		fb = messageFacebook;
		
	}

	
	/*
	public void splitDate() {
		String date = "2/8/2019";
		String[] sDate = date.split("/");
		String year = sDate[2];
		String month = sDate[1];
		String day = sDate[0];
		
		int dYear = Integer.parseInt(year);
		int dMonth = Integer.parseInt(month);
		int dDay = Integer.parseInt(day);
		
		System.out.println(dDay + "/" + dMonth + "/" + dYear);
	}
	*/

	@Override
	public void getDate() {
		
		
	}
	
	@Override
	public void getTitle() {
		sms.getEventName();
		
	}

	@Override
	public void labelColor() {
		
		sms.getColor();
		
	}


	
}
