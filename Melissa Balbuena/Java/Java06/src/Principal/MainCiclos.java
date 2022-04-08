package Principal;

/*
 * 
 */
public class MainCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		 // Uso del ciclo while
		
			/*
			 * while (contador <=5) { System.out.println("Valor del contador en while " +
			 * contador); contador ++; }
			 */
		
		// Reinicio mi variable
		contador = 0;
		
		// Uso del ciclo do-while
		
		/*
		 * do { System.out.println("Valor en do-while " + contador); contador ++; }
		 * while (contador <= 5);
		 */
		
		// Reinicio mi variable
		
//		for (int i=0; i<=5; i++) { // Se puede poner i++ o ++i 
			// esta instruccion solo es valida dentro de las llaves, es decir no podre
			// usar el i en otro lado
			
//			System.out.println("Valor de i en for: " + i);
//		}
		
		// Reinicio mi variable
		contador = 15;
				
		// Uso del ciclo for con variable predeclarada
		
//		for (; contador <=5; contador ++) {
//			System.out.println("Valor de contador en for: " + contador);
//		}
		
		

		// Uso de la palabra reservada break
		for (int Meli = 1; Meli <=5; Meli ++) {
			/*System.out.println("Meli n. : " + Meli);
			if (Meli >1) {
				System.out.println("Meli Clonada");
				break;
			} */
			
			// Seleccionar Meli en el numero 3
			/*
			 * if (Meli == 3) { System.out.println("La Meli original es n. : " + Meli); }
			 */
			
			// Uso de la palabra reservada continue
			/*
			 * if (Meli != 3) { System.out.println("Meli pirata: " + Meli); continue; }
			 * System.out.println("La Meli original es n.: " + Meli);
			 */
			
				if (Meli == 3) {
					System.out.println("La Meli original es n. " + Meli);
					break;
				}
				System.out.println("Meli pirata: " + Meli);
			
		}
	}

}
