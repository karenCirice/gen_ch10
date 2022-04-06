package java04;

public class java04 {

}

	public static void main(String[] args) {
		int emoFeliz = 5;
		System.out.println(emoFeliz++);  // este resultado da 5 porque primero se le  llama y luego se incrementa
		System.out.println(emoFeliz);     // 6 porque lee el valor actual y ya lo incrementó
		
		/*System.out.println(emoFeliz--); // sigue siendo 6, primero lo lee y luego lo incrementa
		System.out.println(emoFeliz);    // se lee 5, valor actual
		
		int nivelCorte = 1;
		
		
		nivelCorte = emoFeliz++;  //5
		System.out.println("nivel Corte "  +  nivelCorte); //5
		System.out.println("emoFeliz "  +  emoFeliz);  //6
		
		int clanEmo = emoFeliz *5;
		System.out.println("clan emo"+ clanEmo); //30 último valor de la variable 
		System.out.println("clan emo"+ clanEmo);
		
		System.out.println("Es mayor" + (clanEmo > 20)); //true
		System.out.println("Es mayor" + (clanEmo <= 30)); //true
		System.out.println("Operador and"  + (7 & 3));   //  3 -> 0b0010
		                                                 //  7 -> 0b0111
		                                                 //     & 0b0011  ->3
		
		System.out.println("Operador or " + (7| 3));     //   3->  0b0011
		                                                 //   7 -> 0b0111
                                                         //   | -> 0b0011  ->7
		//System.out.println("Operador and lógico " + ( 7>3  &&  3<5) );  //   (true && true)  -> true */
		System.out.println("Operador and lógico " + ( false  ||  true) ); 
		
		System.out.println("modulo" + (17%5));
	
		
		
		
	}

}