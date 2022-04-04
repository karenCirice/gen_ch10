package principal;

/**
 * Sesion Java 03, variables y asignacion de datos
 * Datos primitivos en Java
 * @author X30-D Karen
 *
 */

public class Main {
	public static void main(String[] args) {
		// Definimos una variable booleana
		boolean result = true;
		//Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		//Definimos una variable de tipo short
		short s = 10000;
		//DEfinimos una varibale de tipo int, representación decimal
		int intVal = 26;
		//Definimos una varible de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		//Definimos una variable de tipo int, representación binaria
		int binVal = 0b11010;
		//Definimos una variable de tipo int, representación octal
		int octVal = 032;
		
		//Es posible separar un numero con _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
		
		/*		
		System.out.println(intValSeparado);
		System.out.println(binValSeparado);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(Integer.toBinaryString(intVal));
		System.out.println(Integer.toHexString(intVal)); 
		*/
		
		//verificamos el maximo valor de un tipo Long
		/*
		System.out.println("Max Long " + Long.MAX_VALUE);
		System.out.println("Min Long " + Long.MIN_VALUE);
		System.out.println("Bytes Long " + Long.BYTES);
		System.out.println("Size Long " + Long.SIZE);
		*/
		/*
		System.out.println("Max Short " + Short.MAX_VALUE);
		System.out.println("Min Short " + Short.MIN_VALUE);
		System.out.println("Bytes Short " + Short.BYTES);
		System.out.println("Size Short " + Short.SIZE);
		*/
		
		//Definimos una variable tipo Long
		//long longVal = 9223372036854775807;
		long valLong = 9223372036854775807L;
		
		//Definimos una variable de tipo float
		float floatVar = 3.4028234663852886E38f;
		
		//Definimos una variable de tipo double, puede agregarse la letra D
		double doubleVar = 1.7976931348623157E308; //Mientras no tenga f lo toma como double
		
		//Podemos usar var para declarar una variable local, JDK 10 en adelante
		//local-Variable Type Inference
		var variableDoble = 3.4028234663852886E38;
		var variableString = "Hola humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		
		//Concatenar String
		
		/*
		System.out.println(variableString + " " + "gusto en saludarte");
		System.out.println(variableString + " " + variableDoble + " " + variableBoolean);
		System.out.println("Mi numero es " + 7 + 8);
		System.out.println(7 + 8 + " es mi numero");
		*/
		
		//Se pueden usar literales en char y string
		/*
		System.out.println("Este texto \n tiene dos lineas");
		System.out.println("Este texto \'tiene apostrofes\' ");
		*/
		
		//Convertir tipos de datos
		byte bVarTruncada = (byte) 128;
				System.out.println(bVarTruncada);
		
	}
}
