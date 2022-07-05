package ApplicationDao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ApplicationFunctions {
	
	public ArrayList<String> linkToLogFile() {
	
		File file = new File("C:\\Users\\a868508\\OneDrive - Atos\\Documents\\jagmeet_work\\readfileDummy1.txt");
		ArrayList<String> lines = new ArrayList<String>();
		try {
			String st = "";
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((st = br.readLine()) != null) {
				lines.add(st);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lines;
		
	}

	public ArrayList<String> getKeyLines(String key){
		ArrayList<String> file = linkToLogFile();
		ArrayList<String> matchedLines = new ArrayList<String>();
		
		for(String str : file) {
			String [] words =getWords(str);
			if(isKeywordPresent(key, words)) {
				matchedLines.add(str);
			}
			
		}
		return matchedLines;
		
	}
	
	public String [] getWords (String str) {
		 	String [] words = str.split(" ");
		 	return words;
	}
	
	public boolean isKeywordPresent(String key, String [] words) {
		for(String word : words) {
			if(word.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
}
