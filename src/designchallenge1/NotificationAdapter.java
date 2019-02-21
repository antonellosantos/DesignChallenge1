package designchallenge1;

import java.util.Arrays;
import sms.SMS;
import facebook.FBView;

public class NotificationAdapter implements NotificationCenter{
	
	SMS sms;
	FBView fb;
	
	
	
	
	public NotificationAdapter(SMS textPhone, FBView messageFacebook) {
		sms = textPhone;
		fb = messageFacebook;
		
	}
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
