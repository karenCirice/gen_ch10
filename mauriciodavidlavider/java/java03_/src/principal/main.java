package principal;

/**
 * 
 * @author mdavi
 *
 */

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//Es posible suparar un número con _
		int binValorSeparado = 0b011_10_11;
		int intValorSeparado = 123_345;
		
		System.out.println(intValorSeparado);
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toHexString(50));
		System.out.println(hexVal);
		System.out.println(binVal);
		
		//Verificamos el maximo valor de un tipo Long
		System.out.println("Max Long " + Long.MAX_VALUE);
		System.out.println("Min Long " + Long.MIN_VALUE);
		System.out.println("Size " + Long.SIZE);
		System.out.println("Bytes Long" + Long.BYTES);
		
		long valLong = 9223372036854775801L;
		System.out.println(valLong);
		
		//Verificamos el maximo valor de un tipo float
		System.out.println("Max Long " + Float.MAX_VALUE);
		System.out.println("Min Long " + Float.MIN_VALUE);
		System.out.println("Size " + Float.SIZE);
		System.out.println("Bytes Long" + Float.BYTES);
		
		//Variable tipo float
		float floatVar = 3.4028234663852886E38f;
		System.out.println(floatVar);
		
		//Variable tipo double
		double doubleVar = 1.7976931348623157E308;
		System.out.println(doubleVar);
		
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Hola mundo";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);
		
		//Concatenar string
		System.out.println(variableString + " " + "gusto en saludarte");
		System.out.println("Mi numero" + 7 + 8);
		System.out.println(7 + 8 + "Mi numero");
		System.out.println("Mi numero" + (7 + 8));
		System.out.println("Este texto \n tiene 2 líneas");
		System.out.println("Este texto \'tiene apostrofes\'");
		
		byte bVarTruncada = (byte)129; //Lo trunca
		System.out.println(bVarTruncada);
		
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.14159");
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1);
	}

}

