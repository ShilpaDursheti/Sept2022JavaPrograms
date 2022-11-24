package encapsulation;

class EncapsTest {
	
	private int aadhar;
	private String empName;
	private int empNum;
	
	//setter methods
	public void setempAadhar(int a,String b, int c) {
		aadhar= a;
		empName= b;
		empNum= c;
	}
	
//getter methods
	
	public int getempAadhar() {
		return aadhar;
	}
	public String getempName() {
		return empName;
		
	}
	public int getempNum() {
		return empNum;
	}
	public class EncapsulationDemo{
		public static void main(String args[]) {
			EncapsTest obj= new EncapsTest();
			obj.setempAadhar(678654,"Divya",54);
			
			
			System.out.println("Employee name = "+ obj.getempName());
			System.out.println("Employee Number = "+obj.getempNum());
			System.out.println("Employee Aadhar = "+obj.getempAadhar());	
			
		}
	}
}
