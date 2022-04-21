package ar.edu.unju.fi.practico2n4;

import ar.edu.unju.fi.pratico2n2.bisiesto;

public class principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		bisiesto carga = new bisiesto();
		mes mes2 = new mes();
		boolean aux1;
do {
	int aux= carga.cargar(0);
	
	aux1 = mes2.comparacion(aux);
		
}
while (aux1 == true) ;
	}

}
