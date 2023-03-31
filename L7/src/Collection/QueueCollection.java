package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
	Queue <Integer> q = new PriorityQueue<Integer>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	
	Integer p = q.peek();
	System.out.println(p);
	p = q.poll();
	System.out.println(p);
	
	System.out.println(q);
	
	for (Integer elem : q) {
		System.out.println(elem);
	}
	
	
	}

}
