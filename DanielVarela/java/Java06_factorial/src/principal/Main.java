package principal;

public class Main {

	public static void main(String[] args) {
		int numero = 10;
		long factorial = 1;

		for (int i = 1; i <= numero; i++) {
			factorial *= i;
			System.out.println("El factorial de " + i +" es: " + factorial);
		}
		
	}

}
