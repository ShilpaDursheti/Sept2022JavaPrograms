package assignments3;
import java.util.Scanner;
public class ScannerMultipicationTable {
	public static void main(String args[]) {
		
	int i,j, a,b;
	Scanner Sc = new Scanner(System.in);
		System.out.print("Enter any two numbers = ");
		a = Sc.nextInt();
		b = Sc.nextInt();
		for(i=a; i<=b;i++){
		 for(j=1; j<=10;j++) {
				System.out.println( i +" x "+j+ " = " +a*j);
			}
			
		}
}

}
