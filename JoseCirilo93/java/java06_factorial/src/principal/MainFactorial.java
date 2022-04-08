package principal;

public class MainFactorial {

	public static void main(String[] args) {
		
		/*
		// Numero del que queremos calcular el factorial
		int Num = 5;

		// Variable con el valor del factorial
		int nFactorial = 1;

		for (int x=1;x<=Num;x++) {
		  nFactorial = nFactorial * x;
		}

		System.out.println("El factorial de " + Num + " es: " + nFactorial);

		*/
		
		// Numero del que queremos calcular el factorial
		int num = 10;
		// Variable con el valor del factorial
		long numFactorial = 1;
		
		for (int i = 1; i <=num; i++) {
			numFactorial *=i;
			System.out.println("El factorial de " + i + " es: " + numFactorial);			
		}		
		
	}

}
