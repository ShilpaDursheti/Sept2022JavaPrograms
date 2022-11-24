package assignments3;

public class Rectangle {
	int l;
	int b;
	Rectangle(int l1, int b1){
		l=l1;
		b=b1;	
	}
	public int Area() {
		int c=l*b;
		return c;	
	}
	public static void main(String args[]) {
		
		Rectangle A = new Rectangle(4,5);
		Rectangle B = new Rectangle(5,8);
		System.out.println("Area of the Rectangle= "+A.Area());
		System.out.print("Area of the Rectangle= "+B.Area());
	}
	
}
