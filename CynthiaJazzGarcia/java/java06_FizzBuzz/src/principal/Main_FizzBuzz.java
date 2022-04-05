package principal;

public class Main_FizzBuzz {

	public static void main(String[] args) {
		int numeroInicial = 1;
		int numeroFinal = 20;
		
		for(int i = numeroInicial; i <= numeroFinal; i++) {
			if((i%3 == 0) && (i%5 == 0)) {
				System.out.println("FizzBuzz");
			}else if (i%3 == 0) {
				System.out.println("Fizz");
			}else if (i%5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
