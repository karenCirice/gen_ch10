package principal;

public class main_bucles {

	public static void main(String[] args) {
		int numero = 20;
		int factorial = 1;
		
		for (int i = 1; i <=numero; i++) {
			factorial *= i;
		System.out.println("El factorial de "+ i +" es: "+ factorial);
		}
		
	}
}
