package principal;

public class Main {
	
	public static void main(String[] args) {
		//Scanner reader = new Scanner(System.in);
		//Prograama para conseguir el facctorial de un número.
		int factorial = 10, sum=1;
		//factorial = reader.nextInt();
		for (int i = 1; i <= factorial; i++) {
			sum = sum*i;
			System.out.println("El factorial de n"+i+" es : "+sum);
		}
		System.out.println("El valor total es: "+sum);

	}

}
