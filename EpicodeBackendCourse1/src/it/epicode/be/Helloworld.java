package it.epicode.be;

import java.util.Arrays;

public class Helloworld {

	//ESERCIZIO 1
public static void main (String[] args){
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
	//ESERCIZIO 2	
//MOLTIPLICAZIONE TRA INTERI
		int a = 10;
		int b = 20;
		int c = a*b;
		
		System.out.println(c);
		
//CONCATENA
    String s = "ciao";
    int i = 5;
    String concatenato = s + i;
    System.out.println(concatenato);
		
    //ARRAY
    String[]lettere= {"a", "b", "c", "d", "e"};
    String [] lettere2 = new String [lettere.length + 1];
    String l = "x";
    lettere2[0]= lettere[0];
    lettere2[1]= lettere[1];
    lettere2[2]= l;
    lettere2[3]= lettere[2];
    lettere2[4]= lettere[3];
    lettere2[5]= lettere[4];
    System.out.println(lettere2);
    System.out.println(lettere2[2]);

    System.out.println(Arrays.toString(lettere2));
    
		
  
		
		}

}



