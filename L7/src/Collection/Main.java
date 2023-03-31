package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	List<String> x = new ArrayList <String>();
	//Set<String> x = new HashSet <String>();
	//Queue<String> x = new PriorityQueue <String>();
	
	x.add("aa");
	x.add("bb");
	x.add("cc");
	x.add("dd");
	
    System.out.println(x);
    
    Iterator i = x.iterator();
    while (i.hasNext()) {
    	System.out.println(i.next());
    }
	}

}
