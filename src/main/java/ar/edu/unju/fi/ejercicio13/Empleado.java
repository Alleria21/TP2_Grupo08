package ar.edu.unju.fi.ejercicio13;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private LocalDate fecha_ingreso;
	private int legajo;
	private String email;
	private float sueldo;
	private int horasTrabajo;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, LocalDate fecha_ingreso, int legajo, String email, int horasTrabajo,float sueldo) {
		super();
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.legajo = legajo;
		this.email = email;
		this.sueldo=sueldo;
		this.horasTrabajo = horasTrabajo;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fecha_ingreso=" + fecha_ingreso + ", legajo=" + legajo + ", email="
				+ email + ", sueldo=" + sueldo + ", horasTrabajo=" + horasTrabajo + "]";
	}


	
}
