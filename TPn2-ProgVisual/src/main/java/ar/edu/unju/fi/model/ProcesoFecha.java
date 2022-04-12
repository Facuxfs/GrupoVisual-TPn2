package ar.edu.unju.fi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ProcesoFecha {
	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime dataTime1;
	private LocalDateTime dataTime2;
	
	public LocalDate getFecha1() {
		return fecha1;
	}
	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}
	public LocalDate getFecha2() {
		return fecha2;
	}
	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}
	public LocalTime getTime1() {
		return time1;
	}
	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}
	public LocalTime getTime2() {
		return time2;
	}
	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}
	public LocalDateTime getDataTime1() {
		return dataTime1;
	}
	public void setDataTime1(LocalDateTime dataTime1) {
		this.dataTime1 = dataTime1;
	}
	public LocalDateTime getDataTime2() {
		return dataTime2;
	}
	public void setDataTime2(LocalDateTime dataTime2) {
		this.dataTime2 = dataTime2;
	}
	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}
	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	}
	public ProcesoFecha(LocalDateTime dataTime1, LocalDateTime dataTime2) {
		super();
		this.dataTime1 = dataTime1;
		this.dataTime2 = dataTime2;
	}
	public ProcesoFecha() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Period contarTiempoTranscurrido() {
		Period period = Period.between(fecha1, fecha2);
		return period;
	}
	
	public String formatearFecha (LocalDate fecha) {
		String cadena = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(fecha);
		return cadena;
	}
	
	public String compararFechas() {
		String resultado = null;
		if (fecha1.compareTo(fecha2) > 0) {
			resultado = "La fecha 1 es posterior a la fecha 2";
		} else if (fecha1.compareTo(fecha2) < 0) {
			resultado = "La fecha 1 es anterior a la fecha 2";
		} else if (fecha1.compareTo(fecha2) == 0) {
			resultado = "Las fechas son iguales";
		}
		return resultado;
	}
	
	
}
