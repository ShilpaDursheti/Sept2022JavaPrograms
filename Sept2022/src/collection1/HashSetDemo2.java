package collection1;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String args[]) {
		
		HashSet<Integer>evenNumbers = new HashSet<Integer>();
		
		
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		
		System.out.println(evenNumbers);
		
		HashSet<Integer>numbers = new HashSet<Integer>();
		
		numbers.addAll(evenNumbers);
		numbers.add(10);
		numbers.add(8);
		System.out.println(numbers);
		
		numbers.removeAll(evenNumbers);
		System.out.println(numbers);
		
		
		
		
		
	}

	
	
	
	
	
	
}
