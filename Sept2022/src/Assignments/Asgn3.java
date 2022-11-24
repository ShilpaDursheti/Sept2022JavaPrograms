package Assignments;

public class Asgn3 {
	public static void main(String args[]) {
	
		Asgn3 obj= new Asgn3();
		System.out.println("Sum of two numbers = "+ obj.Sum(6,5));
		System.out.println("product of two numbers = "+ obj.multiply(6,5));
		System.out.println("Subtraction of two numbers = "+ obj.Sub(6,5));
		System.out.println("Division of two numbers = "+ obj.Div(10,3));
		System.out.println("Remainder of two numbers = "+ obj.rem(6,5));
		
		
		
	}
	public int Sum(int a, int b){
		int S = a+b;
		return S;
	}

	public int multiply(int a, int b){
		int M = a*b;
		return M;
	}
	
	public int Sub(int a, int b){
		int Sub = a - b;
		return Sub;
	}
	public float Div(int a, int b){
		float Div = (float)a/b;
		return Div;
	}
	public float rem(int a, int b) {
		float Rem =(float)a%b;
		return Rem;
	
	
		
		
	}
}
