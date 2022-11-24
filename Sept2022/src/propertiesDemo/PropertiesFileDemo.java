package propertiesDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileDemo {
	
	public static void main(String[] args) throws Exception {
		//1.define the path of the file to be read
		
		String sPath = "/Users/Shilpa/Documents/application.properties";
		
		//2.Load this file to Object i.e FileInputStream
		
		FileInputStream fileinput = new FileInputStream(sPath);
		
		//3.Create an object of Properties class
		
		Properties property = new Properties();
		
		//4.Load the file to the Properties object
		property.load(fileinput);
		
		System.out.println(property.get("Url"));
		System.out.println(property.get("Name"));
		System.out.println(property.get("Password"));
	}
	
	

}


