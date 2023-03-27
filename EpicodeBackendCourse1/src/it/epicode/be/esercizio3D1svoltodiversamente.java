package it.epicode.be;

import java.util.Scanner;

public class esercizio3D1svoltodiversamente {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String [] arr = leggiStringhe();
		StringheInOrdine(arr);
	}
	
	
	static String[] leggiStringhe() {
		String []stringhe = new String[3];
		
		System.out.println("inserisci stringa 1");
		stringhe[0]= s.nextLine();
		System.out.println("inserisci stringa 2");
		stringhe[1]= s.nextLine();
		System.out.println("inserisci stringa 3");
		stringhe[2]= s.nextLine();
		
		return stringhe;
	}
	
	static void StringheInOrdine(String[] a) {
		System.out.println("Selezionare l'ordine di visualizzazione ");
		Boolean order = s.nextBoolean();
		
		if(order) {
			for(int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
		} else {			
			for(int i = a.length-1; i >= 0; i--) {
				System.out.print(a[i]);
			}
		}
	} 
	
	
	
	
	
	
	
	
    
	 
}
