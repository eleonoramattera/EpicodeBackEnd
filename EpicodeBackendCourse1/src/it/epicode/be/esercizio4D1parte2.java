package it.epicode.be;

import java.util.Scanner;

public class esercizio4D1parte2 {
	public static void main(String[] args) {
		
		PariDispari();
	}
		
	public static int numeroIntero (int numeroDaRitornare) {
		return (numeroDaRitornare % 2);
	}
		
	
	
	public static void PariDispari() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero intero per vedere se è pari o dispari");
		System.out.println("se il numero è pari esce 0, se il numero è dispari esce 1");
		int numeroDaRitornare = scanner.nextInt();
		scanner.nextLine();
		int numero = numeroIntero(numeroDaRitornare) ;
		System.out.println(numero);               
	}
 }


