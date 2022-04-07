package java06_factorial;

public class Factorial {
	
	// Numero del que queremos calcular el factorial
	int iNumero = 5;

	// Variable con el valor del factorial
	int iFactorial = 1;

	// Cadena con la salida
	String sCadena = Integer.toString(iNumero) + "! = 1";

	for (int x=2;x<=iNumero;x++) {
	  iFactorial = iFactorial * x;
	  sCadena = sCadena + " x " + Integer.toString(x);
	}

	System.out.println(sCadena + " = " + Integer.toString(iFactorial));


}
