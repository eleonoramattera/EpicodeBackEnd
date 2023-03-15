package Test;

public class Test2 {

	public static void main(String[] args) {
	System.out.println("Eleonora");
	//Variabili tipologie numeriche
	int x =10;
	
	int a;
	a = 60;
	
	short y = 5;
	System.out.println(y);
	y = 2;
	System.out.println(y);
	
	// per id o altri valori numerici grandi
	long z = 3453452;
	
	float f = 3.0f; //decimale preciso e pesante (memoria)di solito usato per i risultati e non per valori assoluti
	System.out.println(f);
	
	double d = 25.50; // per prezzi solitamente
	//final per costanti
	final int w = 40;
	//w = 20; NO
	System.out.println(w);
	
// OPERATORI ARITMETICI//
	System.out.println(x+z-y);
	

//OPERATORI LOGICI
	boolean b = false;
	boolean c = true;
	boolean and = b && c;
	System.out.println(and);

	boolean res = a > x;
	System.out.println(res);

	int arr []= new int[2];
	arr [0]=10;
	arr[1]= 11;
	System.out.println(arr);

	int array [] = new int [3];
	int array2 [] = new int [array.length +1];
   array2[0] = array[0];
   array2[1] = array[1];
   array2[2] = array[2];
   array2[3] = 40;
   
   System.out.println(array2[3]);
	
	}
}

