package principal;

public class Main {
	
public static void main(String[] args) {
	int numero = 5;
	long factorial = 1;

	for (int i = 1; i <= numero; i++) {
		factorial *= i;
	}
	System.out.println("El factorial de " + numero +" es: " + factorial);
}

}
	/*Calcular el factorial de los valores númericos enteros del 1 al 10
	int numero = 10;
	long factorial = 1;

	for (int i = 1; i <= numero; i++) {
		factorial *= i;
	System.out.println("El factorial de " + i +" es: " + factorial);
   }
  } 
}
*/


