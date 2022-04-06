package principal;

public class MainCiclos {

	public static void main(String[] args) {
		int contador = 0;
		
		//uso ciclo while
//		while(contador<10) {
//			System.out.println("Valor de contador: "+ contador);
//		contador++;
//		}
		//reinicio mi variable
		
		//uso del ciclo do-while
//		do {
//			System.out.println("Valor de contador en do while: "+ contador);
//			contador++;
//		}while(contador <=5);
		
		//reinicio mi variable
		contador = 0;
//		for(int i=0; i<=5; i++) {
//			System.out.println("Valor de i en for: "+ i);
//		}
//		contador = 1;
//		//uso del ciclo for con varibale declarada
//		for(;contador <=5; contador++) {
//			System.out.println("Valor de contador en for: "+ contador);
			
		//uso de la palabra break;
//		for (int gera = 1; gera <= 5; gera++) {
//			System.out.println("Gera n. : " + gera);
//			if (gera > 1) {
//				System.out.println("Gera Clonado");
//				break;
//			}
//	}
		//uso de la palabra reservada continue
		for(int gera = 1;gera<=5;gera++) {
			if(gera!=3) {
				System.out.println("Gera pirata: " +gera);
				continue;
			}
			System.out.println("El gera original es el n."+gera);
		}
	}

}
