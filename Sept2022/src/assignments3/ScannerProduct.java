package assignments3;

import java.util.Scanner;

public class ScannerProduct {
	
	public static int Product(int a, int b) {
		int c = a * b;
		return c;
	}

	public static void main(String args[]) {
		
	Scanner product = new Scanner(System.in);
	System.out.print("Enter the first number = ");
	int a= product.nextInt();
	System.out.print("\nEnter the value of second number = ");
	int b= product.nextInt();
	System.out.print("\nProduct of the two numbers = " + Product(a,b));
	product.close();
	}
}
