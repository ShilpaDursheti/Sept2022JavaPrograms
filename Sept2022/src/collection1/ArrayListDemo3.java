package collection1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	
	public static void main(String[] args) {
		
		String[] Arr = {"Cat", "Dog", "Elephant"};
		
		for(String value: Arr) {
		System.out.println(value);
	}
		
		ArrayList<String> Al = new ArrayList<String>(Arrays.asList(Arr));
		System.out.println(Al);
	}
	
}
