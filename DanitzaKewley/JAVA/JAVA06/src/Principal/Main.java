package Principal;

public class Main {

	public static void main(String[] args) {
		
		int contador = 0;
		
		/*//uso del ciclo while
		while (contador <= 5) {
			System.out.println("valor de conttador en while: " + contador);
			contador++;
		}*/
		
		//reinicio mi variable
		contador = 10;
		//uso del ciclo do-while
//		do {
//			System.out.println("Valor de contador en do while:" + contador);
//			contador++;
//		}while (contador <=5);
		
		//Uso del ciclo for
		//reinicio mi variable
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("Valor de i en for: " + i);
//		}
//		//reinicio mi variable contador
//		contador = 15;
//		//uso del ciclo for con varibale predeclarada
//		for( ;contador <=5;contador++) {
//			System.out.println("Valor de contador en for: " + contador);
//		}
		
//		//us de la palabra reservada break
//		for (int gera = 1; gera <= 5; gera++) {
//			System.out.println("Gera n. : " + gera);			
//			if (gera > 1) {
//				System.out.println("Gera clonado");
//				break;
//			}
//		}
//		//Uso de la palabra reservada continue
//		for (int gera = 1; gera <=5; gera++) {
//			if (gera != 3) {
//				System.out.println("Gera pirata :" + gera);
//				continue;
//			}
//			System.out.println("El gera original es n. : " + gera);
//		}
		
		for (int gera = 1; gera <=5; gera++) {
			if (gera == 3) {
				System.out.println("El gera original es n. : " + gera);
				break;
			}
			System.out.println("Gera pirata : " + gera);
		}
	}

}
