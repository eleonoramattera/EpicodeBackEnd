package EsercitazioneClassi;

public class Main {
	
public static  void main (String[] args) {

Prodotto p1 = new Prodotto("Maglia");
System.out.println(p1.price);
System.out.println(p1.getPrice());
p1.setPrice(50);
System.out.println(p1.price);
System.out.println(Prodotto.priceChanged);
System.out.println(p1.getSale());
p1.setSale(0.4);

System.out.println(p1.getSconto());
System.out.println(p1.getRisparmio());

p1.setNome("GONNA");
System.out.println(p1.getNome());

Prodotto p2 = new Prodotto("Scarpe", 50);
System.out.println(p2.price);
p2.setPrice(40);
System.out.println(p2.price);
System.out.println(Prodotto.priceChanged);

Prodotto p3= new Prodotto("jeans");
p3.setPrice(90);
System.out.println(p3.price);

String [] x = {"pantalone", "20"};
p1.setInfo2(x);

}
}