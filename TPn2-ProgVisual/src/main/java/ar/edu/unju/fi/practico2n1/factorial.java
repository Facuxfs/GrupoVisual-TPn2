package ar.edu.unju.fi.practico2n1;

public class factorial {
	
	public long fac(long numero)	{
	// El número elegido para el factorial es el 30
	long fact=1;
	//numero=30;
	
	while ( numero!=0) {
		 fact=fact*numero; numero--;
		}
	//System.out.println(fact);
		return fact;
	}
}
