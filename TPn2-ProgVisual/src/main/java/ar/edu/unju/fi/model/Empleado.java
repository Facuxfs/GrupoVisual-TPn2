package ar.edu.unju.fi.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Empleado {
	private String Nombre;
	private LocalDate FechaIngreso;
	private Double Legajo;
	private String Email;
	private Double Sueldo;
	private Integer HorasTrabajadas;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public LocalDate getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public Double getLegajo() {
		return Legajo;
	}
	public void setLegajo(Double legajo) {
		Legajo = legajo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Double getSueldo() {
		return Sueldo;
	}
	public void setSueldo(Double sueldo) {
		Sueldo = sueldo;
	}
	public Integer getHorasTrabajadas() {
		return HorasTrabajadas;
	}
	public void setHorasTrabajadas(Integer horasTrabajadas) {
		HorasTrabajadas = horasTrabajadas;
	}
	public Empleado(String nombre, LocalDate fechaIngreso, Double legajo, String email, Double sueldo,
			Integer horasTrabajadas) {
		super();
		Nombre = nombre;
		FechaIngreso = fechaIngreso;
		Legajo = legajo;
		Email = email;
		Sueldo = sueldo;
		HorasTrabajadas = horasTrabajadas;
	}
	
	public Empleado(String nombre, Integer horasTrabajadas) {
		super();
		Nombre = nombre;
		HorasTrabajadas = horasTrabajadas;
	}
	public Empleado(String nombre, LocalDate fechaIngreso, Integer horasTrabajadas) {
		super();
		Nombre = nombre;
		FechaIngreso = fechaIngreso;
		HorasTrabajadas = horasTrabajadas;
	}
	public Empleado(String nombre, Double legajo, Integer horasTrabajadas) {
		super();
		Nombre = nombre;
		Legajo = legajo;
		HorasTrabajadas = horasTrabajadas;
	}
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Double mostrarSueldo () {
		Double sueldo=(double) 0;
		if (HorasTrabajadas<=160) {
			Sueldo = (double) (HorasTrabajadas*600);
		}else {
			Sueldo=  (double) ((HorasTrabajadas*600)+ ((HorasTrabajadas-160)*650)); 
		}
		return  sueldo;
	}
}
