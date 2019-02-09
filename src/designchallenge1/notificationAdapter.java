package designchallenge1;
import java.util.Arrays;
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
	public void getDate() {
		
	}

	@Override
	public void getTitle() {
		
		
	}

	@Override
	public void labelColor() {
		
	}
	
}
