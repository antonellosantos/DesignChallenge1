package designchallenge1;

import java.io.*;
import java.util.ArrayList;

public class FileParserCSV extends FileParser{

	Events e;
	ArrayList<String> J = new ArrayList<String>();	
	ArrayList<EventData> D = new ArrayList<>();
	private String input1, input2, input3,inputName, inputDate, inputLabel ;
	
	public FileParserCSV(Events e) {
		this.e = e;
	}
	//@Override
	public void readFile() {
		String filename ="src\\Sample Files\\DLSU Unicalendar.psv";
		File file = new File(filename);
		try {
		
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedreader = new BufferedReader(filereader);

			String currentLine = bufferedreader.readLine();
			System.out.println(currentLine);
			
			while(currentLine != null) { // Reads each line of Unicalendar, stores into an Array and splits with , because its a CSV 
				
				J.add(currentLine); 
				currentLine = bufferedreader.readLine();
				
			}  	
			
//			file = new File("src\\Sample Files\\Philippine Holidays.csv");
//			filereader = new FileReader(file);
//			bufferedreader = new BufferedReader(filereader);
//			
//		while(currentLine != null) {// Reads each line of Philippine Holidays, stores into an Array and splits with , because its a CSV
//				
//				J.add(currentLine);
//				currentLine = bufferedreader.readLine();
//
//			}
				
			bufferedreader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File Read!");
		
		for(int i = 0; i < J.size(); i++) {
			System.out.println(J.get(i));
		}
		
		String [] importedEvents = J.get(0).split("\\|");
		inputName = importedEvents[0];
		inputDate = importedEvents[1];
		inputLabel = importedEvents[2];
		
		String [] Raf = importedEvents[1].split("/");
		input1 = Raf[0];
		input2 = Raf[1];
		input3 = Raf[2];
		System.out.println("\n" + input1 + input2 + input3);
		int month = Integer.parseInt(input1.trim()); 
		int day = Integer.parseInt(input2.trim()); 
		int year = Integer.parseInt(input3.trim()); 
		System.out.println(year);
		EventData newEventb = new EventData(inputName.trim(),month,day,year,inputLabel.trim());
		e.addEvent(newEventb);
		e.addNotification(newEventb);
		System.out.println(e.getEventsSize());
		System.out.println(e.getEvents().get(0).getDay());
		System.out.println(e.getEvents().get(0).geteventName() + e.getEvents().get(0).getMonth()+ " " + e.getEvents().get(0).getDay()+ " " + e.getEvents().get(0).getYear() + e.getEvents().get(0).getColor());
	}
	
	public void writeFile() {
		
	}

}
