package principal;

public class MainCiclos {

	public static void main(String[] args) {

		int contador = 10;
/*		
		//uso del ciclo while
		while (contador <=5) {
				
			System.out.println("Valor del contador: " + contador);
			contador++;
		}*/
//		
//		//reinicio mi variable
//		contador = 0;
//		//uso del ciclo do while
//		do {
//			System.out.println("Valor de contador en do: " + contador);
//			contador++;
//		} while (contador <=5);
		
/*
 * //uso del ciclo for for (int i=0; i<=5; i++ ) {
 * System.out.println("Valor de i en for: " + i); }
 */
		
		/*
		 * //reinicio mi variable contador contador = 1; //uso del ciclo for con
		 * variable predeclarada for (; contador<=5; contador++) {
		 * System.out.println("Valor de la variable cotador en for: " + contador); }
		 */
		
/*		//uso de la palabra reservada break
		for (int i = 1; i<=5; i++) {
			System.out.println("i numero " + i);
			if (i>1) {
				System.out.println("i clonada");
				break;
			}
			
		}
		*/
		
		//uso de la palabra reservada continue
		for (int i = 1; i<=5; i++) {
			if (i!=3) {
				System.out.println(i + " es i pirata");
				continue;
			}
		System.out.println("La i original es la numero: " + i);
		}
		
	}

}
