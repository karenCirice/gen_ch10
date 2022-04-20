/**
 * 
 */
package principal;

/**
 * @author DELL
 *
 * 1 abr. 2022
 */
public class Main {
	public static void main(String[]args) {
		int emoFeliz = 5;
		System.out.println(emoFeliz++); //5 primero se lee y luego se incrementa
		System.out.println(emoFeliz); //6 acá, se lee el valor actual
		
		System.out.println(emoFeliz--); //sigue siendo 6 primero se lee luego se decrementa
		System.out.println(emoFeliz); //se lee 5, valor actual
		
		int nivelCorte = 1;
		nivelCorte = emoFeliz++;
		System.out.println ("nivel Corte " + nivelCorte); //5
		System.out.println("emoFeliz " + emoFeliz); //6
		
		int clanEmo = emoFeliz * 5;
		System.out.println ("clan emo " + clanEmo);
		System.out.println("Devidido el clan" + (clanEmo));
	}

}
