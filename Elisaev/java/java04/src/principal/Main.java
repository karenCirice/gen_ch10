package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		System.out.println(emoFeliz++); // 5 primero se lee la varieble, luego se incrementa.
		System.out.println(emoFeliz); // 6
		System.out.println(emoFeliz--); // se le 6
		System.out.println(emoFeliz); // 5: Se decrementa la instruccion anterior

		int nivelCorte = 1;

		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte " + nivelCorte);// 5
		System.out.println("emoFeliz " + emoFeliz);// 6

		int clanEmo = 30;
		System.out.println("Es mayor " + (clanEmo > 20)); // true;
		System.out.println("Es igual " + (clanEmo <= 30)); // true;
		System.out.println("Operador and " + (7 & 3)); // 3 -> 0b0001
														// 7 -> 0b0111
														// & 0b0011 -> 3
	}

}
