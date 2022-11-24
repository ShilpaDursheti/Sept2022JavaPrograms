package assignments3;

public class Student1 {

	String Name;
	String phone_num;
	String Address;
	
	public static void main(String args[]) {
		
		Student1 a = new Student1();
		a.Name = "Sam";
		a.phone_num = "4087645372";
		a.Address = "2739 Alma court, Pleasanton.";
		
		
		Student1 b = new Student1();
		b.Name = "John";
		b.phone_num = "4086453219";
		b.Address = "2897 fisher court, pleasanton";
		
		
		System.out.println(a.Name);
		System.out.println(a.phone_num);
		System.out.println(a.Address);
		System.out.println();
		
		System.out.println(b.Name);
		System.out.println(b.phone_num);
		System.out.println(b.Address);
		
	}
	
			
}