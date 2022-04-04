package principal;

public class Main {

	public static void main(String[] args) {
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// DEfinimos una varibale de tipo int, representación decimal
		int intVal = 26;
		// Definimos una varible de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representación binaria
		int binVal = 0b11010;
		// Definimos una variable de tipo int, representación octal
		int octVal = 032;

		// Es posible separar un núemro con _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;

		// Para imprimir://

		System.out.println(intValSeparado);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(Integer.toBinaryString(intVal));
		System.out.println(Integer.toHexString(intVal));

		// Verificamos el máximo valor de un tipo Long
		System.out.println("Max Long " + Long.MAX_VALUE);
		System.out.println("Min Long " + Long.MIN_VALUE);
		System.out.println("Size Long" + Long.SIZE);
		System.out.println("Bytes Long" + Long.BYTES);

		// Verificamos el máximo valor de un tipo short
		System.out.println("Max Short " + Short.MAX_VALUE);
		System.out.println("Min Short " + Short.MIN_VALUE);
		System.out.println("Size Short " + Short.SIZE);
		System.out.println("Bytes Short " + Short.BYTES);

		// Definicmos una variable de tipo long//
		// long longVal = 9223372036854775807; Este valor no entra en un número de 32
		// bits

		// Definimos una variable long colocando L al final para que lo tome
		long valLong = 9223372036854775807L;

		// Definios una variable de tipo float
		float floatVar = 3.4028234663852886E38f;

		// Definios una variable de tipo double puede agregarse la letra D
		double doubleVar = 1.7976931348623157E308;

		// Podemos usar paradeclarar una variable local, JDK 10 en adelante
		// Local-Variable Type Inference
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Hola HUmano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);

		// var suma = longValLit + variableDouble;

		// concatenar string
		System.out.println(variableString + " " + "gusto en saludarte");
		System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
		System.out.println("Mi numero" + 7 + 8);
		System.out.println("Mi numero" + (7 + 8));
		System.out.println(7 + 8 + "Mi numero");

		// Se pueden usar literales en char y String
		System.out.println("Este texto \n tiene 2 líneas");
		System.out.println("Este texto \'n tiene apóstrofes\' ");

		// Convertir tipos de datos
		byte bVarTruncada = (byte) 2660; // 125 126
		System.out.println(bVarTruncada);

		// Convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");

		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(2);
		System.out.println(caracter);

		// print solo imprime pero printLn me hace un salto de línea el comando de salto
		// de línea es ln//

	}

}
