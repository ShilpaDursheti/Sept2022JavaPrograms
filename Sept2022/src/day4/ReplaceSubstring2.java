package day4;

public class ReplaceSubstring2 {
	
	public static void main(String[] args) {
	String S1 = "Dog chases cat";
	String S2 = "Rat";
	String S3 = "cat";
		
		String[] Str = S1.split(" ");
		
		
		for(int i=0; i<Str.length; i++) {
			if (Str[i].equalsIgnoreCase(S3)) {
				Str[i]=S2;
			}
			
			System.out.print(Str[i]+" ");
		}
	}

}
