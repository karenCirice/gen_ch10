package principal;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, debe ir con apostrofe (16 bit)
		char capitalC = 'C';
		// Definimos una variable de tipo byte (8 bits)
		byte b = 100;
		// definimos una variable de tipo short (16 bits)
		short s = 10000;
		// una tipo long (64 bits)
		long l = 1000;
		// definimos una de tipo float (32 bits)
		float f = (float) 10.0;
		// definimos una varible de tipo int (32 bits)
		int i = 26;
		// definimos una tipo int en hexadecimal su prefijo es 0x
		int hexVal = 0x1a;
		// definimos una variable de tipo int en decimal
		int binVal = 0b11010;
		/// definimos una variable de tipo int en octadecimales
		int octaVal = 032;

		// es posible separar un numero con _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;

		/*
		 * System.out.println(intValSeparado); System.out.println(hexVal);
		 * System.out.println(binVal);
		 * System.out.println(Integer.toBinaryString(intValSeparado));
		 * System.out.println(Integer.toHexString(intValSeparado));
		 */

		// Valor maximo y minimo de un tipo Long
		/*
		 * System.out.println("Max Long" + Long.MAX_VALUE);
		 * System.out.println("Min Long" + Long.MIN_VALUE);
		 * System.out.println("Bytes Long" + Long.BYTES);
		 */

		// Ahora le valor minimo y maximo de un tipo short
		/*
		 * System.out.println("Max short" + Short.MAX_VALUE);
		 * System.out.println("Min short" + Short.MIN_VALUE);
		 * System.out.println("Bytes short" + Short.BYTES);
		 */

		// Definimos una variable de tipo long
		// long longVal = 9223372036854775807;
		// Con literal (usando L)
		long valLong = 9223372036854775807L;

		// Definimos una variable de tipo float
		float floatVar = 3.4028234663852886E38f;

		// Definimos una variable de tipo double, se puede agregar D
		double doubleVar = 1.7976931348623157E308;

		// Podemos usar var para declarar una variable local, JDK en adelante
		// Local-Variable Type Inference
		var variableDouble = 3.4028234663852886E38f;
		var variableString = "Hola mundo";
		var variableBoolean = true;
		var variableChar = "m";
		var variableUnicode = "\u006D";
		char variableUnicodeN = 109;
		// System.out.println( variableChar + " " + variableUnicode + " " +
		// variableUnicodeN );

		// var suma = longValiLit + variableDouble ;

		// Concatenar string
		/*
		 * System.out.println(variableString + " " + "gusto en saludarte");
		 * System.out.println(variableString + " " + variableDouble + " " +
		 * variableBoolean); System.out.println("Mi numero" + (7+8));
		 * System.out.println(7+8+"Mi numero");
		 */

		// Se pueden usar literales en char y string
		/*
		 * System.out.println("Este texto \n tiene 2 líneas");
		 * System.out.println("Este texto \´tiene apóstrofes");
		 */

		// Convertir tipos de datos
		byte bVarTruncada = (byte) 129;
		// System.out.println(bVarTruncada);

		// Convertir tipo String a tipo int
		int edad = Integer.parseInt("20");
		var valorPi = Double.parseDouble("3.141592");

		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(2);
		System.out.println(caracter);

	}
}
