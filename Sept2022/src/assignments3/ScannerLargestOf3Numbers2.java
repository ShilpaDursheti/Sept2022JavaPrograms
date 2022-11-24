package assignments3;
import java.util.Scanner;


public class ScannerLargestOf3Numbers2 {
	
	
	public static void LargestNum(int a, int b, int c) {
	if (a<b) {
		if (b<c) 
			System.out.println(c+ " is the largest number");
			else 
				System.out.println(b + " is the largest number");
	}
	else if (a>c) 
		System.out.println(a+ " is the largest number");
		
	}
	public static void main(String args[]){
	
		
	Scanner Sc= new Scanner(System.in);
	System.out.print("Enter 3 values = ");
	int a = Sc.nextInt();
	int b = Sc.nextInt();
	int c = Sc.nextInt();
	System.out.println("Largest of 3 numbers is = ");
	LargestNum(a, b , c);
	Sc.close();
	
	
	}
}

	
	

