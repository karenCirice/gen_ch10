package principal;

public class Main {
	public static void main(String[] args) {
		//calcular el fizz buzz game:
        for (int numbers = 1; numbers <= 30; numbers++) {
            if (numbers % 3 == 0 && numbers % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (numbers % 3 == 0) {
                System.out.println("Fizz");
            } else if (numbers % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numbers);
            }
        }
    }
}

//public static void main(String[] args) {

//Calcular el valor factorial:

//int numero = 5;
//long factorial = 1;
//
//for (int i = 1; i <= numero; i++) {
//	factorial *= i;
//}
//System.out.println("El factorial de " + numero +" es: " + factorial);
//}
//
//}

//Calcular el factorial anidado:
//public static void main(String[] args) {
//	int numero = 5;
//	for (int i = 0; i < numero; i++) {
//	    for (int j = 5; j > i; j--) {
//	       System.out.print(numero);
//	  }
//	   System.out.println("");
//	}
//}
//}