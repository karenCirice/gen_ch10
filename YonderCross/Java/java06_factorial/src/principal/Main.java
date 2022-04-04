package principal;

public class Main {

	public static void main(String[] args) {
		// Calculamos el factorial de un numero x
		
	/*	int x = 5;
		int f = 1;
		for (int i=1; i<=x; i++) {
			f= f*i;
		}
		System.out.println("El factorial es: " + f);
	}*/
	
	
	//factorial del 1 al 10
	int f = 1;
	for (int i=1; i<=10; i++) {
		f*= i;
		System.out.println("El factorial de " + i + " es igual a " + f);
		}
	}

}
