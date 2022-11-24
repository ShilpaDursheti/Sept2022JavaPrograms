package assignments3;

public class Swap2Strings {
	public static void main(String args[]) {
		
		String S = "Welcome";
		String S1 = "Home";
		
		S= S.concat(S1);
		S1= S.substring(0, S.length()-S1.length());
		S= S.substring(S1.length());
		
		
		System.out.println("After Swapping"+" "+ S+ " " + S1);
		
		
		
		
	}

}
