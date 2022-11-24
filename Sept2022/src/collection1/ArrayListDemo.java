package collection1;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		//Declare ArrayList
		//ArrayList al = new ArrayList();
		//List al = new ArrayList();
		//ArrayList <String> al = new <String> ArrayList ();
		
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		
		//Add elements to ArrayList
		
		al.add("Apple");
		al.add(123);
		al.add("Orange");
		al.add(23);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(2,"Mango");
		al.remove(3);
		
		System.out.println(al);
		System.out.println(al.get(2));
		
		al.set(2, 240);
		System.out.println(al);
	
		//for loop 
		for(int i=0; i<al.size();i++) {
			System.out.print(al.get(i)+ " ");
		}
		System.out.println();
		//foreach loop
		for(Object e:al) {
			System.out.print(e +" ");
		}
		System.out.println();

	//using iterator
		Iterator it = al. iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
			
		}
		
	}

}
