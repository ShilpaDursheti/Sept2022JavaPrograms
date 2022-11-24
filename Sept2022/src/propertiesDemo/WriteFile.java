package propertiesDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) throws IOException {
		
		String sPath = "/Users/Shilpa/Documents/WriteFile.properties";
		BufferedWriter oBufferWriter = null;
	
		
		try {
		
			FileWriter ofileWrite = new FileWriter(sPath);
			oBufferWriter = new BufferedWriter(ofileWrite);
			oBufferWriter.write("Welcome to Java Training");
			oBufferWriter.write("\n");
			oBufferWriter.write("Java Advance Training is in progress.");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			oBufferWriter.close();
			System.out.println("File writing is completed");
		}
		
	}


}
