package designchallenge1;
import sms.SMS;
import facebook.FBView;

public class notificationAdapter implements notificationCenter{
	
	SMS sms;
	FBView fb;
	
	
	
	
	public notificationAdapter(SMS textPhone, FBView messageFacebook) {
		sms = textPhone;
		fb = messageFacebook;
		
	}
	
	@Override
	public void getYear() {
		
		
	}

	@Override
	public void getMonth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDay() {
		// TODO Auto-generated method stub
		
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
