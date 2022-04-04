package principal;

public class MainCiclos {

	public static void main(String[] args) {

		int contador = 0;
		/*
		//uso del ciclo while
		while(contador <= 10) {
			System.out.println("Valor de contador en while: "+ contador);
			contador++;
		}
		//Reinicio del contador
		contador = 0;
		//Uso del ciclo do-while
		do {
			System.out.println("Valor decontador en do while" + contador);
			contador++;	
		}while (contador <= 5);
		
		//Uso del ciclo for 
		for(int i=0; i<=5; i++) {
			System.out.println("Valor de i en for: " + i);
		}
		//Uso del ciclo for con variable pre-declarada
		for(;contador<=5; contador++) {
			System.out.println("Valor de i en for: " + contador);
		}
		
		//Uso de la palabra reservada break
		for (int i=0; i<=5; i++) {
			System.out.println("Gera n. " + i);
			if(i>1) {
				System.out.println("Gera clonado");
				break;
			}
		}*/
		
		//Uso de la palabra reservada continue
		for (int gera = 1; gera <=5; gera++) {
			if(gera != 3) {
			System.out.println("Gera pirata: " + gera);
			continue;
			}
		System.out.println("El gera original es n." + gera);
		}
	}

}
