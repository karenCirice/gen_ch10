package java03; //aqui debia ser principal

//y el que dice principal es el main.java

/**
 * 
 * @author AnarquiaLule "Francisco Espinosa"
 *
 */

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// DEfinimos una varibale de tipo int, representación decimal
		int intVal = 10;
		// Definimos una varible de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representación binaria
		int binVal = 0b11010;
		// Definimos una variable de tipo int, representación octal
		int octVal = 032;

		// Es posible separar un numero con un _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;

		// System.out.println("Hola");

		// System.out.println(Integer.toBinaryString(intVal));

		// Verificamos el maximo valor de un tipo long
		/*
		 * System.out.println("Max Long: "+ Long.MAX_VALUE);
		 * System.out.println("Min Long: "+ Long.MIN_VALUE);
		 * System.out.println("Size Long: "+ Long.SIZE);
		 * System.out.println("Bytes Long: "+ Long.BYTES);
		 * System.out.println("Max Short: "+ Short.MAX_VALUE);
		 * System.out.println("Min Short: "+ Short.MIN_VALUE);
		 * System.out.println("Size Short: "+ Short.SIZE);
		 * System.out.println("Bytes Short: "+ Short.BYTES);
		 */

		// Definimos una variable de tipo float
		float floatVar = 1.7976931348623157E38f;
		// System.out.println(floatVar);
		// Local variable Type reference (var)
		// var variableChar='m';
		var variableUnicodeN = '\u0096';
		System.out.println(variableUnicodeN);

		// Convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");

		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1); // dentro del parentesis es el index 1, de un hola, por eso el resultado es o
		System.out.println(caracter);
	}

}
