package java04;

public class Main {
	
	public static void main(String[] args){
		
		int emoFeliz =5;
		System.out.println(emoFeliz++); //dará 5, primero se lee y luego se incrementa
		System.out.println(emoFeliz); //dará, 6 primero se incrementa y luego se lee
		
		System.out.println(emoFeliz--); // sigue siendo 6, primer se lee y luego se incrementa
		System.out.println(emoFeliz); // se lee 5, valor actual
		
		int nivelCorte = 1;
		
		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte " + nivelCorte); // 5
		System.out.println("emoFeliz  " + emoFeliz); // 6
		
		int clanEmo = emoFeliz * 5;
		System.out.println("clan emo " + clanEmo);
		System.out.println("Divido el clan " + (clanEmo / 2));
		System.out.println("Módulo2 " + (clanEmo%2));
		
		System.out.println("Es mayor " + (clanEmo > 20));
		System.out.println("Es igual " + (clanEmo <= 30));
		System.out.println("Es menor y igual " + (clanEmo < 30 && clanEmo == 30));
	}
}
