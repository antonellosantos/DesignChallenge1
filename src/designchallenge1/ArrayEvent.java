package designchallenge1;

import java.util.*;

public class ArrayEvent {
	ArrayList<StoringEvent> events = new ArrayList();

	public void getEvent(StoringEvent e)
	{
		events.add(e);
	}

	public void printingEvent() {
		for(int i = 0; i <= events.size();i++) {
			System.out.println("Your " + i+1 + "event is :" + events.get(i).eventName + "(" + events.get(i).Day + "/" + events.get(i).Month + "/"
					+ events.get(i).Year + ")" + " " + "(" + events.get(i).Label + ")");
		}
	}
	public ArrayList getEvents() {
		return events;
	}

	public void setEvents(ArrayList events) {
		this.events = events;
	}


}
