package Articolo;

import java.util.Scanner;

public class Runnable {
	
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		Articolo a1 = new Articolo ("descrizione", 40);
//		System.out.println(a1.generateCodice());
//		System.out.println(a1.getDescrizione());
//		a1.setDescrizione("descrizione nuova");
//		System.out.println(a1.getDescrizione());
		
        Articolo a2 = new Articolo ("descrizione 2", 58);
      //  System.out.println(a2.generateCodice());
        a2.setPrezzo(10);
        Articolo.setIva(5.24);
        System.out.println( Articolo.getIva());
        System.out.println(a2.getPrezzo());



	// Articolo.impostaIva();
	
		Cliente c1 = new Cliente("Anna", "Rossi", "annarossi@gmail.com");
       System.out.println(c1);
		c1.setNome("annalisa");
         System.out.println(c1.getNome());
         System.out.println(c1.getCodice());
	}

}
