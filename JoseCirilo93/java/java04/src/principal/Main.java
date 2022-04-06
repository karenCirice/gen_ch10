package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		
		//System.out.println(emoFeliz++);//5 primero se lee y luego se incrementa
		//System.out.println(emoFeliz);//6 acá, se leé el valor actual
		
		//System.out.println(emoFeliz--);// sigue sinedo 6, primero se lee y luego se decrementa
		//System.out.println(emoFeliz); // se lee 5, valor actual
		
		int nivelCorte =1;
		
		nivelCorte = emoFeliz++;
		//System.out.println("nivel corte " + nivelCorte); //5
		//System.out.println("emofeliz " + emoFeliz);// 6
		
		int clanEmo = emoFeliz * 5; // salida =30
		//System.out.println("clan emo "+ clanEmo);//30
		//System.out.println("Devidiendo el clan "+ (clanEmo/2));//15
		//System.out.println("Módulo2 " + (clanEmo%2) );//0
		
		System.out.println( "Es mayor "+ (clanEmo > 20));//true
		System.out.println("Es igual " + (clanEmo <= 30));// true
		System.out.println("Operador and " + (7 & 3));//   3 -> 0b0011
													  //   7 -> 0b0111
													  //	  & 0b0011 ->3
		
		System.out.println("Operador or " + (7 | 3)); //   3 -> 0b0011
													   //   7 -> 0b0111
													   //   | -> 0b0111 ->7
										
		System.out.println("Operador and logico " + (7 > 3 && 3<5));//   ( true && true )-> true										
	
	}

}
