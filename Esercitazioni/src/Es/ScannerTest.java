package Es;

import java.util.Scanner;  // Import the Scanner class

public class ScannerTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    
    System.out.println("Qual è il tuo nome?"); // Esce in console
    String nome = scanner.nextLine();         //quello che mi arrivad dall'ultima riga dello scanner 
    //System.out.println( nome);                // lo metto qui
    
    System.out.println("Qual è il tuo cognome?"); 
    String cognome = scanner.nextLine();         
    //System.out.println( cognome);
    
    System.out.println("Qual è la tua età?"); 
    int eta = scanner.nextInt();  
    scanner.nextLine();
    //System.out.println(eta);
    
    System.out.println("Dove abiti?"); 
    String citta = scanner.nextLine();         
   // System.out.println( citta);
    
    System.out.println("Quale squadra tifi?"); 
    String squadra = scanner.nextLine();         
    //System.out.println( squadra);
    
    //OUTPUT FINALE
    System.out.print("Ciao gentile " + nome + " " + cognome + " hai "+ eta + " anni " + " ,vivi a " + citta + " e tifi la miglior squadra ovvero " + squadra);
    
   
  }
    
}
