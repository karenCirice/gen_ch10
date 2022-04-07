/**
 * 
 */
package principal;

/**
 * @author Yoscelín RS
 *4 abr. 2022
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	//	int contador = 0;
		
		//uso del ciclo while
//		while (contador<10) {
//			System.out.println(  " Valor de contador en while " + contador);
//			contador++;
	//	}

		//reinicio mi variable
	/*	contador = 10;
		//Uso del ciclo do-While
		do {
			System.out.println(" Valor de contador en do while : " + contador );
			contador++;
		}while (contador <= 5); */
		
		//reinicio mi variable
	/*	for (int i=0; i<=5;i++) {
			System.out.println(" Valor de ciclo for : " + i);
		}
		
		//reinicio mi variable contador
		contador=15;
		//Uso del ciclo for con variable declarada
		for ( ; contador<=5;contador++) {
			System.out.println("Valor de contador en for : " + contador );
		}*/
		
		//Uso de la palabra break
		
		/*for (int gera=1; gera <=5 ; gera++) {
			System.out.println("Gera n. :" + gera);
			if(gera >1) {
				System.out.println("Gera clonado");
				break;
			}
		} */
		
		// uso de la prueba reservada continue
		for (int gera =1; gera<=5; gera++) {
			if( gera != 3) {
			System.out.println("Gera pirata :" + gera);
			continue;
			
		}
			System.out.println("El gera original es n. :" + gera);
	}

		
		// Otrouso de brak//
		
		for (int gera =1; gera<=5; gera++) {
			if( gera == 3) {
			System.out.println("El gera original es n. :" + gera);
			break;
			
		}
			System.out.println("Gera pirata :" + gera);
	}
}
}