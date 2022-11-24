package assignments3;
import java.util.Scanner;

public class First2nd3rdBiggestNumScanner {

	public static void main(String args[]) {
		int Max=0;
		int SecMax=0;
		int ThirdMax=0;
		
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the size of the array =");
		int size= Sc.nextInt();
		int a[] = new int [size];
		System.out.print("Enter the values = ");
		for(int i=0; i<size; i++) {
			a[i] = Sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			if (Max<a[i]) {
				ThirdMax = SecMax;
			SecMax = Max;
			Max = a[i];}
			else if(SecMax<a[i]) {
				ThirdMax = SecMax;
			SecMax= a[i];}
			else if(ThirdMax<a[i]) {
				ThirdMax = a[i];
			}
			Sc.close();
		}
		System.out.print("The First Largest Number is = "+ Max);
		System.out.print("\nThe Second Largest Number is = "+ SecMax);
		System.out.print("\nThe Third Largest Number is = "+ ThirdMax);
	}
	}

