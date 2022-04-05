package principal;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int emoFeliz = 5;
		System.out.println(emoFeliz++); // 5 primero se lee y luego se incrementa
		System.out.println(emoFeliz); // 6 acá, se lee el valor actual
		
		System.out.println(emoFeliz--); // sigue siendo 6 , primero se lee, luego se decrementa.
		System.out.println(emoFeliz); // se lee 5, valor actual
		
		
		int nivelCorte = 1;
		
		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte" + nivelCorte); //5
		System.out.println("emoFeliz" + emoFeliz); // 6
		
		int clanEmo = emoFeliz * 5;
		System.out.println("clan emo" + clanEmo); //30 ultimo valor de la variable 
		System.out.println("Dividido el clan" + (clanEmo/2)); //15
		System.out.println ("Modulo2" + (clanEmo%2)); //0
		
		System.out.println ("Es mayor" + (clanEmo> 20)); //TRUE
		System.out.println("Es igual" + (clanEmo <= 30)); //true
		System.out.println("Operador and" + (8&4)); // false 
		System.out.println("Operador and" + (7&3)); //3            3 -> 0b0011
		                                                         //7->  0b0111
		                                                          //   & 0b0011 -> 3
		System.out.println("Operador and" + (7|3));               // 3-> 0b0011
		                                                          // 7 -> 0b0111
		                                                          // -> 0b0111 -> 7
		System.out.println("Operador and lógico" + (7>3 && 3<5)); // (true && true) -> true 
						
				
				
		
		
		
	}

}
