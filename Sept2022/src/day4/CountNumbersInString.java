package day4;

public class CountNumbersInString {
	public static void main(String[] args) {
		String s = "I have 22 bananas, 121 pencils, and 32 apples";
        String[] sarr = s.split(" ");
        int count = 0;
        
        for(int i=0; i< sarr.length;i++)  {
            try {
            	String str = sarr[i];
                Integer.parseInt(str);
                count++;
            } catch(NumberFormatException e) {
            	
            }
                
            
        }
        System.out.println(count);
    }

		
		
	}


