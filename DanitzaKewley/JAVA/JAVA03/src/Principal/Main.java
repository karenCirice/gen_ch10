package Principal;

/**
 * Sesión Java 03, variables y asignación de datos. Datos Primitivos en Java
 * 
 * @author DANY 31 mar. 2022
 */
public class Main {

	public static void main(String[] args) {
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short sho = 10000;
		// DEfinimos una varibale de tipo int, representación decimal
		int intVal = 26;
		// Definimos una varible de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representación binaria
		int binVal = 0b11010;
		// Definimos una variable de tipo int, representación octal
		int octVal = 032;

		/*
		 * System.out.println(result); System.out.println(capitalC);
		 * System.out.println(b); System.out.println(sho); System.out.println(intVal);
		 * System.out.println(hexVal); System.out.println(binVal);
		 * System.out.println(octVal);
		 */

		// Es posible separar un número de cualquier tipo con _
		// Para número flotantes no pueden ir antes ni despues del .
		// Tampoco se puede poner antes del número ni despues del número
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;

		/*
		 * System.out.println(binValSeparado); System.out.println(intValSeparado);
		 * System.out.println(hexVal); System.out.println(binVal); //Si quiero que
		 * imprima algo en binario System.out.println(Integer.toBinaryString(intVal));
		 * System.out.println(Integer.toHexString(intVal));
		 */

		/*
		 * //Verificamos el máximo valor de un tipo Long System.out.println("Max Long "
		 * + Long.MAX_VALUE); System.out.println("Min Long " + Long.MIN_VALUE);
		 * System.out.println("Bytes Long " + Long.BYTES);
		 * System.out.println("Size Long " + Long.SIZE);
		 * 
		 * System.out.println("Max Short " + Short.MAX_VALUE);
		 * System.out.println("Min Short " + Short.MIN_VALUE);
		 * System.out.println("Bytes Short " + Short.BYTES);
		 * System.out.println("Size Short " + Short.SIZE);
		 */

		// Definimos una variable de tipo Long
		// Para una variable tipo long debemos usar literal L
		long valLong = 9223372036854775807L;

		// Definimos una variable de tipo float
		// se debe agregar la literal f por que si no lo toma como tipo double
		// tambien se puede escibir asi float floatvar = (float) 3.4028234663852886E38;
		float floatvar = 3.4028234663852886E38f;

		// Definimos una variable de tipo double, puede agregarsee la letra D
		double doubleVar = 1.7976931348623157E308;

		// Podemos utilizar va para declarar una varibale local, JDK 10 en adelante
		// Solo se puede utilizar dentro de un metodo por que es local
		// Local-Variable Type Inference
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Hola humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		// System.out.println( variableChar + " " + variableUnicode + " " +
		// variableUnicodeN);

		/*
		 * //Concatenar string System.out.println(variableString + " " +
		 * "gusto en saludarte"); System.out.println(variableString + " " +
		 * variableDouble + " " + variableBoolean); System.out.println("Mi número " + 7
		 * + 8); System.out.println(7 + 8 + " Mi número");
		 * System.out.println("Mi número " + (7 + 8));
		 */

		// Se pueden usar lietarles en char y string
		// System.out.println("Este texto \n tiene 2 lineas");
		// System.out.println("Este texto \'tine apóstrofes\' ");

		// Convertir tipos de datos
		// byte bVarTruncada = 127; asi no puede ser más grande que 127
		// Esto ocurre con cualquier tipo de dato (lo que ocurre en el ejemplo sig:)
		byte bVarTruncada = (byte) 2660;
		System.out.println(bVarTruncada);

		// Convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		System.out.println(edad);

		// convertir tipo float a tipo double
		var valorPI = Double.parseDouble("3.141592");
		System.out.println(valorPI);

		// convertir tipo int a tipo string
		String edadTexto = String.valueOf(21);
		System.out.println(edadTexto);

		// metodo para obtener un caracter del string charAt y el valor recordar que
		// empieza con el 0
		char caracter = "hola".charAt(2);
		System.out.println(caracter);

	}

}
