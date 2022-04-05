package principal;

public class MainCiclos {

	public static void main(String[] args) {
		int contador = 0;

		// Uso del ciclo while
//		while (contador <=5) {
//			System.out.println("valor de contador en while: " + contador);
//			contador++;
//		}

		// reinicio mi variable
		contador = 0;
		// uso del ciclo do-while
//		do {
//		
//			System.out.println("Valor de contador en do-while: "+ contador);
//			contador ++;
//		} while (contador <= 5);

		// reinico mi variable
//		for (int i = 0; i <=5; i++ ) {
//			System.out.println("Valor de i en for: "+ i);
//		
//		}
		// reinicio mi variable
		contador = 1;

		// uso del ciclo for con variable predeterminada
//		for ( ;contador<=5; contador++) {
//			System.out.println("Valor de contador en for: " +contador);
//		}
//		
		// uso de la palabra reserva break
//		for (int gera = 1; gera <= 5; gera++) {
//			System.out.println("gera original: " +gera);
//			if (gera > 1 ) {
//				System.out.println("Gera clonado");
//				break; // rompe el ciclo
//			}
//		
//		}

		//uso de la paralba continue
		for (int gera = 1; gera <= 5; gera++) {
			//no se cumples la condicion
			if (gera != 3) {
				System.out.println("Gera pirata: " + gera);
				continue; //continua con la siguiente instrucion 
			}
			System.out.println("Gera original es no.: "+ gera);

		}
	}

}
