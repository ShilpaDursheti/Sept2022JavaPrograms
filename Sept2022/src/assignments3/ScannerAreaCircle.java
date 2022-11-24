package assignments3;
import java.util.Scanner;
public class ScannerAreaCircle {

	public static double Area(int r) {
		double pi= 3.141;
		double A = pi * r * r;
		return A;
	}
	public static double Perimeter(int r) {
		double pi = 3.141;
		double P = 2*pi*r;
		return P;
		
	}
	
	public static void main(String args[]) {
		
		Scanner Area = new Scanner(System.in);
		System.out.print("Enter the radius =" );
		int r = Area.nextInt();
		System.out.println("\nThe Area of the Circle is " +Area(r));
		System.out.println("\nThe Perimeter of the Circle is " +Perimeter(r));
		
		Area.close();
	}
}
