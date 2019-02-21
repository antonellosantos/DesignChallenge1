package designchallenge1;

import java.io.*;
import java.util.ArrayList;

public class FileParserCSV extends FileParser{

	Events e;
	CalendarProgram cp;
	
	public FileParserCSV(Events e, CalendarProgram cp) {
		this.e = e;
		this.cp = cp;
	}
	
	@Override
	public void parseFile(ArrayList<String> lines) {
		String input1, input2, input3,inputName, inputDate, inputLabel;
		for(int i = 0; i < lines.size(); i++) {
			String [] importedEvents = lines.get(i).split(",");
			inputName = importedEvents[1];
			inputDate = importedEvents[0];
			inputLabel = importedEvents[2];
			String [] Raf = importedEvents[0].split("/");
			input1 = Raf[0];
			input2 = Raf[1];
			input3 = Raf[2];
			int month = Integer.parseInt(input1.trim()); 
			int day = Integer.parseInt(input2.trim()); 
			int year = Integer.parseInt(input3.trim()); 
			EventData newEvent = new EventData(inputName.trim(),month,day,year,inputLabel.trim());
			e.addEvent(newEvent);
			e.addNotification(newEvent);
			cp.refreshCalendar();
			System.out.println(e.getEvents().get(i).geteventName() + " " + e.getEvents().get(i).getMonth()+ " " + e.getEvents().get(i).getDay()+ " " + e.getEvents().get(i).getYear() + " " + e.getEvents().get(i).getColor());			
		}
	}

}
