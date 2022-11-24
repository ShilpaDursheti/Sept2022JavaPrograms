package assignments3;

import java.util.Scanner;

public class SumAndAverage {
	public static int Sum(int a, int b, int c) {
		int d = a+b+c;
		return d;
	}
	public static double avg (int a,int b,int c) {
		int Sum = a+b+c;
		double d= (double)Sum/3;
		return d;	
	}
	
	public static void main(String args[]) {
		Scanner A= new Scanner(System.in);
		
		System.out.println("Enter the first number=");
		int a= A.nextInt();
		System.out.println("Enter the second number=");
		int b= A.nextInt();
		System.out.println("Enter the third number=");
		int c= A.nextInt();
		System.out.println("Sum of the three numbers is "+ Sum(a,b,c));
		System.out.println("Average of the three numbers is "+ avg(a,b, c));
		
		A.close();
		
		
				
		
		
	}

}
