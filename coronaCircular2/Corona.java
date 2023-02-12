package me.mespiell.coronaCircular2;

public class Corona {
	Cercle a,b;
	
	Corona(Cercle a, Cercle b) {
		this.a = a;
		this.b = b;
	}
	Corona(double r1, double r2) {
		a = new Cercle(r1);
		b = new Cercle(r2);
	}
	
	public static double getArea(Cercle a, Cercle b) {
		return Math.abs(a.calcArea() - b.calcArea());
	}
}
