package ar.edu.unju.fi.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Persona {
	private String Nombre;
	private LocalDate FechadeNacimiento;
	public Persona(String nombre, LocalDate fechadeNacimiento) {
		super();
		Nombre = nombre;
		FechadeNacimiento = fechadeNacimiento;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public LocalDate getFechadeNacimiento() {
		return FechadeNacimiento;
	}
	public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
		FechadeNacimiento = fechadeNacimiento;
	}
	
	public int contarAños() {
		Calendar cal = Calendar.getInstance();
		int años = ( cal.get(Calendar.YEAR)-FechadeNacimiento.getYear());
		return años;}
	
	public String calcularSignoZodiacal() {
		String signo=null;
	    switch (FechadeNacimiento.getDayOfMonth()) {
		
	    case 1:
			if (FechadeNacimiento.getDayOfMonth() > 21) {
				signo = "ACUARIO";
			} else {
				signo = "CAPRICORNIO";
			}
			break;
		case 2:
			if (FechadeNacimiento.getDayOfMonth() > 19) {
				signo = "PISCIS";
			} else {
				signo = "ACUARIO";
			}
			break;
		case 3:
			if (FechadeNacimiento.getDayOfMonth() > 20) {
				signo = "ARIES";
			} else {
				signo = "PISCIS";
			}
			break;
		case 4:
			if (FechadeNacimiento.getDayOfMonth() > 20) {
				signo = "TAURO";
			} else {
				signo = "ARIES";
			}
			break;
		case 5:
			if (FechadeNacimiento.getDayOfMonth() > 21) {
				signo = "GEMINIS";
			} else {
				signo = "TAURO";
			}
			break;
		case 6:
			if (FechadeNacimiento.getDayOfMonth() > 20) {
				signo = "CANCER";
			} else {
				signo = "GEMINIS";
			}
			break;
		case 7:
			if (FechadeNacimiento.getDayOfMonth() > 22) {
				signo = "LEO";
			} else {
				signo = "CANCER";
			}
			break;
		case 8:
			if (FechadeNacimiento.getDayOfMonth() > 21) {
				signo = "VIRGO";
			} else {
				signo = "LEO";
			}
			break;
		case 9:
			if (FechadeNacimiento.getDayOfMonth() > 22) {
				signo = "LIBRA";
			} else {
				signo = "VIRGO";
			}
			break;
		case 10:
			if (FechadeNacimiento.getDayOfMonth() > 22) {
				signo = "ESCORPION";
			} else {
				signo = "LIBRA";
			}
			break;
		case 11:
			if (FechadeNacimiento.getDayOfMonth() > 21) {
				signo = "SAGITARIO";
			} else {
				signo = "ESCORPION";
			}
			break;
		case 12:
			if (FechadeNacimiento.getDayOfMonth() > 21) {
				signo = "CAPRICORNIO";
			} else {
				signo = "SAGITARIO";
			}
			break;
	    }
	
	return signo;
}
	
		public String calcularEstacion() {
			String estacion =null; ;
        switch(FechadeNacimiento.getMonthValue()){
        case 1: case 2:
            estacion = "Invierno";
            break;
        case 3:
            estacion = (FechadeNacimiento.getDayOfMonth() <20)?"Invierno":"Primavera";
            break;
        case 4: case 5:
            estacion = "Primavera";
            break;
        case 6:
            estacion = (FechadeNacimiento.getDayOfMonth()<20)?"Primavera":"Verano";
            break;
        case 7: case 8:
            estacion = "Verano";
            break;
        case 9:
            estacion = (FechadeNacimiento.getDayOfMonth() <20)?"Verano":"Otonio";
            break;
        case 10: case 11:
            estacion = "Otonio";
            break;
        case 12:
            estacion = (FechadeNacimiento.getDayOfMonth() <20)?"Otonio":"Invierno";
            break;
        default:
            estacion = "Estacion desconocida";
    }
    return estacion;
			
		}
	

}

