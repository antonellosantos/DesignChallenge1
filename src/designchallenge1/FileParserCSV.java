package designchallenge1;

import java.io.*;

public class FileParserCSV extends FileParser{

	//@Override
	public void readFile() {
		String filename ="src\\Sample Files\\DLSU Unicalendar.psv";
		File file = new File(filename);
		try {
		
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedreader = new BufferedReader(filereader);

			String currentLine = bufferedreader.readLine();
			
			while(currentLine != null) { // Reads each line of Unicalendar, stores into an Array and splits with , because its a CSV 
				
				String LineinFile[] = currentLine.split(",");
				linesinFile.add(LineinFile);
				currentLine = bufferedreader.readLine();
				
			}
			
			file = new File("src\\Sample Files\\UserEvents.csv");
			filereader = new FileReader(file);
			bufferedreader = new BufferedReader(filereader);
			
		while(currentLine != null) {// Reads each line of UserEvents, stores into an Array and splits with , because its a CSV
				
				String LineinFile[] = currentLine.split(",");
				linesinFile.add(LineinFile);
				currentLine = bufferedreader.readLine();
				
			}
			bufferedreader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeFile() {
		
	}

}
