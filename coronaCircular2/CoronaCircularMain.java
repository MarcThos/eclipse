package me.mespiell.coronaCircular2;

import java.util.Scanner;

public class CoronaCircularMain {
	/*
	   
	Cálculo del área de una corona circular.
	Los valores de los radios se entran por teclado.
	   
	Instrucciones:
	Desde el método que calcula el área de la corona se debe llamar a
	otro método que calcule el área de un círculo, ya que el área de una
	corona circular es el área del 'círculo mayor' menos el área del
	'círculo menor'.
	   
	   
	Salida del programa
	----------------------------------------
	Escribe el radio interior : 6
	Escribe el radio exterior : 9
	El area es 141,37
	   
	*/
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		System.out.print("Escriu el radi interior: ");
		double rInterior = teclat.nextDouble();
		Cercle a = new Cercle(rInterior);
		System.out.print("Escriu el radi exterior: ");
		double rExterior = teclat.nextDouble();
		Cercle b = new Cercle(rExterior);
		teclat.close();
		
		System.out.printf("El area es %.2f",Corona.getArea(a,b));
	}
}
