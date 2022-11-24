package assignments2;

public class NestedForToPrintPatterns {
	public static void main(String args[]) {

		System.out.println("P1");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
			
				System.out.print(j );
			
			}
			System.out.println();
		
	}
		
//P2
		System.out.println("P2");

		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
			
				System.out.print(i );
			
			}
			System.out.println();
		
	}
		
		System.out.println("P3");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("P4");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print(j);
			}
			System.out.println();
			
			
		}
		System.out.println("P5");	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(j);
			}
		
		System.out.println();
}
		System.out.println("P6");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		System.out.println("P7");
		
		
		
}
}

