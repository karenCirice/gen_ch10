package principal;

public class CiclosTest {

	public static void main(String[] args) {
		// ========Pregunta 01========

		int a;
		int b;

		for (a = 0, b = 0; b > a; a++, b++) {
			System.out.println(a + " " + b);
		}
		System.out.println(a + " " + b);

		// ===========================
		// ========Pregunta 02========

		// Variables previamente declaradas
		a = 1;
		b = 10;

		do {
			if (a++ > --b) continue;
		} while (a < 5);
		System.out.println(a + " " + b);

		// ===========================
		// ========Pregunta 03========
		
		int x = 12;
		
		while (x > 10) {
			x--;
		}
		System.out.println(x);
		
		// ===========================
		// ========Pregunta 04========
		
		// Variable previamente declarada
		x = 12;
		
		while (x < 10) {
			x--;
		}
		System.out.println(x);
		
		// ===========================		
		// ========Pregunta 05========
	
		for (int i = 0; i >= 10; i++) {
			if (i > 6) break;
		}
//		System.out.println(i);		
// Si se quita el comentario el error es:
// i cannot be resolved to a variable			
		// ===========================
		// ========Pregunta 06========
		
		Integer y = new Integer(1) + new Integer(2);
		switch (y) {
			case 3: System.out.println("three"); break;
			default: System.out.println("other"); break;
		}
		
		// ===========================
		// ========Pregunta 07========
		// Quitar comentario de línea System.out.println(z)
		
		byte z = 10;
		do {
			z--;
			//System.out.println(z);
		} while (z < 10);
		
		// ===========================
		// ========Pregunta 08========
		//Descomentar las líneas del if
		
//		int initial = 11;
//		int r = 1;
//		r += x;
//		if ( (x>4) && (x > 10)) {
//			r += 2 * x;
//		} else ( x <= 4 ){
//			r += 3 * x;
//		} else {
//			r += 4 * x;
//		}
//		r += 5 * x;
//		System.out.println(x);
		
		// ===========================
		// ========Pregunta 09========
		
		// Variable previamente declarada
		x = 0;		
		/*Nueva línea de código*/             int w=11;                                                  
		do {} while (x++ < w);
		System.out.println(x);
		
		// ===========================
		// ========Pregunta 10========
		
		int timeZone = 2;
		String s = "-";
		switch (timeZone) {
			case 1: s += "e";
			case 2: s += "c";
			case 3: s += "m";
			default: s += "X";
			case 4: s += "p";
		}
		System.out.println(s);
		// ===========================
		// ========Pregunta 11========
	
		// Variable previamente declarada
		x = 5;
		boolean b1 = true;
		boolean b2 = false;
		
		if ( (x ==4) && !b2) 
			System.out.print("1 ");
		    System.out.print("2 ");
		
		if ( (b2 = true) && b1 ) {   // true && b1 -> true && true
			System.out.print("3 ");
		}
		
		// ===========================
		// ========Pregunta 12========
		/*String #name = "Jane Doe";
		int $age = 24;
		Double _height = 123.5;
		double ~temp = 27.5;*/
		// ===========================
			int me_encanta_selena_gomez;
	}

}
