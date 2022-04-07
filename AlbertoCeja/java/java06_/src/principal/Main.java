package principal;

public class Main {

	public static void main(String[] args) {
		
		int contador = 0;
		/*
		//Uso sentencia While
		while(contador <= 5 ) {
			System.out.println("Valor de contador en while");
		}
		*/
		
		//Uso Do-While
//		contador = 1;
//		do {
//		System.out.println("Valor de contador en do: "+contador);
//			contador++;
//		}while(contador <= 5);
		
//		contador=1;
//		for( ; contador <=5; contador++) {
//			System.out.println("Valor de contador en do: "+contador);
//		}

		//Uso de continue 
		for(int gera = 1; gera <=5; gera++) {
			if(gera != 3) {
				System.out.println("Gera Fake es n : "+gera);
				continue;
			}
			System.out.println("El Gera original es n : "+gera);
		}
	}

}
