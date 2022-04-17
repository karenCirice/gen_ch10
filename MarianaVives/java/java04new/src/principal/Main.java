package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		//System.out.println(emoFeliz++); //5 se lee primero luego se incrementa
		//System.out.println(emoFeliz);// 6 aca, se lee el valor actual
		
		//System.out.println(emoFeliz--);//sigue siendo 6 primero se lee, luego se decrementa
		//System.out.println(emoFeliz);//se lee 5, valor actual
		
		int nivelCorte = 1;
		emoFeliz = 5;
		nivelCorte = emoFeliz++;
		System.out.println("Nivel de corte " + nivelCorte); // 5
		System.out.println("emo feliz " + emoFeliz); // 6
		
		int clanEmo = emoFeliz * 5;
		//System.out.println("clan emo "+ clanEmo); //30 ultimo valor de la variable
		//System.out.println("Dividiendo el clan "+ (clanEmo/2));
		//System.out.println("Modulo2 "+ (clanEmo%2));
		
		System.out.println("Es mayor "+ (clanEmo > 20));//true
		System.out.println("Es igual "+ (clanEmo <= 30));//true
		
		System.out.println("Operador AND "+ (7 & 3));
		System.out.println("Operador OR " + (7|3));
		
		System.out.println("Operador and logico " + (7>3 && 3>1)); //true
		
		
		
	}

}