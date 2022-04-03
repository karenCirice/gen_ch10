package principal;

public class Main {
	
	public static void main(String[] args) {
		int emoFeliz = 5;
		
		//System.out.println(emoFeliz++); //5 primeo se lee y luego se incrementa
		//System.out.println(emoFeliz); //6, se lee el valor actual
		
		//System.out.println(emoFeliz--); //sigue siendo 6, primero se lee, luego se decrementa
		//System.out.println(emoFeliz); //se lee 5, valor actual
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		
		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte " + nivelCorte); //5
		System.out.println("emoFeliz " + emoFeliz); //6
		
		int clanEmo = emoFeliz * 5;
		//System.out.println("clan emo "+ clanEmo); //30 �ltimo valor de la variable 
		//System.out.println("Devidido el clan " + (clanEmo/2)); //15
		//System.out.println("M�dulo2 " + (clanEmo%2)); //0
		
		System.out.println("Es mayor "+ (clanEmo > 20)); //true
		System.out.println("Es igual "+ (clanEmo <= 20)); //true
		System.out.println("Oprando and "+ (7 & 3)); //3 -> 0b0011
		                                              // 7 -> 0b0111
		                                              // & -> 0b0011  ->3 representaci�n binaria y convertir en representaci�n decimal
		
		System.out.println("Oprando and "+ ( 7 | 3 )); //3 -> 0b0011
                                                       // 7 -> 0b0111
                                                       // & -> 0b0111  ->7
		
		System.out.println("Oprando and l�gico "+ ( 7>3 && 3<5 )); //true
	}

}
