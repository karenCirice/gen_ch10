package java04;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		//System.out.println(emoFeliz++); //salio 5 porque primero se le el dato y luego se incrementa
		//System.out.println(emoFeliz); //Se le el valor actual
		
		//System.out.println(emoFeliz--); //salio 5 porque primero se lee el dato y luego se incrementa
		//System.out.println(emoFeliz); //Se lee el valor actual
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		
		System.out.println("nivel Corte" + nivelCorte); //5
		System.out.println("Emo feliz" + emoFeliz); //6
		
		int clanEmo = emoFeliz *5;
		//System.out.println("clan emo" + clanEmo); //30 es el ultimo valor emo
		//System.out.println("Devidio el clan" + (clanEmo/2));
		//System.out.println("Modulo2 " + (clanEmo%2));
		
		System.out.println("Es mayor" + (clanEmo > 20));//true
		System.out.println("Es igual " + (clanEmo <= 30));//true
		System.out.println("Operador and " + (7 & 3)); //se hace a operador binario , 3 en octadeci -> 0b0011
																	//	         -> 0b0111
																	//            -> 0b0011 =3
		
		System.out.println("Operador or " + (7 | 3)); //se hace , 3 en octadeci -> 0b0011
		//	                                                                    -> 0b0111
		//                                                                      -> 0b0011 =3
		
		//System.out.println("Operador and logico " + (7 && 3)); // NO SE PUEDE PORQUE NO SON BOOLEANOS
		
		System.out.println("Operador and logico " + (7>3 && 3<5)); // (True & True) = True
		
		
	}

}
