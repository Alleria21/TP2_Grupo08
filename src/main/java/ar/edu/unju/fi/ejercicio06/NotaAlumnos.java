package ar.edu.unju.fi.ejercicio06;

import java.util.Scanner;

public class NotaAlumnos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		boolean band = false;
		while(band == false) {
			System.out.println("Ingrese un numero entero: ");
			numero = entrada.nextInt();
			if (numero <= 0 || numero > 10) {
				System.out.println("Valor no permitido");
				band = true;
			}else {
				if (numero < 6 && numero >= 1) {
					System.out.println("El alumno desaprueba");
				}else {
					if (numero == 6) {
						System.out.println("El alumno regulariza");
					}else {
						System.out.println("El alumno promociona");
					}
				}
			}
		}
	}
}
