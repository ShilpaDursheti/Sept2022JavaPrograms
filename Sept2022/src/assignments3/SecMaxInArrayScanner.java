package assignments3;
import java.util.Scanner;

public class SecMaxInArrayScanner {
	
	public static void main(String args[]) {
		int Max=0;
		int SecMax=0;
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the size of the array = ");
		int size = Sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter the values = ");
		for(int i=0; i<size; i++) {
			a[i] = Sc.nextInt();
		}
		for(int i=0;i<size; i++) {
			if (Max<a[i]) {
				SecMax = Max;
				Max = a[i];	
			}
			else if (SecMax<a[i]) {
				SecMax = a[i];
			}
		}
		System.out.println("The second Largest Number is = " +SecMax);
		Sc.close();
	}

}
