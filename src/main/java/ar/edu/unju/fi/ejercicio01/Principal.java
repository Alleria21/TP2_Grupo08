package ar.edu.unju.fi.ejercicio01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = entrada.nextInt();
		int factorial = 1;
		if (numero > 10 || numero < 0) {
			System.out.println("El numero ingresado debe encontrarse en un rango [0,10]");
		}else {
			if (numero == 0) {
				System.out.println("El factorial del numero es: 1");
			}else{
				while(numero > 0) {
					factorial = factorial * numero;
					numero--;
				}
				System.out.println("El factorial del numero es: "+factorial);
			}
		}
	}
}
