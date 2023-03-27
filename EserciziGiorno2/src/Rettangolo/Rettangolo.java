package Rettangolo;

public class Rettangolo {
private double altezza;
private double larghezza;
	
double perimetroR;
double areaR;

private Rettangolo ( ) {
	
};

public Rettangolo (double altezza, double larghezza) {
this();
this.altezza = altezza;
this.larghezza = larghezza;
}


public double calcolaPerimetro () {
	double perimetroR = (this.altezza*2) + (this.larghezza*2);
	return perimetroR ;
}

public double calcolaArea () {
	double areaR = this.altezza * this.larghezza;
	return areaR;
}

public static void   stampaRettangolo (Rettangolo r1) {
	System.out.println(r1.calcolaArea() + r1.calcolaPerimetro());
	
	
}

public static void stampaDueRettangoli (Rettangolo r1, Rettangolo r2) {
	
	
	stampaRettangolo(r1);
	stampaRettangolo(r2);
	
	double sommaArea = r1.calcolaArea() + r2.calcolaArea();
	double sommaPerimetro =  r1.calcolaPerimetro() + r2.calcolaPerimetro();
	
	
	System.out.println(sommaPerimetro);
	System.out.println(sommaArea);
	
	
}



}




