package principal;

public class Main {

	public static void main(String[] args) {
		
		int contador = 10;
		//uso del ciclo while
//		while (contador <=5) {
//			System.out.println("Valor de contador while: " +contador);
//			contador++;
//		}
		
		//reinicio mi variable
		contador = 10;
		//uso del ciclo do while
//		do {
//			System.out.println("Valor de contador en do while: " +contador);
//			contador++;
//		} while (contador <=5);
		
		//uso del ciclo for
//		for (int i=0; i<=5; i++) {
//			System.out.println("Valor de i en for: " +i);
//		}
		//reinicio mi variable contador 
		contador = 1;
		//uso de ciclo for con variable declarada
//		for ( ;contador<=5;contador++) {
//			System.out.println("Valor de contador en for: " +contador);
//		}
		
		//uso de la palabra reservada break
//		for (int gera = 1; gera <=5 ; gera++) {
//			System.out.println("Gera n. : " +gera);
//			if (gera >1) {
//				System.out.println("Gera clonado");
//				break;
//			}
//		}
		
		//uso de la palabra resrvada continue
//		for (int gera =1; gera <=5; gera++) {
//			if (gera != 3) {
//				System.out.println("Gera pirata : " +gera);
//				continue;
//			}
//			System.out.println("El gera original es n. : " +gera);
//		}
		
		for (int gera =1; gera <=5; gera++) {
			if (gera == 3) {
				System.out.println("Gera pirata : " +gera);
				break;
			}
			System.out.println("El gera original es n. : " +gera);
		}
	}

}
