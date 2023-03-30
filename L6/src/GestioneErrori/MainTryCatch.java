package GestioneErrori;

import java.util.Scanner;

//	GESTISCO ERRORI
//creo oggetto Prodotto e decido cosa fare se si verificano errori
public class MainTryCatch {

	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
//OPZIONE 1 
//		boolean success = false;
//		while (success == false) {
//			System.out.println("inserire nome");
//			String n = scanner.nextLine();
//			int q = askQnt();
//			//ProdottoTryCatch p ;
//			try {
//				ProdottoTryCatch p = new ProdottoTryCatch (n, q);
//				System.out.println("nuovo prodotto creato" + p.nome + p.qnt );	
//				 success = true;
//			} catch (Exception e){
//				System.out.println(e);
//				success = false;
//			} 
//			}

		
		
	 ProdottoTryCatch p = creaProdotto();
		
		System.out.println("CIAO");
		
	}//FINE main 
	
	public static int askQnt() {
		System.out.println("inserire qnt");
		int q = scanner.nextInt();
		scanner.nextLine();
		return q;
	}
	//OPZIONE 2
	public static ProdottoTryCatch creaProdotto() {
		System.out.println("Inserire nome");
		String n = scanner.nextLine();
		int q = askQnt();
		ProdottoTryCatch p;
		try {
			 p = new ProdottoTryCatch (n, q);
			System.out.println("Prodotto creato" + p.nome + p.qnt);
		}catch (Exception e) {
			System.out.println(e);
			p = creaProdotto(); // parte tutto da capo finchè i valori non sono validi
		}
		return p; // return lo dovrei mettere in try quando creo prodotto quindi OPZIONE 3
	}	
	

}


<property name="hibernate.hbm2ddl.auto" value="update" />
