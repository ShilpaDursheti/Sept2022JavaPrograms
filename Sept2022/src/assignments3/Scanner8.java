package assignments3;
import java.util.Scanner;
public class Scanner8 {
	public static void main(String args[]) {
		Scanner reader= new Scanner(System.in);
		System.out.print("Enter a integer = ");
		int a = reader.nextInt();
		System.out.print("Enter a double value = ");
		double b = reader.nextDouble();
		System.out.print("Enter a float value = ");
		float c = reader.nextFloat();
		double Sum = a+b+c;
		System.out.println("the Sum of three values = "+ Sum);
		
		System.out.print("The Sun rises in the east- true/False?");
		System.out.print("\nEnter a boolean value = ");
		boolean d = reader.nextBoolean();
		if (d==true) {
			System.out.print("You are correct!");
		}
		
		reader.close();
	}
	

}
