package principal;

public class MainFizzBuzz {

	public static void main(String[] args) {
	
	int numFinal = 20;
		for (int i = 1; i <= numFinal; i++) 
		{
		  if (((i % 3) == 0) && ((i % 5) == 0)) // Para números divisibles por 3 y 5
		    System.out.println("FizzBuzz"); 
		  else if ((i % 3) == 0) // Para números divisibles por 3
		    System.out.println("Fizz");
		  else if ((i % 5) == 0) //Para números divisibles por 5
		    System.out.println("Buzz");
		  else
		    System.out.println(i); // En cualquier otro caso, imprimir el número
		}

	}

}
