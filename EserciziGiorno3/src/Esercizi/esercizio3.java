package Esercizi;

import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {
		String stringa = null;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire una stringa");
		stringa = scanner.nextLine();
		
		// Splitta la riga in un array di caratteri
		String[] arrayStringa = stringa.split("");
		
		String stringaSpezzata = null;
		
		for (int i=0;i<arrayStringa.length;i++) {
			if (stringaSpezzata == null) {
				stringaSpezzata = arrayStringa[i];
			} else {
				stringaSpezzata = stringaSpezzata + "," + arrayStringa[i];				
			}
		}
		
		System.out.println("String spezzata: " + stringaSpezzata);
		// Ripete fino a che la stringa è diversa da :q
		} while (!":q".equals(stringa));
	}
	
	

	}


