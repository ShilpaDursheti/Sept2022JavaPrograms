package AssignPolyandInheritance;
abstract class Shape{
	
		abstract int RectangleArea(int l, int b);
		abstract int SquareArea(int s);
		abstract double CircleArea(int r);

	}
public class Area extends Shape{
	
		    int RectangleArea(int l, int b) {
			int A = l*b;
			return A;
		}
		
		    int SquareArea(int s) {
				int A = s*s;
				return A;
			}
		
		    double CircleArea(int r) {
				double A = 3.141*r*r;
				return A;
			}
		public static void main(String[] args) {
			
			Area obj = new Area();
			int RA=	obj.RectangleArea(6, 10);
			System.out.println("Area of Rectangle = " +RA);	
			
			int SA = obj.SquareArea(6);
			System.out.println("Area of Square = " +SA);	
			
			double CA = obj.CircleArea(6);
			System.out.println("Area of Circle = " +CA);	
			
		}
		
		
	}
