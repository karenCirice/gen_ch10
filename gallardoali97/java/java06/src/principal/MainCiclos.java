package principal;

import java.util.Iterator;

public class MainCiclos {

	public static void main(String[] args) {
      //	int contador=0;
//		
//		//uso del ciclo while
//		while (contador <=5) {
//			System.out.println("Valor de contador en while: "+contador);
//			contador++; 
//		}
//		//reinicio mi variable
//		contador = 0;
//		//uso del ciclo do-while
//		do {
//			System.out.println("Valor de contador en Do-While: "+contador);
//		    contador++;
//	  }while (contador <=5);
		
		//CICLO FOR
//		for (int i=0;i<=5;i++) {
//			System.out.println("Valor de i en For: "+i);
//		}
		//Uso de la palabra reservada Break
//		for (int ali=1; ali<=5;ali++) {
//			System.out.println("Ali n. : "+ali);
//			if (ali>1) {
//				System.out.println("Ali clonado");
//				break;
//			}
//		}
//		//Uso de la palabra reservada continue
		for (int ali=1; ali<=5;ali++) {
			
			if (ali!=3) {
				System.out.println("Ali n. : "+ali);
				continue;
			}
			System.out.println("Ali original: "+ali);
		}
	}
}
