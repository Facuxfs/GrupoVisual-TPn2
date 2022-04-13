package ar.edu.unju.fi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Punto B1
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.of(1996, 06, 04),LocalDate.of(2002, 10, 21));
		pf1.setFecha1(pf1.getFecha1());
		System.out.println(pf1.getFecha1());
		pf1.setFecha2(pf1.getFecha2());
		System.out.println(pf1.getFecha2());
		//Punto B2
		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(12, 30, 15),LocalTime.of(10, 22, 8));
		pf2.setTime1(pf2.getTime1().plusHours(5));
		System.out.println(pf2.getTime1());
		pf2.setTime2(pf2.getTime2().minusMinutes(20));
		System.out.println(pf2.getTime2());
		//Punto B3
		System.out.println(pf1.compararFechas());
		//Punto B4
		ProcesoFecha pf3 = new ProcesoFecha(LocalDateTime.of(1996, 04, 04, 10, 30),LocalDateTime.of(1998, 8, 22, 15, 30));
		pf3.setFecha1(pf1.getFecha1());
		pf3.setFecha2(pf1.getFecha2());
		pf3.setTime1(pf2.getTime1());
		pf3.setTime2(pf2.getTime2());
		System.out.println(pf3.getDataTime1()+"    "+pf3.getDataTime2()+"    "+pf3.getFecha1()+"    "+pf3.getFecha2());
		//Punto B5
		ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(1996, 06, 04),LocalDate.now());
		Period periodo = pf4.contarTiempoTranscurrido();
		System.out.println("Han transcurrido " + periodo.getYears() + " , "+ periodo.getMonths()+ " meses y "+periodo.getDays()+" dias desde la fecha :" + pf4.getFecha1()+" hasta la fecha :"+ pf4.getFecha2());
		//Punto B6
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese fecha en formato : dd/(MM/yyyy ");
		String fecha = sc.nextLine();
				
	}

}
