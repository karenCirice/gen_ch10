package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se DEBE escribir con apostrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// Definimos una variable de tipo int, base 10
		int i = 26;
		// Definimos una variable de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representación hexadecimal
		int binVal = 0b11010;
		int intVal = 26;
		// es posible separar un numero con _
		int binvalSeparado = 0b1011_10_1;
		// System.out.println(binvalSeparado);

		int intvalSeparado = 123_456;
		// System.out.println(intvalSeparado);

		// System.out.println(Integer.toBinaryString(intVal));

		/*
		 * //Verificamos el máximo valor de un tipo Long System.out.println("Max Long "
		 * + Long.MAX_VALUE); System.out.println("Mix Long " + Long.MIN_VALUE);
		 * System.out.println("Bytes Long " + Long.BYTES);
		 * 
		 * //Verificamos el máximo valor de un tipo short
		 * System.out.println("Max short " + Short.MAX_VALUE);
		 * System.out.println("Mix short " + Short.MIN_VALUE);
		 * System.out.println("Bytes short " + Short.BYTES);
		 */
		// Definimos una variable de tipo Long
		long valLong = 9223372036854775807l;
		// Definimos una variable de tipo long y usamos literal L
		long valLongL = 9223372036854775807L;

		// Definimos una variable de tipo float
		float floatVar = 3.4028234663852886E38f;

		// Definimos una varaible de tipo double, puede agregarse la letra D
		double doubleVar = 1.7976931348623157E308;
		/*
		 * //Podemos usar var para declarar una variable local, JDK 10 en adelante
		 * //Local-Variable Type Inference var variableDouble= 1.7976931348623157E308;
		 * var variableString = "Hola Mundo"; var variableBoolean= true; var
		 * variableChar = "m"; var variableUnicode = '\u006D'; char variableUnicodeN =
		 * 109; System.out.println( variableChar + " " + variableUnicode + " " +
		 * variableUnicodeN);
		 * 
		 * //var suma = longValLit + variableDouble;
		 * 
		 * //Concatenar string
		 * 
		 * System.out.println(variableString + " " + "gusto en saludarte");
		 * System.out.println(variableString + " " + variableDouble + " " +
		 * variableBoolean); System.out.println("Mi numero" + (7 +8));
		 * System.out.println(7+8 + "Mi numero");
		 * 
		 * //Se puedem usar literales en char y string
		 * System.out.println("Este texto \n tiene 2 líenas");
		 * System.out.println("Este texto \n 'tiene apóstrofes\'");
		 * 
		 * //Convertir tipos de datos byte bVarTruncada = (byte) 28160;
		 * System.out.println(bVarTruncada);
		 */

		// Convertir tipo de datos
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		System.out.println(edad);

		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1);
		System.out.println(caracter);

		/*
		 * System.out.println(result); System.out.println(capitalC);
		 * System.out.println(b); System.out.println(s); System.out.println(i);
		 * System.out.println(hexVal); System.out.println(binVal);
		 */
	}

}
