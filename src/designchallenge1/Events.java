package designchallenge1;



import java.util.ArrayList;

public class Events {
	
	private static ArrayList<EventData> events = new ArrayList<EventData>();
	private static ArrayList<EventData> notifiedEvents = new ArrayList<EventData>();

	public void addEvent(EventData e){
		events.add(e);
	}
	
	public void addNotification(EventData e) {
		notifiedEvents.add(e);
	}

	public ArrayList<EventData> getEvents(){
		return events;
	}
	
	public ArrayList<EventData> getNotifiedEvents(){
		return notifiedEvents;
	}

	public int getEventsSize() {
		return events.size();
	}
	
	public int getEventNotificationSize() {
		return notifiedEvents.size();
	}

	public int getIndex(EventData e) {
		return events.indexOf(e);
	}
	
	public int getNotificationIndex(EventData e) {
		return notifiedEvents.indexOf(e);
	}

	public String checkEvent(int month, int day, int year) {
		String eventDay = "<html>"+Integer.toString(day)+"<br>";
		for(int x = 0 ; x < getEventsSize() ; x++) {
			if(events.get(x).getDay() == day && events.get(x).getMonth() == month && events.get(x).getYear() == year) {
				if(events.get(x).getColor().toLowerCase().equals("red")) {
					eventDay += "<font color=\"red\">" + events.get(x).geteventName() + "</font><br>";
				}
				else if(events.get(x).getColor().toLowerCase().equals("green")) {
					eventDay += "<font color=\"green\">" + events.get(x).geteventName() + "</font><br>";
				}
				else if(events.get(x).getColor().toLowerCase().equals("blue")) {
					eventDay += "<font color=\"blue\">" + events.get(x).geteventName() + "</font><br>";
				}
				else if(events.get(x).getColor().toLowerCase().equals("yellow")) {
					eventDay += "<font color=\"yellow\">" + events.get(x).geteventName() + "</font><br>";
				}
			}
		}
		eventDay += "</html>";
		return eventDay;
	}
	
	public void removeNotifiedEvents(EventData e) {
		notifiedEvents.remove(e);
	}
}