package principal;

public class MainCiclos {

	public static void main(String[] args) {
		int contador = 0;
	/*	while(contador <= 10) {
			System.out.println("Valor de contador en while:  " + contador);
		contador++;
		} */
		

		
		/*do {
			System.out.println("Valor de contador en do  " + contador );
			contador++;
		} while(contador <= 5);*/
		
		//Uso de la palabra reservada break
		for(int gera =1; gera<=5; gera++) {
			System.out.println("Gera n. :" +gera);
			if(gera >1) {
			 System.out.println("Gera clonado");
			 break;
			}
		}
		
		//Uso de la palabra reservada continue
		for(int gera =1; gera<=5; gera++) {
			if(gera !=3) {
			 System.out.println("Gera pirata : " +gera);
			 continue;
			}
			System.out.println("El gera original es n. :" +gera);
		}
		
		
	}

}
