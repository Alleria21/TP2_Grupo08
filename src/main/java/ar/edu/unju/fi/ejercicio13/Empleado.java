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

	
	
	
	public void setLegajoNombreHoras(int legajo,String nombre,int horasTrabajo) { 
		this.legajo = legajo;
		this.nombre=nombre;
		this.horasTrabajo = horasTrabajo;
		
	}
	public String Mostrar() {
		 return "Empleado: " + nombre + ", Legajo: " + legajo + ", horas trabajadas: " + horasTrabajo;
	 }
	
	
	
	
	public void setFechaIngresoNombreHoras(LocalDate fecha_ingreso,String nombre,int horasTrabajo) { 
		this.fecha_ingreso = fecha_ingreso;
		this.nombre=nombre;
		this.horasTrabajo = horasTrabajo;
		
	}
	public String Mostrar2() {
		 return "Empleado: " + nombre + ", Fecha de Ingreso: " + fecha_ingreso + ", horas trabajadas: " + horasTrabajo;
	 }
	
	
	
	public void setNombreHoras(String nombre,int horasTrabajo) { 
		this.nombre=nombre;
		this.horasTrabajo = horasTrabajo;
		
	}
	public String Mostrar3() {
		 return "Empleado: " + nombre + ", horas trabajadas: " + horasTrabajo;
	 }
	
	
	
	
	
	
	
}
