package Principal;

import java.util.Iterator;

public class MainCiclos {

	public static void main(String[] args) {
		
		int contador =10;
		
		//uso del ciclo/bucle while 
		/*while (contador <=5) {
			System.out.println("Valor de contador while:"+contador);
			contador++;
		}*/
		//reinicio mi variable
		contador = 1;
		
		//Uso del ciclo do-While
		/*do {
			System.out.println("Valor del contador en do-while es :" + contador);
			contador ++;
		} while (contador <= 5);
		*/
		//reinicio mi variable uso de cliclo for 
		/*for (int i=0; i<=5; i++) {
			System.out.println("Valor de i en ciclo for:" + i);
		}
		
		//Ciclo for con variable predeclarada 
		for (; contador<=5; contador++) {
			System.out.println("Valor de contador en for: "+contador);
		}*/
		
		//Uso de la palabra reservada break
		/*for (int gera = 1; gera <=5; gera++) {
			System.out.println("Gera n.: " +gera);
			if(gera >1) {
				System.out.println("Gera clonado");
				break;
			}	
		}
	*/
		//USO DE LA PLABARA RESERVADA CONTINUE
		/*for (int gera = 1; gera <=5; gera++) {
			
			if(gera!=3) {
			System.out.println("Gera pirata " +gera);
			continue;
			}
			System.out.println("El gera original es n.: " +gera);
		}
		*/
		for (int gera = 1; gera <=5; gera++) {
			
			if(gera == 3) {
			System.out.println("El gera original es n.: " +gera);
			break;
			}
			System.out.println("Gera pirata: " +gera);
	}
	
		
	

}}
