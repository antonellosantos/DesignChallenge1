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

	public void printEvents() {
		for (int i = 0; i<events.size(); i++)
		{
			System.out.println(i + " " + events.get(i).geteventName() + " " + events.get(i).getColor());
			System.out.println("ON: "+ events.get(i).getMonth()+ "/"+  events.get(i).getDay()+ "/" +events.get(i).getYear());
		}
	}
}