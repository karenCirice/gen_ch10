package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emoFeliz = 5;
		
		/*
		System.out.println(emoFeliz++);
		System.out.println(emoFeliz);
		
		System.out.println(emoFeliz--);
		System.out.println(emoFeliz);
		*/
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		System.out.println("Nivel corte "+ nivelCorte);
		System.out.println("Emo Feliz "+emoFeliz);
		
		int clanEmo = emoFeliz * 5;
		/*
		System.out.println("Clan emo "+clanEmo);
		System.out.println("Divido el clan "+ (clanEmo/2));
		System.out.println("Modulo "+ (clanEmo%2));
		*/
		
		//Operadores Relacioanales
		/*
		System.out.println("Es mayor "+ (clanEmo > 20));
		System.out.println("Es mayor "+ (clanEmo <= 30));
		System.out.println("Operador and " + (7&3));
		System.out.println("Operador and " + (7|3));
		
		
		System.out.println("Operador and logico "+ (7>3 && 3<5));
		*/
		
		int a=8, b=3, c=-5;
		System.out.println(a-b-c*2);

	}

}
