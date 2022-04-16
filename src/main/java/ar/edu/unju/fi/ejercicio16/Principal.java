package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nro;
		System.out.println("Ingrese un nro");
		nro = scanner.nextInt();
		CalculoMatematico unCalculoMatematico = new CalculoMatematico(nro); // aca va el setter
		unCalculoMatematico.setN(nro);
		System.out.println("El valor ingresado es "+unCalculoMatematico.getN());
		int sumatoria=unCalculoMatematico.calcularSumatoria();
			System.out.println("Sumatoria "+sumatoria);
		int productoria=unCalculoMatematico.calcularProductoria();
			System.out.println("Productoria "+productoria);
	}
}
