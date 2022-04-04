package Principal;

public class principal {

	public static void main(String[] args) {
		
		int emoFeliz = 5;
		
		int nivelCorte = 1;
		
		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte "+nivelCorte); //5 se le asigan el valor
		System.out.println("emoFeliz "+emoFeliz); //6 ahora si se le suma el valor
		
		int clanEmo = emoFeliz *5;
		//System.out.println("clan Emo "+clanEmo); //30, último valor de clanEmo
		//System.out.println("Dividido el clan "+(clanEmo/2)); //15
		//System.out.println("Módulo2 "+ (clanEmo%2)); //0, 30/2=15 con residuo de 0
		
		System.out.println("Es mayor "+(clanEmo > 20)); //true
		System.out.println("Es igual "+(clanEmo <= 30)); //true
		System.out.println("Operador and" + (8 & 4));	// 3 -> 0b0011
														// 7 -> 0b0111
														//   -> 0b0011  -> 3
		System.out.println("Operador or "+(7 | 3) );
		
		System.out.println("Operador and lógico "+ (7>3 && 3<5) );  //(true && true) -> true
	} 

}
