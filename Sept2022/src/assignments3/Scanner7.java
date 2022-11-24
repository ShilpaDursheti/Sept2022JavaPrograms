package assignments3;

import java.util.Scanner;

public class Scanner7 {
	
	public static void main(String args[]) {
		
		Scanner Bio= new Scanner(System.in);
		System.out.print("Enter your Name, Age, Gender, Address");
		String A= Bio.next();
		String B= Bio.next();
		String C= Bio.next();
		String D= Bio.next();
		System.out.println("Name= "+ A);
		System.out.println("Age= "+ B);
		System.out.println("Gender= "+C);
		System.out.println("Address= "+D);
		Bio.close();
		
		
		
		
	}

}
