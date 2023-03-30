package Annotations;


import lombok.Data;
import lombok.Getter;



@Data
public class Prodotto {
 @Getter 
 private String nome;
 @Getter 
 private double price;
 
 public Prodotto(String n, double p) {
	 this.nome = n;
	 this.price = p;
 }
 
}
