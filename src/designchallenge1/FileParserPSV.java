
package designchallenge1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileParserPSV extends FileParser{
	
	
	String filename ="src\\Sample Files\\DLSU Unicalendar.psv";
	File file = new File(filename);
	
	@Override
	public void readFile() {
		try {
			
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedreader = new BufferedReader(filereader);

			String currentLine = bufferedreader.readLine();
			
			while(currentLine != null) { // Reads each line of Unicalendar, stores into an Array and splits with \\| because its a PSV 
				
				String LineinFile[] = currentLine.split("\\|");
				linesinFile.add(LineinFile);
				currentLine = bufferedreader.readLine();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
