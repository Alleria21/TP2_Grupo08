package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Principal_ejercio04 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			boolean r;
			String elmes=null;
			
			do {
				System.out.println("Ingrese el numero del mes: ");
				int mes=sc.nextInt();
				r = validarMes(mes);
				if (r==false) {
					System.out.println("No existe ese mes");
				}else {
					elmes=nombreMes(mes);
					System.out.println(elmes);
				}
			}while( r == true);
			
		}
		public static boolean validarMes(int mes) {
			
			if(mes>=1 && mes <=12) {
				return true;
			}else {
				return false;
			}
		}
		
		public static String nombreMes(int mes) {
			String nombre = null;
			if(mes== 1) {
				nombre="Enero";
			}
			if (mes ==2) {
				nombre="Febrero";
			}
			if (mes ==3) {
				nombre="Marzo";
			}
			if (mes ==4) {
				nombre="Abril";
			}
			if (mes ==5) {
				nombre="Mayo";
			}
			if (mes ==6) {
				nombre="Junio";
			}
			if (mes ==7) {
				nombre="Julio";
			}
			if (mes ==8) {
				nombre="Agosto";
			}
			if (mes ==9) {
				nombre="Septiembre";
			}
			if (mes ==10) {
				nombre="Octubre";
			}
			if (mes ==11) {
				nombre="Noviembre";
			}
			if (mes ==12) {
				nombre="Diciembre";
			}
			return nombre;
			
		}
}
