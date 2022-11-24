package day4;
import java.util.Scanner;

public class StringContains {
	
	public static void main(String[] args) {
		
		int count = 0;
		System.out.print("Enter the String = ");
		Scanner Sc = new Scanner(System.in);
		String S1 = Sc.nextLine();
		System.out.print("Enter the word = ");
		String S2 = Sc.next();
		//System.out.println(S1.contains(S2));
		Sc.close();
		
		
		String[] Array1 = S1.split(" ");
		
		
		for(int i=0; i<Array1.length; i++) {
			if(Array1[i].equalsIgnoreCase(S2)) {
				count = count+1;
			}
		}
				System.out.println(S2 +" Word present in the String " + count+ "times");
				
			
				
			
		}
		
	}


		