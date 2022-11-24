package Assignments;

public class IfElsIfAndNestedIf {
	public static void main(String args[]) {
		
	int a = 21;
	int b = 17;
	int c = 22;
	
	if(a<b) {
		if(b<c)
		
		System.out.println("c is largest");
	
		
		else
			System.out.println("b is largest");
	}
		
	
	else if(a>c)
		System.out.println("a is largerst");
	else
		System.out.println("c is largest");
	
}
}
