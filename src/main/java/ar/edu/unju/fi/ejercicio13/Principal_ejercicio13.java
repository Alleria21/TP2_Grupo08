package ar.edu.unju.fi.ejercicio13;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal_ejercicio13 {
		public static void main(String[] args) {
		Scanner feh = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = feh.nextLine();
		
		System.out.println("Ingrese fecha de ingreso yy-mm-dd: ");
		String fecha = feh.nextLine();
		
		System.out.println("Ingrese su email: ");
		String email = feh.nextLine();
		
		System.out.println("Ingrese legajo: ");
		int legajo = feh.nextInt();
		
		System.out.println("Ingrese catidad de horas: ");
		int horas = feh.nextInt();
		
		LocalDate fecha2 = LocalDate.parse(fecha);
		float total;
		if(horas > 160 )
		{
			int horasExtra= horas-160;
			total=(horasExtra*650)+(160*600);
		}else
		{
			total=horas*600;
			
		}
		Empleado unEmpleado = new Empleado(nombre, fecha2, legajo, email, horas,total);// Se agrega los caracteristicas a una persona, parametrizada 
		System.out.println(unEmpleado.toString());
		}
}
