package java04;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		System.out.println(emoFeliz++);
		System.out.println(emoFeliz);
		
		System.out.println(emoFeliz--);
		System.out.println(emoFeliz);
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		System.out.println("nivel de corte: "+ nivelCorte);
		System.out.println("emoFeliz: "+ emoFeliz);
		
		int clanEmo = emoFeliz * 5;
		/*
		System.out.println("clan emo: "+clanEmo);
		System.out.println("Divido el clan: " + (clanEmo/2));
		System.out.println(clanEmo);
		System.out.println("M�dulo : " + (clanEmo%2));
		*/
		System.out.println(clanEmo);
		System.out.println("Es mayor "+ (clanEmo > 20));
		System.out.println("&: 7&3 " +(7&3));//& l�gico con susu binarios
		System.out.println("|: 7|8 " +(7|3));//| l�gico con sus binarios
		
		
	}

}
