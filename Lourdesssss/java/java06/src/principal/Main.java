package principal;

public class Main {

	public static void main(String[] args) {
		
		for (int gera =1;gera<=5;gera++) {
			if (gera ==3) {
			System.out.println("El Gera pirata es: " + gera);
		}
			System.out.println("El Gera original es: "+ gera);
	}

}
}


//

////uso del cilco while:
//while (contador<=5) {
//	//System.out.println("valor de contador en while: " + contador);
//	contador++; 
//}
////Reinicio mi variable
////contador = 0;
////Uso del ciclo do-while
/*
 * do { 
 * 		System.out.println("valor de contador en do: " + contador); 
 * 		contador ++;
 * }while(contador <=3);
 */

////uso del ciclo for:
//for (int i = 0; i<=5; i++) {
//	//System.out.println("Valor de mi variabe i en for: " + i);
//}
//int contador = 1;
////uso del ciclo for con variable pre-declarada:
//for (;contador <=5;contador++) 
////aquí no es necesario declarar la variable porque ya está declarada antes 
//{
//	System.out.println("Valor de contador en for: " + contador);
//}

////uso de la palabra reservada break
//for (int gera = 1;gera <=5; gera++) {
//	System.out.println("Gera n. : " + gera);
//	if (gera >1) {
//		System.out.println("Gera clonado");
//		break;
//	}
//}
////uso de la palabra reservada continue:
//for (int gera = 1;gera <=5; gera++) {
//	//para mover una línea de código: shift+flechasarriba o abajo
//	if (gera!=3) {
//		System.out.println("Gera pirata: " + gera);
//		continue;
//	}
//	System.out.println("El Gera original es el: " + gera);
//
//}
