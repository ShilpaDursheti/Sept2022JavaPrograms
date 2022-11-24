package collection1;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo4 {
	
	public static void main(String[] args) {
		
		
		HashSet <String> flowerset = new HashSet<String> ();
		
		flowerset.add("Rose");
		flowerset.add("Lily");
		flowerset.add("Mums");
		flowerset.add("Tulip");
		
		ArrayList<String> flower_array= new ArrayList<>(flowerset);
		
		 System.out.println("Elements of flower Arraylist are :");
		 System.out.println(flower_array);        
		        

	}

}
