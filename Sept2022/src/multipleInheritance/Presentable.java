package multipleInheritance;

public class Presentable implements Guests, Gift{
	
	public void present() {
		
		System.out.println("Welcome");
	}
	
	/*public int Sum(int a, int b) {
		int Sum = a + b;
		return Sum;	 
	}
	
	public double Sum(double a, double b) {
		double Sum  = a + b;
		return Sum;	 
	}*/
	

	
public static void main(String[] args) {
	
	Presentable obj = new Presentable();
	obj.present();
	//int Sum = obj.Sum(2,5);
	//System.out.println(Sum);

}
}