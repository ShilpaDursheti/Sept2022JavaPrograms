package assignments3;
import java.util.Scanner;

public class ScannerEvenOrOdd {
	public static void main(String args[]) {
		
	
	Scanner Even= new Scanner(System.in);
		System.out.print("Enter the size of array =");
		int size= Even.nextInt();
		int a[]= new int[size];
		System.out.print("Enter the values = ");
		for(int i=0; i<size; i++) {
			a[i]= Even.nextInt();
		}
			System.out.println("Even numbers");
			
		for( int i=0;i<size; i++) {
			
			if (a[i]%2==0) 
				System.out.print(a[i] + " ");
		}
			
			Even.close();
		}
			
		}
			
	


