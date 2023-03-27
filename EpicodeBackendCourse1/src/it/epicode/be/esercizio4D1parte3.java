package it.epicode.be;

public class esercizio4D1parte3 {

	public static void main(String[] args) {
	 perimetroTrinangolo(12, 4, 2);
   
	}
	
	public static double perimetroTrinangolo (double a, double b, double c) {
		double perimetro = a+b+c;
		double areaTriangolo = (a*b)/2;
		return areaTriangolo;
	}

}
