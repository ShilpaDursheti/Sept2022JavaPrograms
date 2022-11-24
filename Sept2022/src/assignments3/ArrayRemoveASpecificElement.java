package assignments3;

public class ArrayRemoveASpecificElement {
	
	public static void main(String args[]) {
		
		int a[] = {3,5,6,2,9,7};
		for(int i=0; i<a.length; i++) {
			if(a[i]==5) {
				continue;
			}
			System.out.print(a[i]+" ");	
		}
		
	}

}
