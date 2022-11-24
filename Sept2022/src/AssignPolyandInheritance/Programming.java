package AssignPolyandInheritance;

public class Programming {
	
	String S;

	public Programming() {
		S = "I love programming languages";
	}
	
	public Programming(String str) {
		S= "I Love " +str;
	}
	
	public static void main(String[] args) {
		
		Programming obj = new Programming();
		System.out.println(obj.S);
		
		Programming obj1 = new Programming("Chocolates");
		System.out.println(obj1.S);
		
	}
	
	
	
	
}
