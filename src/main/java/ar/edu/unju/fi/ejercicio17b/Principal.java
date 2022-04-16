package ar.edu.unju.fi.ejercicio17b;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import ar.edu.unju.fi.ejercicio17a.ProcesoFecha;

public class Principal {
	public static void main(String[] args) {
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.parse("2022-04-10"), LocalDate.parse("2000-08-22"));
		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(18, 23, 12), LocalTime.of(22, 15, 33));
		ProcesoFecha pf3 = new ProcesoFecha(LocalDateTime.of(pf1.getFecha1(),pf2.getTime1()), LocalDateTime.of(pf1.getFecha2(),pf2.getTime2()));
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.parse("2002-10-04"), LocalDate.now());
		LocalTime horaPlus = pf2.getTime1().plusHours(5);
		LocalTime horaMinus = pf2.getTime2().minusMinutes(20);
		
		//Ejercicio b1
		System.out.println(pf1.getFecha1()+"\n"+pf1.getFecha2());
		
		//Ejercicio b2
		System.out.println("\n"+pf2.getTime1()+"\n"+pf2.getTime2()+"\n");
		System.out.println(horaPlus+"\n"+horaMinus);
		
		//Ejercicio b3
		System.out.println("\n"+pf1.compararFechas());
		
		//Ejercicio b4
		System.out.println("\n"+pf3.getDateTime1()+"\n"+pf3.getDateTime2());
		
		//Ejercicio b5
		System.out.println(mostrarTiempoTranscurrido(pf4));
		
		//Ejercicio b6
	}
	
	private static String mostrarTiempoTranscurrido(ProcesoFecha fecha) {
		int dia = fecha.contarTiempoTranscurrido().getDays();
		int mes = fecha.contarTiempoTranscurrido().getMonths();
		int anio = fecha.contarTiempoTranscurrido().getYears();
		String fecha1Formateada = fecha.formatearFecha(fecha.getFecha1());
		String fecha2Formateada = fecha.formatearFecha(fecha.getFecha2());
		return "\nHan transcurrido "+anio+" anios, "+mes+" meses y "+dia+" dias desde la fecha "+fecha1Formateada
		+" hasta la fecha "+fecha2Formateada+"\n";
	}
}
