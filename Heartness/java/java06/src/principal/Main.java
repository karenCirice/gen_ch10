package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		
		//uso del ciclo while
		while(contador <= 10) {
			System.out.println("Valor del contador while: " + contador);
			contador++;
		}
		System.out.println(" \n \n");
		//reinicio mi variable
		contador = 0;
		
		//uso del ciclo do-while
		do {
			System.out.println("Valor del contador del Do wwhile: " + contador);
			contador++;
		}while (contador <=5);
		
		System.out.println(" \n \n");
		//reinicio mi variavle
		for(int i = 0; i <= 5; i++) {
			System.out.println("Valor de i en ciclo for: " + i);
		}
		
		System.out.println(" \n \n");
		//reinicio mi variable
		contador = 1;
		//uso del ciclo for con variable predeclarada
		for( ;contador<=5; contador++) {
			System.out.println("Valor de contador en for: " + contador);
		}

		System.out.println(" \n \n");
		
		//uso de la palabra reservada break
		for (int gera = 1; gera <= 5; gera++) {
			System.out.println("Gera numero: " + gera);
			if(gera > 1) {
				System.out.println("Gera clonado");
				break;
			}
		}
		
		System.out.println(" \n \n");
		
		for(int gera = 1; gera <= 5; gera++) {
			if(gera != 3) {
				System.out.println("El gera " + gera + " es pirata");
				continue;
			}
			System.out.println("El gera original es el " + gera);
		}
	}

}
