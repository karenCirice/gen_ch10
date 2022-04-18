package principal;

public class Main {

	public static void main(String[] args) {
int emoFeliz = 5;
		
		//System.out.println(emoFeliz++); //5 primero se lee y luego se incrementa
		//System.out.println(emoFeliz); //6 acá, se lee el valor actual
		
		//System.out.println(emoFeliz--); // sigue siendo 6, primero se lee, luego se decrementa.
		//System.out.println(emoFeliz); //se lee 5, valor actual
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		
		System.out.println("nivel Corte " + nivelCorte);  // 5
		System.out.println("emoFeliz " + emoFeliz);  // 6
		
		int clanEmo = emoFeliz * 5; //salida =30
		//System.out.println("clan emo "+ clanEmo);//30 último valor de la variable
		//System.out.println("Devidido el clan " + (clanEmo/2) ); // 15		
		//System.out.println("Módulo2 " + (clanEmo%2) ); //0
		
		System.out.println( "Es mayor " + (clanEmo > 20) ); // true
		System.out.println("Es igual " + (clanEmo <= 30) ); // true
		System.out.println("Oprandor and " + ( 7 & 3) );    
		
		System.out.println("Operador or " + ( 7 | 3) );    
		
		System.out.println("Oprandor and lógico " + ( 7>3 && 3<5) );  //   ( true && true  ) -> true
		
	}

}
