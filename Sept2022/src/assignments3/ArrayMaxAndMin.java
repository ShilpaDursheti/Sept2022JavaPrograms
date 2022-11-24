package assignments3;

public class ArrayMaxAndMin {
	public static void main(String args[]) {
		
		int a[]= {20,100,49,58,34,35};
		/*int max= a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max=a[i];
			}
		}
		System.out.println("Maximum number is "+ max);*/
		
		int min= a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {
				min= a[i];
			}
		}
			System.out.println("Minimum number is "+ min);	
		
		
		
	}

	
	
	
}
