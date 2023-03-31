package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
	Set <Integer> s = new HashSet<Integer>();
	
	boolean added = s.add(2);
	System.out.println(added);
	 added = s.add(5);
	System.out.println(added);
	 added = s.add(2);
	System.out.println(added);
	 added = s.add(7);
	System.out.println(added);
	 added = s.add(8);
	System.out.println(added);
	

s.clear();

	
	//ciclare con for off
	for (int num : s) {
		System.out.print( num);
	}
}
}
