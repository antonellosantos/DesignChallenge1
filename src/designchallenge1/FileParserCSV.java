package designchallenge1;

import java.util.*;
import java.io.*;

public class FileParserCSV extends FileParser{

	@Override
	public void readData() {
		try {
			File file = new File("src\\Sample Files\\DLSU Unicalendar.psv");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
