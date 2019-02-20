package designchallenge1;



import java.util.ArrayList;

public class Events {
	
	private static ArrayList<EventData> events = new ArrayList<EventData>();

	public void addEvent(EventData e){
		events.add(e);
	}

	public ArrayList<EventData> getEvents(){
		return events;
	}

	public int getEventsSize() {
		return events.size();
	}

	public int getIndex(EventData e) {
		return events.indexOf(e);
	}
	
	public String checkEvent(int month, int day, int year) {
		for(int x = 0 ; x < getEventsSize() ; x++) {
			if(events.get(x).getDay() == day && events.get(x).getMonth() == month && events.get(x).getYear() == year) {
				if(events.get(x).getColor() == "Red") {
					events.get(x).setColor("<html><font color=\"green\">hello world!</font></html>"); 
				}
				else if(events.get(x).getColor() == "Green") {
					events.get(x).geteventName().getClass().getName().valueOf("<html><font color=\"green\">hello world!</font></html>");
				}
				else if(events.get(x).getColor() == "Blue") {
					events.get(x).geteventName().getClass().getName().valueOf("<html><font color=\"blue\">hello world!</font></html>");
				}
				else if(events.get(x).getColor() == "Yellow") {
					events.get(x).geteventName().getClass().getName().valueOf("<html><font color=\"yellow\">hello world!</font></html>");
				}
			}
		}
		return Integer.toString(day);
	}
}