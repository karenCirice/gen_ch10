package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		emoFeliz++;
		//System.out.println(emoFeliz++);// 5 primero se lee y luego se incrementa
		//System.out.println(emoFeliz++);//6 aca, se lee el valor actual
		
		//System.out.println(emoFeliz--);// sigue siendo 6, primero se lee, luego se decrementa
		//System.out.println(emoFeliz--);// se lee 5, valor actual
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		
		System.out.println("Nivel Corte "+nivelCorte);
		System.out.println("emoFeliz "+emoFeliz);
		
		int clanEmo = emoFeliz * 5;
		//System.out.println("Clan emo "+clanEmo); //30
		//System.out.println("Devidido el clan "+ (clanEmo/2)); //15
		//System.out.println("Modulo2 "+(clanEmo%23)); //0
		
		System.out.println("Es mayor "+ (clanEmo > 20));
		System.out.println("Es igual "+ (clanEmo <= 30));
		System.out.println("Operador and "+ (7 & 3));// 0b0011 -> 3
		
		System.out.println("Operador or "+ (7|3)); // 0b0111 -> 7

	}
}
