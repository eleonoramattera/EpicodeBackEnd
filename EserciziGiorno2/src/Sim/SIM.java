package Sim;

public class SIM {

	
	private int numeroTelefono;
	private double credito;
	private Chiamata[] chiamate;



private SIM(){};
public SIM(int numeroTelefono, double credito, Chiamata[]chiamata) {
	this.numeroTelefono = numeroTelefono;
	this.credito = credito;
	this.chiamate = new Chiamata [5];
	
}


public int getNumeroTelefono() {
	return numeroTelefono;
}
public void setNumeroTelefono(int n) {
	this.numeroTelefono = n;
}
public double getCredito() {
	return credito;
}
public void setCreditoDisponibile(double c) {
	this.credito = c;
}
public Chiamata[] getChiamate() {
	return chiamate;
}
public void setChiamate(Chiamata[] chiamate) {
	this.chiamate = chiamate;
}

public void stampaDati() {
	System.out.println("Sim: " + this.numeroTelefono);
	System.out.println("Credito disponibile: " + this.credito);
	System.out.println("Lista chiamate : " + this.numeroTelefono);
	

	if (chiamate[0] != null) {
		System.out.println("- Chiamata 1: " + chiamate[0].getNumeroChiamato() + " - Durata minuti: " + chiamate[0].getDurataMinuti());
	}
	if (chiamate[1] != null) {
		System.out.println("- Chiamata 2: " + chiamate[1].getNumeroChiamato() + " - Durata minuti: " + chiamate[1].getDurataMinuti());
	}
	if (chiamate[2] != null) {
		System.out.println("- Chiamata 3: " + chiamate[2].getNumeroChiamato() + " - Durata minuti: " + chiamate[2].getDurataMinuti());
	}
	if (chiamate[3] != null) {
		System.out.println("- Chiamata 4: " + chiamate[3].getNumeroChiamato() + " - Durata minuti: " + chiamate[3].getDurataMinuti());
	}
	if (chiamate[4] != null) {
		System.out.println("- Chiamata 5: " + chiamate[4].getNumeroChiamato() + " - Durata minuti: " + chiamate[4].getDurataMinuti());
	}

}



		
}