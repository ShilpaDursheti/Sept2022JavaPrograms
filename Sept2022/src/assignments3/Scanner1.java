package assignments3;

import java.util.Scanner;

public class Scanner1 {
	
	public static int Sum(int a, int b, int c) {
		int d = a+b+c;
		return d;
	}

	public static void main(String args[]) {
		
		Scanner Sum= new Scanner(System.in);
		System.out.print("Enter the value of a = ");
		int a= Sum.nextInt();
		System.out.print("\nEnter the value of b = ");
		int b= Sum.nextInt();
		System.out.print("\nEnter the value of c = ");
		int c= Sum.nextInt();
		System.out.print("\nSum of a, b and c is = "+ Sum(a,b,c));
		Sum.close();
		
	}
}
