package collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList<String> al_dup = new ArrayList<String>();
		
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		System.out.println(al_dup);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}
