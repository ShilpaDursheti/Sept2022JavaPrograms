package collection1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		//fifo
		
		q.add("Shilpa");
		q.add("Swetha");
		q.add("Divya");
		q.add("Kavya");
		q.add("Ramya");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		System.out.println(q);
		
		int queueSize = q.size();
		
		for(int i=0; i<queueSize; i++) {
			System.out.println(q.poll());
		}
		
		
		
		
	}

	
	
	
	
	
	
}
