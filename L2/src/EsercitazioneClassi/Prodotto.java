package EsercitazioneClassi;

public class Prodotto {
 double price = 20;
 private double sale = 0.20;
private String nome ;

 static int priceChanged = 0 ; // static è condiviso da tutte le istanze della classe che definisco nell'altro file (p1 p2..)

 public String getNome() {
	 return nome;
 }
 
 public void setNome( String n) {
	 nome = n;
 }
 
 public double getPrice() { //metodo che mi legge il prezzo
	 return price;
 }
 public void setPrice (double p) { // cambio prezzo e 
	priceChanged ++;
	price = p;
}

 public double getRisparmio ( ) {
	 return (getSconto() /price)*100;
 };
 
 
public double getSconto ( ) {
	return price * 0.20;
}


public double getSale() {
	return sale;
}

public void setSale(double s) {
	if (s<= 1 ) {
	sale = s;}
}

//OVERLOD stesso metodo parametri diversi 
private void setInfo1( String name , double price) {
	nome = name;
	price = price;
}

public void setInfo2 ( String [] data) { // data è il nome
	//nome = data[0];
	//price= Double.parseDouble(data[1]);
	setInfo1(data[0], Double.parseDouble(data[1]));
}

//COSTRUTTORI
private Prodotto () {
	System.out.println("nuovo prodotto da zero");
}
public Prodotto (String nome) {
	this();
	this.nome = nome;
	System.out.println("nuovo prodotto con nome " + nome);
};
public Prodotto (String nome, double price) {
	this(nome);
	this.price = price;
	System.out.println("nuovo prodotto con price " + price);
}



}