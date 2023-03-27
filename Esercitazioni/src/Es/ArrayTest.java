package Es;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numeri = new int[3]; //array vuoto di 3 elementi
		numeri[0]= 140;
		numeri[1]= 123;
		numeri[2]= 345;
	//	numeri[3]= 65; errore
		numeri[2]= 454; //riassegno valore 
		
		System.out.println(numeri[0]);
		System.out.println(numeri[2]);

		int[] numeri2 = {10,33, 40, 24}; //array pieno
		System.out.println(numeri2.length);
		System.out.println(numeri2 [numeri2.length-2]);
		
		System.out.println(numeri2 ); // in console così mi esce un codice. per vedere bene tutto l'array lo ciclo
		System.out.println( Arrays.toString(numeri2) ); // o uso classe Array.toString
		
		//FOR
		for (int i = 0; i< numeri2.length; i++) {
		System.out.print(numeri2[i] + ","  );
		}
		
		//FOR EACH
		for (int num :numeri2) {
			System.out.print(num + ",");
		}
		
		//ARRAY MULTIDIMENSIONALI
		String [][] classi = new String [2][4];
		classi[0][0]="Dino";
		classi[0][1]="Dario";
		classi[0][2]="Damiano";
		classi[0][3]="Daria";
		
		classi[1][0]="Antonio";
		classi[1][1]="Antonella";
		classi[1][2]="Tonia";
		classi[1][3]="Tony";
		
		System.out.println(classi[0][1]);
	//FOR	
		for (int i = 0; i<classi.length; i++) {
			System.out.println();
			for ( int x= 0; x < classi[i].length; x++) {
				System.out.print(classi[i][x] + ", ");
			}
			
		}
		//FOR EACH
		for (String[] i : classi) {
			System.out.println();
		  for (String x : i) {
			System.out.println(x);
		  }
		  }
			
	// i è la singola classe
	// x è lo studente

		
		
		
	}

}
