package principal;

public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int emoFeliz = 5;
		// System.out.println(emoFeliz++); //Primero se lee y luego se incrementa da 5
		// System.out.println(emoFeliz);// Ya se leyó el 5 ahora es 6

		// System.out.println(emoFeliz--); //se lee solo 6 por el valor anterior
		// System.out.println(emoFeliz);//Ahora si es 5 ya se leyó ahora se resta

		int nivelCorte = 1;

		nivelCorte = emoFeliz++;
		// System.out.println("Nivel corte vale: " + nivelCorte);//vale 5
		// System.out.println("Emo feliz vale: " + emoFeliz);//vale 6

		int clanEmo = emoFeliz * 5;// resultado 30
		/*
		 * System.out.println("Clan emo es igual a: "+ clanEmo );/// vale 30
		 * System.out.println("Dividio el clan: "+ (clanEmo/2));//vale 15
		 * System.out.println("Módulo2 " + (clanEmo%2));//vale 0
		 */

		System.out.println("Es mayor " + (clanEmo > 20));// true toma el ultimo varo de 30
		System.out.println("Es igual " + (clanEmo <= 30));// True sigue siendo mayor a 30
		System.out.println("Operador and " + (7 & 3));// porque 7 es igual a 0b0111, el 3 a 0b0011 y el resultado lo
														// haces en bit por bit y te da 0b0011 osea 3
		System.out.println("Operador and " + (7 | 3));// es 7
		System.out.println("Operador y logico " + (7 > 3 && 3 < 5));

	}

}
