package day4;

public class StringCountOfIntUpperLowercase {

	public static void main(String[] args) {
		
			String S = "Hello Java 8";
			int c = 0;
			int d = 0;
			int e = 0;
			for(int i=0; i<S.length();i++) {
				if (S.charAt(i)>='A' && S.charAt(i)<='Z') {
					c++;
				}	
				else if (S.charAt(i)>='a' &&S.charAt(i)<='z') {
					d++;
				}
				else if(S.charAt(i)>='0' && S.charAt(i)<='9'){
					e++;
				}
					
				/*else if (Character.isLowerCase(S.charAt(i))) {
					d++;
				}			
				else if (Character.isDigit(S.charAt(i))) {
					e++;*/
				
			}
			System.out.println("Number of uppercase letters is "+c);
			System.out.println("Number of lowercase letters is "+d);
			System.out.println("Number of digits = "+e);
			
	}
}
