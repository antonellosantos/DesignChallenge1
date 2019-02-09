package designchallenge1;


import java.util.ArrayList;

public class Events {

	private static ArrayList<EventData> allEvents = new ArrayList<EventData>();

	public void addEvent(EventData event){
		allEvents.add(event);
	}

	public ArrayList<EventData> getEvents(){
		return allEvents;
	}

	public int getEventsSize() {
		return allEvents.size();
	}

	public int getIndex(EventData event) {
		return allEvents.indexOf(event);
	}

	public void printEvents() {
		for (int i = 0; i<allEvents.size(); i++)
		{
			System.out.println(i + " " + allEvents.get(i).geteventName() + " " + allEvents.get(i).getColor());
			System.out.println("ON: "+ allEvents.get(i).getMonth()+ "/"+  allEvents.get(i).getDay()+ "/" + allEvents.get(i).getYear());
		}
	}
}