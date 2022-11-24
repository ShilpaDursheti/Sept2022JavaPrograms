package assignments3;

public class Swap2NumWithout3rdVar {
	public static void main(String args[]) {
		
		int a = 10;
		int b = 30;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		//a=a*b; b=a/b; a= a/b
		
		System.out.println("After Swapping= "+ a +" "+ b);
		
	}

}
