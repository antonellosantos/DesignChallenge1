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
}