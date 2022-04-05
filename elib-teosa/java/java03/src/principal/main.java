package principal;

/**
 * Sesión Java 03 y asignación de datos
 * Datos primitivos en Java
 * @author Beth
 * 31 mar. 2022
 */
public class main {

	public static void main(String[] args) {
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se usan comillas simples ''
		char capitalC = 'C';
		// Definimos la variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// DEfinimos una variable de tipo int, base 10
		int i = 26;
		// Definimos una variable de tipo int, base hexadecimal
		int hexVal = 0x1a;
		// DEfinimos una variable de tipo int, representacion binaria
		int binVal = 0b11010;
		// Definimos una variable de tipo int, representacion octal
		int octVal = 032;

		// escribir: "syso" ctrl + space
		// System.out.println(result);
		// System.out.println(capitalC);
		// System.out.println(b);
		// System.out.println(s);
		//System.out.println(i);
		//System.out.println(hexVal);
		//System.out.println(binVal);
		// System.out.println(octVal);
		
		int binValSeparado = 0b1011_10_11;
		// el guion bajo solo es para ayudarnos por si los número son muy largos y así tener un mejor control de su valor
		int intValSeparado = 123_345;
		//System.out.println(binValSeparado);
		//System.out.println(Integer.toBinaryString(2));
		//System.out.println(Integer.toHexString(2));
		
		/*
		//Verificamos el máximo valor de un tipo Long
		System.out.println("Max Long: " +Long.MAX_VALUE);
		System.out.println("Min Long: " +Long.MIN_VALUE);
		System.out.println("Size Long: " +Long.SIZE);
		System.out.println("Bytes Long: " +Long.BYTES);
		
		// Verificamos los datos de short
		System.out.println("Max Short: " +Short.MAX_VALUE);
		System.out.println("Min Short: " +Short.MIN_VALUE);
		System.out.println("Size Short: " +Short.SIZE);
		System.out.println("Bytes Short: " +Short.BYTES);
		*/
		
		// Definimos una variable de tipo long, la letra L es mayúscula y se usa para indicar que el número es de tipo long
		long valLong = 9223372036854775807L;
		
		// Definimos una variable de tipo float, la letra f es minúscula y se usa para indicar que el número es de tipo float
		float floatVar =3.4028234663852886E38f;
		
		// Definimos una variable de tipo double
		double doubleVar =1.7976931348623157E308;
		
		// A partir de java 10 se puede usar "var" para declarar variables, es decir, no se especifica el tipo de dato
		var variableDouble = 1.7976931348623157E308;
		var variableString = "Hola humano";
		var variableFloat = 3.4028234663852886E38f;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109; // valor númerico de la letra m
		var variableBoolean = true;
		//System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);
		
		/*
		// Concatenar String
		System.out.println(variableString + " " + "gusto en saludarte");
		System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
		System.out.println("Mi numero " + 7 + 8);// Devuelve "Mi numero 78"
		System.out.println(7 + 8 + " Mi numero");// Devuelve "78 Mi numero"
		*/
		
		/*
		// se puede usar literales en char y String
		System.out.println("Este texto \ntiene 2 líneas");
		System.out.println("Este texto \'tiene apostrofes\'");
		*/
		/*
		//Convertir tipos de datos
		byte bVarTruncada= (byte) 129;
		System.out.println(bVarTruncada);*/
		
		/*
		//Convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI= Double.parseDouble("3.141592");*/
		
		String edadTexto = String.valueOf(1);
		char caracter = "hola".charAt(1);
		
		System.out.println(caracter);
	}

}
