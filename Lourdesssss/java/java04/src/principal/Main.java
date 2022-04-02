package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		/*
		System.out.println(emoFeliz++);//primero se lee y luego se incrementa
		System.out.println(emoFeliz);//6 aquí se lee el valor total
		
		System.out.println(emoFeliz--);//sigue siendo 6, luego se decrementa
		System.out.println(emoFeliz);//se lee 5, el valor actual
		*/
		int nivelCorte = 1;
		emoFeliz = 5; 
		nivelCorte = emoFeliz++;
		
		//System.out.println("nivel Corte " + nivelCorte);//aquí se imprime la sentencia anterior pero hasta emoFeliz por eso sale 5
		//System.out.println("emoFeliz " + emoFeliz);//aquí se imprime la sentencia despues del emoFeliz, por eso sale 6
		
		int clanEmo = emoFeliz * 5;
		/*
		System.out.println("clan Emo " + clanEmo);
		System.out.println("Dividido el clan " + (clanEmo/2));
		System.out.println("Módulo 2 " + (clanEmo % 2));
		*/
		
		System.out.println("Es mayor " + (clanEmo > 20));
		System.out.println("Es igual " + (clanEmo <= 30));
		System.out.println("operador and " + (7 & 3));//esto es por un tema binario
		
		System.out.println("operador or " + (7 | 3));
		
		System.out.println("operador and lógico " + (7>3 && 3>5));
		
	}

}










