package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		/*
		System.out.println(emoFeliz++);	//Primero se lee y luego se incrementa
		System.out.println(emoFeliz++);//aqui sale el valor actual
		
		System.out.println(emoFeliz--); //primero se lee y luego se decrementa
		System.out.println(emoFeliz);
		*/
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz;
		
		System.out.println("Nivel corte " + nivelCorte);
		System.out.println("emoFeliz " + emoFeliz);
		
		int clanEmo = emoFeliz * 5;
		/*
		System.out.println("clan emo " + clanEmo);
		System.out.println("Divido el clan " + (clanEmo/2));
		System.out.println("Modulo2 " + (clanEmo%2));
		*/
		/*
		System.out.println("Es mayor " + (clanEmo > 20));
		System.out.println("Es igual " + (clanEmo <= 30));
		System.out.println("Operador and " + (8 & 4));
		
		System.out.println("Operador or " + (7 | 3));
		System.out.println("Operdor and logico " + (7>3 && 3<5));
		*/
		
		
		System.out.println("Respuesta " + (8-3-(-5)*2));
	
		
	}

}
