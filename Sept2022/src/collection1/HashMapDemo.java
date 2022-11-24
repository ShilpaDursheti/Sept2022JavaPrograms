package collection1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	
	public static void main(String[] args) {
		
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		
		hm.put(23, "Shilpa");
		hm.put(12, "Shwetha");
		hm.put(54, "Divya");
		hm.put(22, "Swapna");
		
		
		System.out.println(hm.get(54));
		
		System.out.println(hm);
		
		for(String values: hm.values()) {
			System.out.println(values);
		}
		for(Integer Keys: hm.keySet()) {
			System.out.println(Keys);
		}
		
		
		for(Map.Entry hmDisplay: hm.entrySet()) {
			System.out.println(hmDisplay.getKey()+ " "+ hmDisplay.getValue());
		}
		
		
			
		}
		
	}

