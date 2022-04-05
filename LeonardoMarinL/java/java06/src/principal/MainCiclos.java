package principal;

public class MainCiclos {

	public static void main(String[] args) {
		
		int contador = 10;
		
		//uso del ciclo while
//		while (contador <10) {
//			System.out.println("Valor de contador en while: "+contador);
//			contador++; //se necesita poner el incremento para que no se cree un bucle infinito
//		}
		
		//reinicio mi variable
//		contador = 0;
//		//uso del ciclo do-while
//		do {
//			System.out.println("Valor de contador en do: "+contador);
//			contador++;
//		}while(contador<=5);
		
		//reinicio mi variable
//		for (int i=0; i<=5; i++) {
//			System.out.println("valor de i en for: "+i);
//		}
		
		//uso del ciclo for con variable predeclarada
		contador=15;
//		for ( ; contador<=5; contador++) {
//			System.out.println("Valor de contador en for: "+contador);
//		}
		
		//uso de la palabra reservada break
//		for (int gera=1; gera<=5; gera++) {
//			System.out.println("Gera n.: "+gera);
//			if (gera>1) { //cuando gera=2 aún lo imprime y luego pasa a la siguiente línea, y se rompe el ciclo con el break
//				System.out.println("Gera clonado");
//				break;
//			}
//		}
		
		//uso de la palabra reservada continue
//		for (int gera=1; gera<=5; gera++) {
//			if(gera!=3) {
//				System.out.println("Gera pirata: "+gera);
//				continue;
//			}
//			System.out.println("El gera original es n.: "+gera);
//		}
		
		for (int gera=1; gera<=5; gera++) {
			if (gera==3) {
				System.out.println("el Gera original es n.: "+gera);
				break;
			}
			System.out.println("Gera pirata: "+gera);
		}

	}

}
