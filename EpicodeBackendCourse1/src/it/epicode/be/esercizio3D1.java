package it.epicode.be;

import java.util.Scanner;

public class esercizio3D1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //scanner

		System.out.println ("STRINGA 1");
		String uno =scanner.nextLine();
		System.out.println ("STRINGA 2");
		String due =scanner.nextLine();
		System.out.println ("STRINGA 3");
		String tre =scanner.nextLine();
	//OUTPUT IN ORDINE 
		System.out.println(uno + ", " + due + ", " + tre );
	//OUTPUT AL CONTRARIO
		System.out.println (tre + ", " + due + ", " + uno);
	
		
		//ESERCIZIO SVOLTO DIVERSAMENTE
		String stringhe[] =new String[3];
		System.out.println ("STRINGA 1 con array");
		stringhe[0] =scanner.nextLine();
		System.out.println ("STRINGA 2 con array");
		stringhe[1] =scanner.nextLine();
		System.out.println ("STRINGA 3 con array");
		stringhe[2] =scanner.nextLine();
				
	//OUTPT IN ORDINE
		System.out.println(stringhe[0] + " " + stringhe[1] + " " +  stringhe[2]);
		//OUTPT AL CONTRARIO
	   System.out.println(stringhe[2] + " " + stringhe[1] + " " + stringhe[0]);
	}
	
	

}
