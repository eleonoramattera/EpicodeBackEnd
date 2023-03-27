package Articolo;

public class Articolo {
	//Variabili private che gestisco poi con Get e Set
	private String codice;
	private String descrizione;
	private double prezzo;
	private int qnt;
	
	static double iva;
	static int prodottiCreati = 0;
	
	//COSTRUTTORE

public Articolo(String descrizione, int prezzo) {
	this.descrizione= descrizione;
	this.prezzo = prezzo + (prezzo * Articolo.iva);
	this.qnt =10;
	Articolo.prodottiCreati ++;
	this.codice = generateCodice();
	}

	// c'è il this quindi fa riferimento solo a un'istanza. 
//	String generateCodice() {
//		String codice = "ART";
//		codice += Articolo.prodottiCreati;
//		codice += this.prezzo;
//		return codice;
//	}
	//senza this è statico e non fa riferimento ad una singola istanza
	static String generateCodice() {
		String codice ="ART";
		codice += Articolo.prodottiCreati;
		return codice;
	}
	
//	public static void impostaIva() {
//		System.out.println("Inserire iva decimale");
//		Articolo.iva = Runnable.scanner.nextDouble();
//	}
	static public void setIva (double i) {
		iva = i;
	}
	static  public double getIva () {
		return iva;
	}
	
	//Descrizione
	public String getDescrizione () {
		return this.descrizione;
	}
	public void  setDescrizione (String d) {
		this.descrizione = d;
	}
	//Prezzo
	public double getPrezzo () {
		return this.prezzo;
	}
	public void setPrezzo (int p) {
		this.prezzo = p + (p * Articolo.iva);
	}

	
    
}
