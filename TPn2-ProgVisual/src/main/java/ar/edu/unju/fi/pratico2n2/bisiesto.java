package ar.edu.unju.fi.pratico2n2;
import java.util.Scanner;

public class bisiesto {
	
	public int cargar(int numero) {
		  Scanner aux = new Scanner(System.in);
		  int nume;
	  nume = aux.nextInt();
	  System.out.print("el numero es:" + nume);
	  return nume;
	}	
	public void bisi(int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
		
	}
	
}
