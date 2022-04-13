package ar.edu.unju.fi.ejercicio11;

public class MostrarNumeros {
	public static void main(String[] args) {
		int numero = 320;
		do {
			System.out.println(numero+" ");
			numero = numero - 20;
		}while(numero >= 160);
	}
}
