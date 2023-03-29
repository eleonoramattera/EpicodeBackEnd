package GestioneErrori;

import java.util.Scanner;

public class Main {
	 static Scanner scanner =new Scanner (System.in);

	public static void main(String[] args) {

		//chiedo all'utente di inserire prodotto
		System.out.println("inserire nome prodotto");
		String n = scanner.nextLine();
		
		System.out.println("inserire qnt prodotto");
	//	int q = scanner.nextInt(); //cosi non va bene perchè qnt minima è 1 o 0 ma non valori negativi
		
		//questa parte posso metterla in una funzione
//		int q = -1;
//		while (q<0) {
//		System.out.println("inserire qnt prodotto corretta");
//		 q = scanner.nextInt();
//		}
		
		int q = askQnt();
		
		//OPZIONE 1
		while (q <0) { //ripete la funzione askQnt finchè il valore inserito non è giusto
			q = askQnt();
		}
		//OPZIONE 2
		if (q<0) {
			System.out.println("qnt errata");
		}
		
		//OPZIONE 3 
		if (q<0) {
		 q= 0;	 //metto io valore di default
		}
		
		
		Prodotto p = new Prodotto(n, q);
		System.out.println(p.nome + p.qnt);
		
	}  
	
	
	public static int askQnt() {
		//FUNZIONE OPZIONE 1
//		int q = -1;
//		while (q<0) {
//		System.out.println("inserire qnt prodotto corretta");
//		 q = scanner.nextInt();
//		}
//		return q;
		
		//FUNZIONE OPZIONE 2 
		System.out.println("inserire qnt prodotto corretta");
		int q = scanner.nextInt();
		if (q<0) {
			return -1;// valore che decido io per sapere se la qnt è giusta o no
		}
		return q; // se il valore inserito è giusto
	}

}
