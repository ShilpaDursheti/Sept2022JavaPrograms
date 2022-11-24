package Assignments;

public class Operations {
	public static void main(String args[]) {
		int a = -5;
		int b = 8;
		int c = 6;
		int product = b*c;
		int result = a+product;
		
		System.out.println("-5+8*6 =" +result+'\n');
		
		int x = 55;
		int y = 9;
		int z = 9;
		int sum = x+y;
		int r1 = sum%z;
		
		System.out.println("(55+9)%9 =" +r1+'\n');
		
		
		int e = 20;
		int f = -3;
		int g = 5;
		int h = 8;
		int p = f*g;
		float d = (float)p/h;
		float r2 = e+d;
		System.out.println(d);
		System.out.println("20+-3*5/8 = " +r2 + '\n');
		
		//d.5+(15/3*2)-(8%3) = 5+10-2
		int i = 5;
		int j = 15;
		int k = 3;
		int l = 2;
		int m = 8;
		a = j/k;
		b = a*l;
		c = m%k;
		result = i+b-c;
		System.out.println("5+15/3*2-8%3 = "+result);
		
	
	}

	
		
	
}
