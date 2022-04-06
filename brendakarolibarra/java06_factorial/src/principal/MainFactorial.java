package principal;

public class MainFactorial {


public static void main(String[] args) {
	
	//Factorial con un for 
	/*int ni = 4;
	int nf = 1;
	for(int x=1;x<=ni;x++) {
		nf*=x;
	}
	System.out.println("El factorial de "+ni+" es: "+ nf);
} */

/*int num = 4, factorial=1, contador = 0;

// Factorial con el ciclo for
//for (int i = 0; i < num; i++) {
//	factorial*= i+1;
//}

// Factorial con ciclo while
while(contador < num) {
	factorial*= contador+1;
	contador++;
}

System.out.println("El factorial de " + num + " es: " + factorial);*/
	
	//Factoriales del 1 a al 10 imprimir
	/*int num=10;
	int fac=1;
	for (int i=1; i<= num; i++) {
		fac=fac*i;
		System.out.println("El factorial de "+i+" es:" + fac);
	}*/
	
	
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
