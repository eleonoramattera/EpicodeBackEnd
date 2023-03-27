package it.epicode.be;

import java.util.Scanner;

public class esercizio4D1parte1 {

	public static void main(String[] args) {
		perimetroRettangolo();
		
	}
	public static double calcoloDelPerimetroDelRettangolo(double base, double altezza) {
	double calcoloPerimetro = (base*2) + (altezza*2);
		
		return calcoloPerimetro;
		
	}
	public static void perimetroRettangolo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calcola il perimetro del rettangolo");
		System.out.println("Inserisci la lunghezza della base");
		double base = scanner.nextDouble();
		System.out.println("Inserisci la lunghezza dell'altezza*");
		double altezza = scanner.nextDouble();      
		//mi salvo il calcolo per perimetro fatto da riga 11 a riga 14 // richiamo il metodo
		double risultato = calcoloDelPerimetroDelRettangolo(base, altezza);
		System.out.println("il risultato è " + risultato);
	}
}
