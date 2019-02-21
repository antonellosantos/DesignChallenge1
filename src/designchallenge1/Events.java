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
					return ("<html><font color=\"red\">" + events.get(x).geteventName() + "</font></html>");
				}
				else if(events.get(x).getColor() == "Green") {
					return ("<html><font color=\"green\">" + events.get(x).geteventName() + "</font></html>");
				}
				else if(events.get(x).getColor() == "Blue") {
					return ("<html><font color=\"blue\">" + events.get(x).geteventName() + "</font></html>");
				}
				else if(events.get(x).getColor() == "Yellow") {
					return ("<html><font color=\"yellow\">" + events.get(x).geteventName() + "</font></html>");
				}
			}
		}
		return Integer.toString(day);
	}
}