package principal;

public class Main {

	public static void main(String[] args) {

		int primerNumero = 1;
		int ultimoNumero = 20;
		
		for (int i = primerNumero; i <= ultimoNumero; i++) {
		if ((i%3 == 0) && (i%5 == 0)) {
			System.out.println("FizzBuzz");
		}
		else if (i%3 == 0) {
			System.out.println("Fizz");
		}
		else if (i%5 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(i);
		}

		}
		
	}

}
