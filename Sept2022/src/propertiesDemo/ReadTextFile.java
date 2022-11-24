package propertiesDemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		
		//1. Define the path of the file 
		String sPath = "/Users/Shilpa/Documents/application.properties";
		
		//2. Read the file 
		FileReader oFileReader = new FileReader(sPath);
		
		//2. Read the flle line by line
		BufferedReader oBufferedReader = new BufferedReader(oFileReader);
		
		//oBufferedReader.readLine();
		
		
		String str;
		
		while((str =oBufferedReader.readLine())!=null) {
			System.out.println(str);
		}
		
		
		
		
		
	}

	

}
