package ar.edu.unju.fi.ejercicio03;
import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		int contador;
		for(contador=0;contador<5;contador++)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese un numero");
			int nro;
			nro = scanner.nextInt();
			if (nro%2==0) {
				System.out.println("Numero Par");
			}
			else {
				System.out.println("Numero Impar");
			}	
					
		}
	}
}