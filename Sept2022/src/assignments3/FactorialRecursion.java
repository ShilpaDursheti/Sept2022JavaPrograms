package assignments3;

public class FactorialRecursion {
	
	//without recursion
	/*public static int Factorial(int num) {	
		  int fact = 1;
		  for(int i=1; i<=num; i++){
			   fact=fact*i;
		  }
		return fact;*/
	
	public static long Factorial(int n) {
		if (n>=1)
			return n* Factorial(n-1);
		else
			return 1;
					
	}
	public static void main(String args[]) {
		System.out.println(Factorial(5));
		System.out.println(Factorial(4));
		
		
		
	
		  
		
	}
	}
 
