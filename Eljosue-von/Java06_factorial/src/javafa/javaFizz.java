package javafa;
import java.util.stream.IntStream;
public class javaFizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IntStream.rangeClosed(1, 100)
//		  .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
//		  .forEach(System.out::println);
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
