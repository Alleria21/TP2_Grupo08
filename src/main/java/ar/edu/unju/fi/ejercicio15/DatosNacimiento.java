package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;
import java.util.Scanner;

public class DatosNacimiento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su nombre completo: ");
		String nombrePersona = entrada.nextLine();
		System.out.println("Ingrese su fecha de nacimiento (yyyy-MM-dd): ");
		String fechaNacimiento = entrada.nextLine();
		LocalDate fecha = LocalDate.parse(fechaNacimiento);
		LocalDate fechaActual = LocalDate.now();
		
		Persona unaPersona = new Persona(nombrePersona, fecha);
		int anio = fecha.getYear();
		int anioActual = fechaActual.getYear();
		
		System.out.println(unaPersona.toString());
		unaPersona.calcularEdad(anioActual, anio);
		unaPersona.calcularZodiaco(fecha);
		unaPersona.calcularEstacion(fecha);
		
		entrada.close();
	}
}
