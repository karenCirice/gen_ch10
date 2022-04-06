package principal;

public class MainCiclos {

	public static void main(String[] args) {
		
		int contador = 0;
		
		//uso del ciclo while
		/*while (contador <=5) {
			System.out.println("Valor de contador es while; " + contador);
			contador++;
		}
		*/

		//reinicio mi variable
//		contador = 0;
//		// Uso del ciclo do-While
//		do {
//			System.out.println("Valor de contador en do while: " + contador);
//			contador++;
//		} while (contador <= 5);		
//		
		//reinicio mi variable
//		for (int i=0; i<=5; i++ ) {
//			System.out.println("Valor de i en for : " + i);
//		}
//		//reinicio mi variable contador con for
		contador = 15;
//		//Uso del ciclo gor con variable predeclarada
//		for ( ; contador<=5;contador++) {
//			System.out.println("Valor de contador en for :" + contador);
//		}	
	
		//Uso de la palabra reservada break
//		for (int gera = 1; gera <=5; gera ++) {
//			System.out.println("Gera n. :" +gera);
//			if (gera >1) {
//				System.out.println("Gera clonado");
//				break;
//			}
//		}
		
		//Uso de la palabra continue
		for (int gera =1; gera <5; gera++) {
			if (gera !=3) {
				System.out.println("El gera es n. :" +gera);
				continue;
			}
			System.out.println("El gera origina es n. :" +gera);
		}
	}

}
