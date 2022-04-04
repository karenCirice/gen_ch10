package principal;

public class Main {

	public static void main(String[] args) {
		int emoFeliz = 5;
		
		System.out.println(emoFeliz++); //primero se lee y luego se incrementa
		System.out.println(emoFeliz); //6 acá, se lee el valor actual
		
		System.out.println(emoFeliz--); //sigue siendo 6 porque primero se lee y luego decrementa
		System.out.println(emoFeliz); //5 acá, porque es el valor actual
		
		int nivelCorte = 1;
		
		nivelCorte = emoFeliz++;
		System.out.println("nivel Corte "+nivelCorte); // acá es 5 porque nivelCorte toma el último valor de emoFeliz, que fue 5
		System.out.println("emo Feliz "+emoFeliz); //acá es 6 porque por la instrucción anterior, emoFeliz incrementa en 1
		
		int clanEmo = emoFeliz * 5;
		System.out.println("clan Emo "+ clanEmo); //30 porque sí se ejecuta la multiplicación de emoFeliz*5 y se asigna a clanEmo
		System.out.println("Dividido el clan "+ (clanEmo/2)); //15 porque se ejecuta la división y liego se imprime
		System.out.println("Módulo2 "+ (clanEmo%2)); // 0 porque no hay residuo al dividir 30 entre 2
		
		System.out.println("Es mayor "+ (clanEmo>20)); // true porque clan emo vale 30
		System.out.println("Es igual "+(clanEmo<=30)); //true porque es igual a 30
		System.out.println("Operador and "+(7 & 3)); //Se pasa a binario y se compara bit por bit 1-1 es 1, 1-0 es 0 y 0-0 es 0
													 // 3 -> 0b0011
													 // 7 -> 0b0111
													 //		 1b0011 -> 3, por lo tanto el resultado es 3 decimal
		
		System.out.println("Operador or "+(7 | 3)); //Se pasa a binario y se compara bit por bit, si cualquier posición tiene 1, sigue valiendo 1
		 											 // 3 -> 0b0011
		 											 // 7 -> 0b0111
		 											 //		 1b0111 -> 7, por lo tanto el resultado es 7 decimal
		
		System.out.println("Operador and lógico "+(7>3 && 3>5)); //este operador evalúa condiciones, no numéricos, por eso se deben tener valores booleanos
		
		
		
	}

}
