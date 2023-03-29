package GestioneErrori;

public class ProdottoTryCatch {

	String nome;
	int qnt;
	
	//COSTRUTTORE
	public ProdottoTryCatch (String n, int q) throws Exception {
		if(n == "") {
			throw new Exception ("nome non valido");
		}
		this.nome = n;
		
		if (q < 0) {
			throw new Exception ("qnt non valida");
		}
		this.qnt = q;
	}
}

// qui creo il prodotto e DEFINISCO  che potrebbero esserci errori
// e metto throw ed Exception che sarebbe la superclasse o classe globale
// di tutte le exception. ci sono varie tipologie