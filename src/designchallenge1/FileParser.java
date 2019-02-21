package designchallenge1;


import java.util.ArrayList;
	
public abstract class FileParser {
	
	protected ArrayList<String[]> linesinFile = new ArrayList<String[]>();	
	
	public void parsing() {
		readFile();
		
	}
	
	public abstract void readFile();

}
