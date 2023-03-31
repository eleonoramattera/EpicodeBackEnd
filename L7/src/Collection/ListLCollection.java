package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListLCollection {

	public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	
	l.add(2);
	l.add(4);
	l.add(6);
	l.add(4);
	
	System.out.println("è present 2 " + l.add(2));
	System.out.println("è present 7 " + l.add(60));
	System.out.println(l);
	System.out.println(l.get(0)); //.get() legge l'elemento in base all'indice
	
	l.add(1, 50);
	System.out.println(l);
	
	//Ciclare con for
	for(int i = 0; i <l.size(); i++) {
		int elementi = l.get(i);
		System.out.println(elementi);
	}
	
	//For off lo potrei fare ma meglio for loop
	for (int numero : l) {
		System.out.println(numero);
	}
	
	
	
	
	int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};  
    // To fill complete array with a particular value
    Arrays.fill(ar, 10);
    System.out.println("Array completely filled" +
              " with 10\n" + Arrays.toString(ar));
	
	}

}
