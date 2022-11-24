package assignments3;
import java.util.Scanner;
public class ScannerMultipicationTable2 {
	public static void main(String args[]) {
		
	int i, a;
	Scanner Sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		a = Sc.nextInt();
		
		 for(i=1; i<=10;i++) {
				System.out.println( a +" x "+i+ " = " +a*i);
			}
			
		}


}
