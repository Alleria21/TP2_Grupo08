package ar.edu.unju.fi.ejercicio15;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void calcularEdad(int anioActual, int anioNacimiento) {
		int edad = Math.abs(anioActual - anioNacimiento);
		System.out.println("Edad: "+edad);
	}
	
	public void calcularZodiaco(LocalDate fechaNacimiento) {
		int dia = fechaNacimiento.getDayOfMonth();
		int mes = fechaNacimiento.getMonthValue();
		switch(mes) {
		case 1:
			if (dia >= 21) {
				System.out.println("Signo zodiacal: Acuario");
			}else {
				System.out.println("Signo zodiacal: Capricornio");
			}break;
		case 2:
			if (dia >= 20) {
				System.out.println("Signo zodiacal: Piscis");
			}else {
				System.out.println("Signo zodiacal: Acuario");
			}break;
		case 3:
			if (dia >= 21) {
				System.out.println("Signo zodiacal: Aries");
			}else {
				System.out.println("Signo zodiacal: Piscis");
			}break;
		case 4:
			if(dia >= 20) {
				System.out.println("Signo zodiacal: Tauro");
			}else {
				System.out.println("Signo zodiacal: Aries");
			}break;
		case 5:
			if (dia >= 21) {
				System.out.println("Signo zodiacal: Geminis");
			}else {
				System.out.println("Signo zodiacal: Tauro");
			}break;
		case 6:
			if (dia >= 23) {
				System.out.println("Signo zodiacal: Cancer");
			}else {
				System.out.println("Signo zodiacal: Geminis");
			}break;
		case 7:
			if (dia >= 24) {
				System.out.println("Signo zodiacal: Leo");
			}else {
				System.out.println("Signo zodiacal: Cancer");
			}break;
		case 8:
			if (dia >= 24) {
				System.out.println("Signo zodiacal: Virgo");
			}else {
				System.out.println("Signo zodiacal: Leo");
			}break;
		case 9:
			if (dia >= 23) {
				System.out.println("Signo zodiacal: Libra");
			}else {
				System.out.println("Signo zodiacal: Virgo");
			}break;
		case 10:
			if (dia >= 23) {
				System.out.println("Signo zodiacal: Escorpio");
			}else {
				System.out.println("Signo zodiacal: Libra");
			}break;
		case 11:
			if (dia >= 22) {
				System.out.println("Signo zodiacal: Sagitario");
			}else {
				System.out.println("Signo zodiacal: Escorpio");
			}break;
		case 12:
			if (dia >= 23) {
				System.out.println("Signo zodiacal: Capricornio");
			}else {
				System.out.println("Signo zodiacal: Sagitario");
				}break;
		}
	}
	
	public void calcularEstacion(LocalDate fechaNacimiento) {
		int dia = fechaNacimiento.getDayOfMonth();
		int mes = fechaNacimiento.getMonthValue();
		switch(mes) {
		case 1:
			System.out.println("Estacion: Verano"); break;
		case 2:
			System.out.println("Estacion: Verano"); break;
		case 3:
			if (dia >= 21) {
				System.out.println("Estacion: Otonio");
			}else {
				System.out.println("Estacion: Verano");
			}break;
		case 4:
			System.out.println("Estacion: Otonio"); break;
		case 5:
			System.out.println("Estacion: Otonio"); break;
		case 6:
			if (dia >= 21) {
				System.out.println("Estacion: Invierno");
			}else {
				System.out.println("Estacion: Otonio");
			}break;
		case 7:
			System.out.println("Estacion: Invierno");break;
		case 8:
			System.out.println("Estacion: Invierno");break;
		case 9:
			if (dia >= 21) {
				System.out.println("Estacion: Primavera");
			}else {
				System.out.println("Estacion: Invierno");
			}break;
		case 10:
			System.out.println("Estacion: Primavera");break;
		case 11:
			System.out.println("Estacion: Primavera");break;
		case 12:
			if (dia >= 21) {
				System.out.println("Estacion: Verano");
			}else {
				System.out.println("Estacion: Primavera");
			}break;
		}
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + ", fecha de Nacimiento: " + fechaNacimiento + "";
	}
}
