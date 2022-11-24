package day4;

public class ReverseString {

	public static void main(String[] args) {
		
		String S = "Java";
		String NS = "";
		char Ch;
		System.out.println(S.length());
		for(int i=0; i<S.length(); i++) {
		
			Ch = S.charAt(i);
			NS =Ch+NS;
		}
		System.out.println(NS);
	}
}
