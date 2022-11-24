package AssignPolyandInheritance;

public class Student {
	
	String StudentName;
	
		public Student() {
			StudentName = "unknown";
		}
		public Student(String S) {
			StudentName = S;
		}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		System.out.println(obj.StudentName);
		
		Student A = new Student("Shilpa");
		System.out.println(A.StudentName);
		
		Student B = new Student("Divya");
		System.out.println(B.StudentName);
		
		
	}
	
	
	
	
	
	
	
	

}
