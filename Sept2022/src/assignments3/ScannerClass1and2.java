package assignments3;
import java.util.Scanner;
public class ScannerClass1and2 {
	public static void main(String args[]) {
		Scanner reader= new Scanner(System.in);
		System.out.print("Enter your name = ");
		String name = reader.next();
		System.out.print("\nYour name is = "+ name);
		reader.close();
		
	}
	

}
