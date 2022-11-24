package day4;

public class String1 {
	public static void main(String[] args) 	{
		
		String S1 = "I Love Java Programming";
		char S2 = 'o';
		extract(S1,S2);
	}
		/*String S3 = S1.substring(c,b);
		String S4 = S3.replace(" ", "");
		
		System.out.println(S3);
		System.out.println(S4);
		System.out.println(S4.length());*/
		
		
		
		
		public static  void extract(String S1,char S2) {
		
			
			int count = 0;
			String S = " ";
			int a = S1.indexOf(S2);
			int b = S1.lastIndexOf(S2);
			int c = a+1;
			char[] Array = S1.toCharArray();
		
			for(int i = c; i<b; i++) {
				if (Array[i]!= ' ') {
					S = S+Array[i];
					count =count+1;			
				}
			}
		System.out.println("Number of characters between the two occurences = " +count);
		System.out.println("Characters between the two occurences is "+ S);
}

}
