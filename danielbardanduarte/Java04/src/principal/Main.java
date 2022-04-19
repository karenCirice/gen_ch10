package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		
		System.out.println(emoFeliz++); //5 primero se lle y luego incrementa
		System.out.println(emoFeliz); //6 acá, se lleeel valor actual
		
		System.out.println(emoFeliz--); //sigue siendo 6, primero se lee y luego se decrementa
		System.out.println(emoFeliz); //se lee 5, valor actual
		
		int nivelCorte = 1;
		
		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte " + nivelCorte); // 5
		System.out.println("emoFeliz " + emoFeliz); // 6

		int clanEmo = emoFeliz * 5;
		System.out.println("clan emo " + clanEmo); // 30 ultimo valor de la variable
		System.out.println("Dividido el clan " + (clanEmo/2)); //15
		System.out.println("Modulo2 " + (clanEmo%2)); // 0
	}

}
