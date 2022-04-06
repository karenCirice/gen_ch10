package principal;

public class Main {

	public static void main(String[] args) {
		int valor = 20;
		
		for (int i = 1; i <= valor; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			}else if (i%5 == 0) {
				System.out.println("Buzz");
			}else if (i%3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}

			}
		
	}

}