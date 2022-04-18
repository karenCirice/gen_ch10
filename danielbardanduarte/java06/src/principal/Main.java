package principal;

public class Main {

	public static void main(String[] args) {

		int contador = 0;
		
	/*	//uso ciclo while
		while (contador <5) {
			System.out.println("Valor de contador en while: " + contador);
			contador++;
		}
		*/

		//reinicio mi variable
		contador = 0;
		//uso ciclo do-while
		
		/* -------------- DO-WHILE ------------------
		do {
			System.out.println("valor de contador en do es: " + contador);
			contador++;
		}
		while (contador <=5);
		*/
		/*
		// -------------- FOR ----------------
		//reinicio mi variable
		for(int i=0; i<=5; i++) {
		System.out.println("Valor de i en for: " + i);
	}

		//Uso ciclo for con variable predeclaradaç
		contador = 1;
		for ( ;contador<=5;contador++){
			System.out.println("Valor de contador en for: " + contador);
	}
	*/
		//Uso de la palabra reservada break--------------
		for (int gera = 1; gera <= 5; gera++) {
			System.out.println("Gera n. : " + gera);
			if (gera>1) {
				System.out.println("Gera clonado");
				break;
			}
		}
		// Uso de la palabra reservada continue
		for (int gera=1; gera <=5; gera++){
			if (gera !=3) {
				System.out.println("Gera pirata: " + gera);
				continue;
			}
			System.out.println("El gera original es n. " + gera);
		}
}

}
