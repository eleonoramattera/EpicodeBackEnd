package Esercizi;

import java.util.Scanner;

public class esercizio1 {

	public static void main(String[] args) {
	StringaPariDispari();
			
			AnnoBisestile();
			
			
		}
		
		public static void StringaPariDispari() {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("inserisci carattere");

		//Devo controllare se il numero di caratteri della stringa è pari o dispari
			String stringa = scanner.nextLine();
			boolean pari = stringaPariDispari(stringa);
			
			if (pari == true) {
				System.out.println("Pari");
			} else {
				System.out.println("Dispari");
			}
			
		}
		
		
		
		public static void AnnoBisestile() {
			
			Scanner scanner = new Scanner(System.in);
			// Devo controllare se l'anno è bisestile
			System.out.println("Inserire l'anno ");
			int anno = scanner.nextInt();
			
			boolean bisestile = annoBisestile(anno);
			
			if (bisestile == true) {
				System.out.println("L'anno " + anno + " è bisestile");
			} else {
				System.out.println("L'anno " + anno + " non è bisestile");
			}
			
		}
		
		public static boolean stringaPariDispari(String stringa) {
			// Verificare  n caratteri della stringa
			int numCaratteri = stringa.length();
			
	
			if ( numCaratteri % 2 == 0) {
			 	return true;
			} else {
			
				return false;
			}
			
		}
		
		public static boolean annoBisestile(int anno) {
			if ( anno % 4 == 0) {
			
				return true;
			} else	if ( anno % 100 == 0 && anno % 400 == 0) {
			
					return true;
			}
			return false;
		}
		

	}


