package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		
		// devuelve 5, primero se lee la variable y luego se incrementa
		//System.out.println(emoFeliz++);
		// devuelve 6, se lee el valor actual después de hacer el incremnto
		//System.out.println(emoFeliz);
		
		// imprime 6, primero lee la variable y luego decrementa
		//System.out.println(emoFeliz--);
		// impre 5 después de haber hecho el decremento
		//System.out.println(emoFeliz); 
		
		
		int nivelCorte = 1;
		emoFeliz = 5;
		
		// primero se hace la asignación y luego se incrementa
		nivelCorte = emoFeliz++;
		System.out.println("Nivel de Corte: " + nivelCorte); // 5
		System.out.println("Emo feliz: " + emoFeliz); // 6
		
		int clanEmo = emoFeliz * 5; //30
		//System.out.println("Clan Emo: " + clanEmo);// 30
		//System.out.println("Dividido el clan " + (clanEmo/2)); //15
		//System.out.println("Módulo2 " + (clanEmo%2)); // 0 porque clanEmo sigue siendo 30
		
		System.out.println("Es mayor " + (clanEmo > 20)); //true
		System.out.println("Es igual " + (clanEmo <= 20)); //true
		System.out.println("Operador and " + (7 & 3)); //3, operación and a nivel de bits
		System.out.println("Operador or " + (7 | 3)); //7
		
		System.out.println("Operador and lógico " + (7>3 && 3<5)); //true
	}

}
