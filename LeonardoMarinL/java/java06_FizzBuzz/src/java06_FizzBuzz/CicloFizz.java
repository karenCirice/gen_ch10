package java06_FizzBuzz;

public class CicloFizz {

	public static void main(String[] args) {
		int numI = 1;
		int numF = 20;
		for (int i=numI; i<=numF; i++) {
			if ((i%3==0)&&(i%5==0)) {
				System.out.println("FizzBuzz");
			}
			else if (i%5==0) {
				System.out.println("Buzz");
			}
			else if (i%3==0) {
				System.out.println("Fizz");
			}
			else System.out.println(i);
		}
		

	}

}
