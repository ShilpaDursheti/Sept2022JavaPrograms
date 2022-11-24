package ArrayListsPractice;

public class PrintingDuplicatesInArray {
	
	public static void main(String[] args) {
		
		String A[]= {"Shilpa","Divya", "Shilpa","Swetha"};
		
		boolean flag= false;
		
		for(int i=0;i<A.length; i++) {
			for(int j=i+1; j<A.length; j++) {
				if(A[i]==A[j]) {
					System.out.println("Duplicate element is "+ A[i]);
					flag = true;
				}
			}
		}
		if(flag==false) {
			System.out.println("No Duplicate elements found");
			
		}
		
	}
}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
