package principal;

public class MainCiclos {

	public static void main(String[] args) {
		int contador = 0;
		
		//uso del ciclo while
		while (contador <= 5) {
			System.out.println("Valor ed contador en while: " + contador);
			contador++;
		}
		
		//reinicio mi variable
		contador = 0;
		//Uso del ciclo do-shile
		do {
			System.out.println("Valor de contador en do-while: " + contador);
			contador++;
		} while (contador <= 5);
		
		//Uso de ciclo for
		for (int i=0; i<=5; i++) {
			System.out.println("Valor de iterador en for: " + i);
		}
		
		//reiniciando variable contador
		contador = 0;
		for (;contador <= 5; contador++) {
			System.out.println("Valor de contador en for: " + contador);
		}
		
		for (int gera = 1; gera <= 5; gera++) {
			System.out.println("Gera n. : " + gera);
			if (gera > 1) {
				System.out.println("Gera clonado");
				break;
			}
		}
		
		//Uso de la palabra reservada continue
		for (int gera=1; gera <= 5; gera++) {
			if (gera != 3) {
				System.out.println("El piarata : " + gera);
				continue;   //Se regresa al inicio del for y sigue la iteración
			}
			System.out.println("El gera original es n. : " + gera);
		}

	}

}
