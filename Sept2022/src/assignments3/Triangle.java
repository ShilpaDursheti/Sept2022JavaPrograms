package assignments3;

public class Triangle {
	
	
	Triangle(){}
	int b;
	int h;
	int l;
	
	public double Area() {
		double A= (double)1/2*b*h;
		return A;
	}
	
	public int perimeter() {
		int P= l+b+h;
		return P;
	}
	
	public static void main(String args[]) {
		 
		Triangle T= new Triangle();
		T.b=3;
		T.h=4;
		T.l=5;
		double Ar= T.Area();
		int Peri= T.perimeter();
	 
		 
		System.out.println("Area of the Triangle=" + T.Area());
		System.out.println("Perimeter of the triangle=" +Peri);
		
		 
		 
		 
		 
		 
		 
	 }

}
