package principal;

/**
 * Factorial de un número con ciclos
 * @author Beth
 * 4 abr. 2022
 */

public class MainFactorial {

	public static void main(String[] args) {
		/*
		 * int num = 4, factorial=1, contador = 0;
		 * 
		 * // Factorial con el ciclo for // for (int i = 0; i < num; i++) { //
		 * factorial*= i+1; // }
		 * 
		 * // Factorial con ciclo while while(contador < num) { factorial*= contador+1;
		 * contador++; }
		 * 
		 * System.out.println("El factorial de " + num + " es: " + factorial);
		 */
		
		
		
		int num = 5, factorial=1, contador = 0;
		
		while(contador < num) { 
			contador++; 
			factorial*= contador;
			System.out.println("El factorial de " + contador + " es: " + factorial);
		}
		
		
	}

}
