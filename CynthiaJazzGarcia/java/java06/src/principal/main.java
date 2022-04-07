package principal;

public class main {

	public static void main(String[] args) {
		
		int x = 12; //esta es la variable donde empieza a contar
		
		//uso de while
		while (x > 10) {
			System.out.println("Valor de contador en while " +x);
			x++; //necesario para que no se haga un ciclo infinito
		}
		
		
		//reinicio mi variable
		
		//contador= 10;
		//Uso del ciclo do-while
		/*do {
		System.out.println("Valor de cotador en do while :" +contador);	
		contador ++;
		}while (contador <=5);*/
		
		
		
		//Uso del ciclo for
		/*for (int i=0; i<=5; i++) {
			System.out.println("Valor de i en for " + i);
		}
		//reinicio mi variable contador
		contador = 1;
		//Uso del ciclo for con variable predeclarada
		for (; contador<=5; contador++) {
			System.out.println("Valor de contador en for " + contador);
		}*/
		
		
		//Uso de la palabra reservada Break
		/*for (int gera= 1; gera <=5; gera++) {
			if (gera != 3) {
			System.out.println("Gera pirata :" +gera);
			continue; //la palabra reservada continue va a regresar hasta el inicio del for
			}
				System.out.println("El gera original es n. :" +gera);
			}*/
		
		
		
		/*for (int gera= 1; gera <=5; gera++) {
			if (gera == 3) {
			System.out.println("El Gera original es n. :" +gera);
			break; //la palabra reservada continue va a regresar hasta el inicio del for
			}
				System.out.println("Gera pirata. :" +gera);
			}	*/
	}
	}


