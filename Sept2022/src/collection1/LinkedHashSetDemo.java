package collection1;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
		public static void main(String[] args) {
			
			LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
			
			lhs.add(50);
			lhs.add(10);
			lhs.add(30);
			lhs.add(null);
			lhs.add(56);
			lhs.add(30);
			
			
			
		for(Integer num:lhs)
				System.out.println(num);
			
	
	
	
	
		}

}
