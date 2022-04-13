package ar.edu.unju.fi.ejercicio12;

import java.util.Scanner;

public class CaidaLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double g= 9.81;
		double h,t;
		Scanner scanner= new Scanner(System.in);
				System.out.println("Ingrese un valor de altura en metros");
		h=scanner.nextDouble();
		t=Math.sqrt(2*h/g);
		System.out.println("El calculo es: "+ " "+ t);
		
		scanner.close();
	}

}
