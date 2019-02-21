package designchallenge1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class FileParser {
	
	private ArrayList<String> readFilename(String fname){
		
		String filename = fname;
		File file = new File(filename);
		ArrayList<String> lines = new ArrayList<>();
		
		try {
		
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedreader = new BufferedReader(filereader);

			String currentLine = bufferedreader.readLine();
			
			while(currentLine != null) { // Reads each line of Unicalendar, stores into an Array and splits with , because its a CSV 
				
				lines.add(currentLine); 
				currentLine = bufferedreader.readLine();
				
			}  	
				
			bufferedreader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lines;
	};
	
	abstract void parseFile(ArrayList<String> lines);

	public void readFile(String fname) {
		parseFile(readFilename(fname));
	}

}
