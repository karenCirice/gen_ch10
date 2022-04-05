package principal;

public class MainFactorial {

	public static void main(String[] args) {

		
		
			//---------Ejercicio 1: For para hacer factorial----------
			int numero = 5, factorial = 1;
			for(int i = 1; i <= numero ; i ++) {
				factorial *= i;
			}
			System.out.println("Factorial es: " + factorial);
			System.out.println("\n");
			
			//---------Ejercicio 2: Factorial de los números del 1 al 10--------
		
			int contador = 1, otroFactorial = 1;
			while(contador <= 10) {					
				otroFactorial *= contador;			
				System.out.println("Factorial de " + contador +  " es: " + otroFactorial);
				contador++;
			}
			System.out.println("\n");
			
			//---------Ejercicio 3: FizzBuzz Game, números de 1 al 20--------
			/**
			 * 1- Numeros divisibles entre 3 y 5, imprime "FizzBuzz"
			 * 2- Numeros divisibles entre 3, imprime "Fizz"
			 * 3- Numeros divisibles entre 5, imprime "Buzz"
			 * 4- Otro caso, imprime, imprime el número
			 */
			int contador2 = 1;
			while(contador2 <= 20) {
				if (contador2%3 == 0 && contador2%5 ==0) {// Punto 1
					System.out.println(/*"Numero: "+ contador2+*/" FizzBuzz");
				}else if(contador2%3 == 0 && contador2%5 !=0) {// Punto 2
					System.out.println(/*"Numero: "+ contador2+*/" Fizz");
				}else if(contador2%3 != 0 && contador2%5 ==0) {// Punto 3
					System.out.println(/*"Numero: "+ contador2+*/" Buzz");
				}else {// Punto 4
					System.out.println(/*"Numero: "+*/" "+ contador2);
				}
						
				
				contador2++;
			}
			
			
		}
}
