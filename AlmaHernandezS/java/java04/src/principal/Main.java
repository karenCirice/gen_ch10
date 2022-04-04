package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		
		System.out.println(emoFeliz++); //5 primero se lee y luego incrementa
		System.out.println(emoFeliz); // 6 aca, se lee el valor actual
		System.out.println(emoFeliz--); //sigue siendo 6, primero se lee y luego decrementa
		System.out.println(emoFeliz); //se lee 5, valor actual
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		
		System.out.println("nivel Corte " + nivelCorte);
		System.out.println("emo Feliz " + emoFeliz);
		
		int clanEmo = emoFeliz * 5;
		//System.out.println("clan Emo " + clanEmo);
		//System.out.println("Divide el clan " + (clanEmo/2) );
		//System.out.println("Modulo2 " + (clanEmo%2) );
		
		System.out.println("Es mayor " + (clanEmo > 20) );
		System.out.println("Es igual " + (clanEmo <= 30) );
		System.out.println("Operador and " + (7 & 3) ); // 3-> 0b0011  7->0b0111  & 0b0011->3
		System.out.println("Operador and " + (7 | 3 )); // | 0b0111->7
		System.out.println("Operador and logico " + (7>3 && 3<5) ); //(true && true) -> true
	}

}
