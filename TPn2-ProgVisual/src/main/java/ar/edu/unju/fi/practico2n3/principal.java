package ar.edu.unju.fi.practico2n3;

import ar.edu.unju.fi.pratico2n2.bisiesto;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bisiesto dato = new bisiesto();
		paridad pOi = new paridad();
		for (int i=0; i<5; i++)
		{
			int aux = dato.cargar(i);
			pOi.esPar(aux);
			
			
		}
	}

}
