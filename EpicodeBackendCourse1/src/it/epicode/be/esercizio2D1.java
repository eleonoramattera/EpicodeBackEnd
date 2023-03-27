package it.epicode.be;

import java.util.Arrays;

public class esercizio2D1 {

	
public static void main (String[] args){
 String arr[] = {"a", "b", "c", "d", "e"};
 
	String []arrayDefinitivo = pushTerzo( arr, "X");
	
	for(int i =0 ; i<arrayDefinitivo.length; i ++) {
	System.out.print(arrayDefinitivo[i] + ",");
	}
	
//MOLTIPLICAZIONE TRA INTERI
		int a = 10;
		int b = 20;
		int c = a*b;
		
		System.out.println(c);
		
//CONCATENA
    String s = "ciao";
    int n = 5;
    String concatenato = s + n;
    System.out.println(concatenato);
		
    //ARRAY
    String[]lettere= {"a", "b", "c", "d", "e"};
    String [] lettere2 = new String [lettere.length + 1];
    String l = "x";
    lettere2[0]= lettere[0];
    lettere2[1]= lettere[1];
    lettere2[2]= l;
    lettere2[3]= lettere[2];
    lettere2[4]= lettere[3];
    lettere2[5]= lettere[4];
    System.out.println(lettere2);
    System.out.println(lettere2[2]);

    System.out.println(Arrays.toString(lettere2));
    
    //FOR
    for (int i = 0; i < lettere2.length; i++) {
    System.out.print(lettere2[i]);
    }
}
 //ARRAY SVOLTO DIVERSAMENTE
    
		

public static String[] pushTerzo(String[]arrayDovePushare, String elemPushato) {
	String newArr[] = new String [arrayDovePushare.length + 1];
 for (int i = 0; i< newArr.length; i++ ) {
	 if (i <2 ) {
		 newArr[i] = arrayDovePushare[i];
	 } else if ( i== 2) {
		 newArr[i] = elemPushato ;
	 } else {
		 newArr[i] = arrayDovePushare[i-1];
	 }
 }

return newArr;
}
}



