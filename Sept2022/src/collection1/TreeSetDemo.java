package collection1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet <Integer>();
		
		ts.add(52);
		ts.add(23);
		ts.add(34);
		ts.add(24);
		
		System.out.println(ts);
		
		/*for(Integer i:ts) {
			System.out.println(i);
		}*/
		
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
