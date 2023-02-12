package me.mespiell.coronaCircular2;

public class Cercle {
	//El área de un círculo es pi multiplicado por el radio al cuadrado (A = π r²).
	double radi;
	public Cercle(double r1) {
		this.radi = r1;
	}
	public double calcArea() {
		return Math.PI * Math.pow(radi,2.0);
	}
}
