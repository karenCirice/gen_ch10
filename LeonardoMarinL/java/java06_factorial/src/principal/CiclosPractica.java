package principal;

public class CiclosPractica {

	public static void main(String[] args) {
		// Ejercicio 1: determinar el factorial de un número
		//int factorial = 1;
		// int numero = 5;
//		for (int x=1; x<=numero; x++) {
//			factorial = factorial*x; //el ciclo continúa guardando cada vez el nuevo valor de factorial hasta cumplir la condición x<=numero
//		}
//		System.out.println("El factorial del número "+numero+" es "+factorial);
//		
		//Ejercicio 2: el factorial de los número 1-10
		int numero = 10;
		long factorial = 1;
		
		for (int i=1; i<=numero; i++) {
			factorial = factorial*i;
			System.out.println("El factorial de "+i+" es "+factorial);
		}

	}

}
