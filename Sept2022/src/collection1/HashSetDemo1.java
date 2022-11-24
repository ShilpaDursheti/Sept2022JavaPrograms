package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		
		
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add(20);
		hs.add("Sun");
		hs.add(40);
		hs.add("Mon");
		hs.add(27);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.remove("Sun");
		System.out.println(hs);
		
		System.out.println(hs.contains(40));
		System.out.println(hs.isEmpty());
		
		for(Object e : hs) {
			System.out.print(e+ " ");
		}
		
		Iterator<Object> it = hs. iterator ();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
	}
}
