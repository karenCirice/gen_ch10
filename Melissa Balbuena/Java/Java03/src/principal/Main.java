package principal;

/**
 * 
 * @author Itzel Alvarez
 *
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo desde el IDE");
		// Define una variable booleana
		boolean result = true;
	
		// Definimos una variable de tipo caracter, se debe escribir con apostrofe
		char capitalC = 'C';
		
		// Define una variable tipo byte.
		byte b = 100;
		
		// Define una variable tipo short.
		short s = 10000;
		
		// Define una variable tipo int, base 10.
		int i = 100000;
		
		// Define una variable de tipo int, representacion hexadecimal
		int hexVal = 0x1a;
		
		// Define una variable de tipo int, representacion binaria
		int binVal = 0b11010;
		
		int octVal = 032;
		
		// Es posible separar un numero con _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
	
		// Definimos una variable de tipo long
		long longVal = 9223372036854775807L;
		
		// Define una variable de tipo long y usamos literal L
		long valLong = 9223372036854775807L;
		
		// Define una variable de tipo long y usamos literal L
		long longValLit = 9223372036854775807L;
		
		// Define una variable tipo float
		float floatVar = 3.4028234663852886e38f;
		
		// Define una variable de tipo double, puede agregarse la letra D
		double doubleVar = 	1.7976931348623157E308;
		
		// Se puede usar var para declarar una variable local, JDK 10 en adelante
		// Local-Variable Type Interference
		
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Holi Mundo";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		
	//	System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN););
			
	//  var suma = longValLit = variableDouble;
				
		
	//	Concatenar string
		
		System.out.println(variableString + " " + "Holi de nuevo");
		System.out.println(variableString + " "+ variableDouble);
		System.out.println("Mi numero " + 6 + 7);
		System.out.println(7 + 8 + " Mi numero" );
		
	// Se puede usar literales en char y String
		
	//	System.out.println("Este texto \n tiene 2 lineas");
	//	System.out.println("Este texto \'tiene apostrofes\' ");
		
	//  Convertir tipos de datos
		byte bVarTruncada = (byte) 2660; 	//125 126
		System.out.println(bVarTruncada);
		
	// convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(2);
		
		System.out.println(edadTexto);
		
		
	//	System.out.println(result);
	//	System.out.println(capitalC);
	//	System.out.println(b);
	//	System.out.println(s);
	//	System.out.println(i);
	//	System.out.println(hexVal);
	//	System.out.println(binVal);
	//	System.out.println(octVal);
		
	//	System.out.println(binValSeparado);
	//	System.out.println(intValSeparado);
		
	//	System.out.println(Integer.toBinaryString(intValSeparado));
		
	//	System.out.println(Integer.toHexString(intValSeparado));
		
	//	System.out.println(Long.BYTES);
		
		//Verifica el maximo valor de un tipo Long
	//	System.out.println("Max Long" + Long.MAX_VALUE);
	//	System.out.println("Min Long" + Long.MIN_VALUE);
	//	System.out.println("Bytes Long" + Long.BYTES);
		
		// 
		
	}
}

