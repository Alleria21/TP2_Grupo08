package ar.edu.unju.fi.ejercicio02;

import java.util.Scanner;

public class AnioBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anio = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un año");
		
		anio = scanner.nextInt();
		if((anio%4==0 && anio%100!=0) || (anio%400==0)) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
			
		scanner.close();
		}
	}

}
