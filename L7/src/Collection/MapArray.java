package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapArray {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("num", 1);
		m.put("n", 2);
		m.put("numbero", 3);
		m.put("number", 4);
		
		System.out.println(m);
	    System.out.println(m.keySet());
	    
	    Set<String> keys = m.keySet();
	    System.out.println(keys);  
	    for (String k : keys) {
	    	 System.out.println(m.get(k));  
	    }
	    
	    if(m.containsKey("num")) {
	    	m.put("num", 70);
	    }
	    
	  
		System.out.println(m);
	    
	}
	

}
