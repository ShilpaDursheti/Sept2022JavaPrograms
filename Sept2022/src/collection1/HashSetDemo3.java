package collection1;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		HashSet<Integer>Set1 = new HashSet<Integer>();
		
		Set1.add(1);
		Set1.add(2);
		Set1.add(3);
		Set1.add(3);
		Set1.add(4);
		Set1.add(5);
		
		System.out.println(Set1);
		
		HashSet <Integer>Set2 = new HashSet <Integer>();
		
		Set2.add(3);
		Set2.add(4);
		Set2.add(5);
		System.out.println(Set2);
		
		//union
		/*Set1.addAll(Set2);
		System.out.println("Union:" +Set1);
		
		//Intersection
		Set1.retainAll(Set2);
		System.out.println("Intersection:" +Set1);*/
		
		//Difference
		//Set1.removeAll(Set2);
		//System.out.println("Difference:" +Set1);
		
		//subset
		
		System.out.println(Set1.containsAll(Set2));
		
		
		
	}
}
