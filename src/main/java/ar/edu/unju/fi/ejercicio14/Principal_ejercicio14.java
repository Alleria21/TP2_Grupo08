package ar.edu.unju.fi.ejercicio14;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio13.Empleado;

public class Principal_ejercicio14 {
	public static void main(String[] args) {
		
		//Creacion del empleado 1
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = entrada1.nextLine();
		
		System.out.println("Ingrese fecha de ingreso yy-mm-dd: ");
		String fecha = entrada1.nextLine();
		
		System.out.println("Ingrese su email: ");
		String email = entrada1.nextLine();
		
		System.out.println("Ingrese legajo: ");
		int legajo = entrada1.nextInt();
		
		System.out.println("Ingrese catidad de horas: ");
		int horas = entrada1.nextInt();
		
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
		Empleado unEmpleado = new Empleado(nombre, fecha2, legajo, email, horas,total);
		System.out.println(unEmpleado.toString());
		
		
		//Creacion del empleado 2
		Scanner entrada2=new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = entrada2.nextLine();
		System.out.println("Ingrese fecha de ingreso yy-mm-dd: ");
		fecha = entrada2.nextLine();
		System.out.println("Ingrese catidad de horas: ");
		horas = entrada2.nextInt();
		 if (fecha != ""){
			fecha2= LocalDate.parse(fecha);
		}else
			{
			fecha2= LocalDate.parse("1900-01-01");
		}
		Empleado segunEmpleado= new Empleado();
		segunEmpleado.setFechaIngresoNombreHoras(fecha2, nombre, horas);
		System.out.println(segunEmpleado.Mostrar2());
		
		//Creacion del empleado 3
		Scanner entrada3=new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = entrada3.nextLine();
		System.out.println("Quiere ingresar el legajo S/N: ");
		String respuesta = entrada3.nextLine();
		if (respuesta=="s" | respuesta=="S") {
			legajo = entrada3.nextInt();
		}else {
			legajo=-9999;
		}
		System.out.println("Ingrese catidad de horas: ");
		horas = entrada3.nextInt();
		Empleado tercEmpleado= new Empleado();
		tercEmpleado.setLegajoNombreHoras(legajo, nombre, horas);
		System.out.println(tercEmpleado.Mostrar());
		
		//Creacion del empleado 4
		Scanner entrada4=new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = entrada4.nextLine();
		System.out.println("Ingrese catidad de horas: ");
		horas = entrada4.nextInt();
		Empleado cuarEmpleado= new Empleado();
		cuarEmpleado.setNombreHoras(nombre, horas);
		System.out.println(cuarEmpleado.Mostrar3());
		entrada1.close();
		entrada2.close();
		entrada3.close();
		entrada4.close();
	}
}
