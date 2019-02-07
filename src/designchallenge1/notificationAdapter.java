package designchallenge1;
import sms.SMSView;
import facebook.FBView;

public class notificationAdapter implements notificationCenter{
	
	SMSView sms;
	FBView fb;
	
	public notificationAdapter(SMSView textPhone, FBView messageFacebook) {
		sms = textPhone;
		fb = messageFacebook;
	}
	
	@Override
	public void getYear() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void labelColor() {
		// TODO Auto-generated method stub
		
	}
	
}
