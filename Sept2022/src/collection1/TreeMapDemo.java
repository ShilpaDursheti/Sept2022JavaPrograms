package collection1;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

		
		public static void main(String[] args) {
			
			TreeMap<Integer,String>hm = new TreeMap<Integer,String>();
			
			hm.put(23, "Shilpa");
			hm.put(12, "Shwetha");
			hm.put(54, "Divya");
			hm.put(22, "Swapna");
			hm.put(34, null);
			
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
