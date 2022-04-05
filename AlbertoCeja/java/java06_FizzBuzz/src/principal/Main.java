package principal;

public class Main {

	public static void main(String[] args) {
		//programa FizzBuzz
		int valor_tope = 20;
		int i = 1;
		while(i <= valor_tope) {
			if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
			i++;
		}
		

	}

}
