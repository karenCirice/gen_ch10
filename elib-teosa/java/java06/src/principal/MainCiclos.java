package principal;

import java.util.Iterator;

public class MainCiclos {

	public static void main(String[] args) {
		int contador = 10;
		
		// uso del ciclo while
		/*
		 * while(contador <= 5) { System.out.println("Valor de contador en while " +
		 * contador); contador++; }
		 */
		
		// reinicio mi variable
		contador = 0;
		// Uso del ciclo do-while
		/*
		 * do { System.out.println("Valor del contador en do-while " + contador);
		 * contador++; } while(contador <= 5);
		 */
		
		/*
		 * for(int i = 0; i<=5; i++){ System.out.println("Valor de i en for " + i); }
		 * 
		 * // uso de for con variable predeclarada contador =1; for(; contador <= 5;
		 * contador++) { System.out.println("Valor de contador en for " + contador); }
		 */
		
		// Uso de la palabra reservada break
		/*
		 * for (int gera = 1; gera <= 5; gera++) { System.out.println("Gera no.: " +
		 * gera); if (gera > 1) { System.out.println("Gera clonado"); break; }
		 * System.out.println("Muchas instrucciones más"); }
		 */
		
		// uso de la palabra reservada continue
		for (int gera = 1; gera <= 5; gera++) {
			
			if (gera != 3) {
				System.out.println("Gera pirata: " + gera);
				continue;
			}
			
			System.out.println("El Gera original es no.: " + gera);
		}

	}

}
