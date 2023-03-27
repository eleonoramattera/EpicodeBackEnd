package Esercizi;

import java.util.Scanner;

public class esercizio2 {
	public static void main(String[] args) {
	
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("scrivi un  numero da 0 a 3 per tarformarlo in lettere");
				
				int numero = scanner.nextInt();
				String numeroInLettere = null;
				
				switch (numero) {
				case 0: {
					numeroInLettere = "Zero";
					break;
				}
				case 1: {
					numeroInLettere = "Uno";
					break;
				}
				case 2: {
					numeroInLettere = "Due";
					break;
				}
				case 3: {
					numeroInLettere = "Tre";
					break;
				}
				default:
					numeroInLettere = "Numero non compreso tra 0 e 3, impossibile convertire";
				}
				
				System.out.println("Risultato: " + numeroInLettere);
			}

	}

