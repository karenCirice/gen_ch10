package java06_factorial;

public class java06_factorial {

	public static void main(String[] args) {
		int numero1 = 10;
		int resultado = 1;

		for (int i = 1; i <= numero1; i++) {
			resultado *= i;
			System.out.println("el factorial de " + i + " es: " + resultado);

		}
	}
}
