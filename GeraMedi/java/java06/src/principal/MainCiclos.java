package principal;

public class MainCiclos {

	public static void main(String[] args) {
		
		int contador = 10;
		
		//USO CICLO WHILE
	//	while (contador <= 5) {
	//	System.out.println("Valor de contador: " +contador);
	//	contador++;
		//Se agrega el ++ para que al volver a while a analizar la condición
		//aumente y no sea infinito.
//	}
		
//		//reinicio mi variable
		
//		contador = 10; //contador ya está declarado, solo se le cambia el valor
//		do {
//			System.out.println("Valor de contador en do while : " +contador);
//			contador++;
//		}while (contador <=5);
//		//Aquí imprime un valor independientemente si cumple o no, la segunda vez
//		//si no cumple ahora ya no lo pasa.
		
//		//reinicio mi variable
//		for (int i=0; i<=5; i++) {
//			System.out.println("Valor de i en for: " +i);
//		}
		
//		//Uso de variable con variable predeclarada
//		contador = 1;
//		for (;contador <=5; contador++) {
//			System.out.println("Valor de contador en for es :" +contador);
//		}
		
//		//Uso de la palabra reservada Break
//		for (int gera=1; gera<=5; gera++) {
//			System.out.println("Gera no: " +gera);
//			if (gera>1) {
//				System.out.println("Gera clonado");
//				break;
//			}
//		}
		
		//Uso de la palabra reservada continue
		for (int gera=1; gera<=5; gera++) {
			if (gera != 3) {
				System.out.println("Gera pirata: "+gera);
				continue;
			}
			System.out.println("El gera original es no: " +gera);
		}
}
}
