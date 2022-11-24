package com.training.tekarch;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		try {
			int i = 3;
			int j = 0;
			int k = i/j;
			int S= i+j;
			
			
			System.out.println("output is "+k);
			System.out.println("Sum is"+S);
		
			
		}
		catch(ArithmeticException f) {
			System.out.println("Arithmetic Error");
			
		}
		catch(Exception e) {
			System.out.println("error");	
			}
		
		
		System.out.println("bye");
		int a= 2;
		int b = 3;
		int sum = a+b;
		System.out.println(sum);
				
	}
}
