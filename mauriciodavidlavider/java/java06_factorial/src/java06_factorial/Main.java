package java06_factorial;

public class Main {

	public static void main(String[] args) {
		
		//Rescursividad en un número
		int numero = 5, resultado = 1; //Iniciamos el numero en 1 
		for (int i=1; i<=numero; i++) {
			resultado *= i; 
		}
		System.out.println("El factorial del numero " + numero + " es: " + resultado);
		
		//Recursividad del 1 al 10
		for (int j=1; j<=10; j++) {
			int res = 1;
			for (int i=1; i<=j; i++) {
				res *= i; 
			}
			System.out.println("El factorial del numero " + j + " es: " + res);
		}
		
	}

}
