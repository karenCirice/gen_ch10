package principal;

public class MainFizzBuzz {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			
			if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
				System.out.println("No. "+ (i+1) +": FizzBuzz");
			} else if ((i + 1) % 3 == 0) {
				System.out.println("No. "+ (i+1) +": Fizz");
			} else if ((i + 1) % 5 == 0) {
				System.out.println("No. "+ (i+1) +": Buzz");
			}else {
				System.out.println(i+1);
			}
		}
	}

}
