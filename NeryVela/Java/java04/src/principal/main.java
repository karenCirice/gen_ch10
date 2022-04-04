package principal;

public class main {
	public static void main(String[] args) {
	 int emoFeliz = 5;
		
	 System.out.println(emoFeliz++); //5 primero se lee y luego se incrementa
	 System.out.println(emoFeliz); //6 acá, se lee el valor actual
	 
	 System.out.println(emoFeliz--); //sigue siendo 6, primero se lee, luego se decrementa
	 System.out.println(emoFeliz); //se lee 5, valor actual
	 
	 int nivelCorte =1;
	 nivelCorte = emoFeliz++;
	 System.out.println("nivel Corte" + nivelCorte);
	 System.out.println("emoFeliz " + emoFeliz);
	 
	 int clanEmo= emoFeliz * 5;
	 System.out.println("clan emo" + clanEmo);
	 System.out.println("Divido el clan " + clanEmo/2);
	 
	 System.out.println("Modulo2" + (clanEmo%2));
	 
	 System.out.println("es mayor" + (clanEmo > 20));
	 System.out.println("es mayor" + (clanEmo <= 30));
	 System.out.println("Operador and " + (7 & 3));
	 System.out.println("Operador and" + (7 | 3));
}
	 }


