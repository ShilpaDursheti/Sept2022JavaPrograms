package day4;
import java.util.Scanner;

public class ReplaceSubstring {
	
	public static void main(String[] args) {
		System.out.print("Enter a Sentence = ");
		Scanner Sc = new Scanner (System.in);
		String S1 = Sc.nextLine();
		System.out.print("Enter the new word = ");
		String S2 = Sc.next();
		System.out.print("Enter the Sub string to be changed= ");
		String S3 = Sc.next();
		//System.out.println(S1.replace(S3,S2));
		Sc.close();
		
		String[] Str = S1.split(" ");
		
		
		for(int i=0; i<Str.length; i++) {
			if (Str[i].equals(S3)) {
				Str[i]=S2;
			}
			
			System.out.print(Str[i]+" ");
		}
	}

}
