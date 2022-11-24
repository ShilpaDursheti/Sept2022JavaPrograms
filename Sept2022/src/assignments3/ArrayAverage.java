package assignments3;

public class ArrayAverage {

	public static void main(String args[]) {
		
		int a[]= {20, 30, 40, 50};
		
		int Sum = 0;
		for(int i=0; i<a.length; i++) {
			Sum = Sum + a[i];
			
		}
		float Avg= (float)Sum/a.length;
		System.out.println("Average of the Array is "+ Avg);
		
	}
	
}
