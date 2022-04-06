package principal;

public class MainCiclos {

	public static void main(String[] args) {
		
		int contador = 0;
		
		//Uso del ciclo while
//		while (contador <= 5) {
//			System.out.println("Valor de contador en while: "+contador);
//			contador++;
//		}
		
		//reinicio mi variable
		contador = 0;
		//uso del ciclo do-while
//		do {
//			System.out.println("Valor de contador en do-while: "+contador);
//			contador++;
//		} while(contador <= 5);
		
//		//Uso del ciclo for
//		for (int i=0; i <= 5; i++) {
//			System.out.println("Valor de i en for: "+i);
//		}
		
//		//Uso de la palabra reservada break
//		for (int gera = 1; gera <= 5; gera++) {
//			System.out.println("Gera n. : "+gera);
//			if (gera > 1) {
//				System.out.println("Gera clonado");
//				break;
//			}
//		}
		
//		//Uso de la palabra reservada continue
//		for (int gera = 0; gera <= 5; gera++) {
//			if (gera != 3) {
//				System.out.println("Gera pirata: "+gera);
//				continue;
//			}
//			System.out.println("El gera original es n. : "+gera);
//		}
		
		for (int i = 1; i <= 20; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i%5 == 0) {
				System.out.println("Buzz");
			} else if (i%3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}

	}

}
