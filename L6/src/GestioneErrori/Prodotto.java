package GestioneErrori;

public class Prodotto {

	String nome;
	int qnt;
	
//	public Prodotto (String n, int q) {
//	this.nome = n;
//	this.qnt =q;
//	}
	
	public Prodotto (String n, int q) {
		this.nome = n;
		if (q == -1) {
			System.out.println("qnt non valida");
		}
		this.qnt = q;
		}
		
	
}
