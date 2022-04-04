package principal;

public class Main {
	public static void main(String[] args) {
		int emoFeliz= 5;
		System.out.println(emoFeliz ++); //5 porque primero se lee y luego se incrementa
		System.out.println(emoFeliz); //6 acá porque se lee el valor actual
		
		System.out.println(emoFeliz --);//sigue siendo 6 porque primero se lee y luego se decrementa
		System.out.println(emoFeliz); //se lee 5, valor actual.
		
		int nivelCorte = 1;
		
		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte " + nivelCorte); // 5
		System.out.println("emoFeliz " + emoFeliz);// 6
		
		int clanEmo = emoFeliz * 5;
		//System.out.println("clan emo " + clanEmo); //30
		//System.out.println("Dividido el clan " + (clanEmo/2)); // 15
		//System.out.println("Módulo2 " + (clanEmo%2)); //0
		
		System.out.println("Es mayor " + (clanEmo));
		
		System.out.println("Es mayor " + (clanEmo > 20));
		System.out.println("Es igual " + (clanEmo <= 30));
		System.out.println("Operador and " + (7 & 3));
		
		System.out.println("Operador and " + (7 | 3));
		
		System.out.println("Operador and lógico " + ( 7>3 && 3<5)); // true
		
	}

}
