package principal;

public class Main {

	public static void main(String[] args) {

//		int numero = 5, factorial = 1, contador = 0;
//		
//		while (contador < numero) {
//			factorial*= contador+1;
//			contador++;
//		}
//		System.out.println("Factorial: " +numero + " es " + factorial);
//	}

		int numero = 10, factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
			System.out.println("Factorial: " + i + " es " + factorial);
		}
	}
}
