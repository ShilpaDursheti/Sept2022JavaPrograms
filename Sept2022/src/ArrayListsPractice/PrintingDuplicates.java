package ArrayListsPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintingDuplicates {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Shilpa");
		names.add("Divya");
		names.add("Swetha");
		names.add("Divya");
		names.add("Shilpa");
		
		HashSet<String>hs = new HashSet<>();
		 
		for(String name : names) {
		
			if (hs.add(name)== false)
				System.out.println(name);
		}
		
		
		
		
		
	}
	

}
