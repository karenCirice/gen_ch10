package java03;

/**
 * 
 * @author GABRI
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable boolean
		boolean result = true;
		// Variable caracter
		char capitalC = 'C';
		// Variable byte
		byte b = 100;
		// Variable int
		int intVal = 26;
		// Variable int, representación hexadecimal
		int hexVal = 0x1a;
		// Variable in, representación binaria
		int binVal = 0b11010;
		// Variable int, representación octal
		int octVal = 032;

		// Es posible separar por miles un número con _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;

		System.out.println(intVal);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(octVal);
		System.out.println(intValSeparado);

		/*----Día Jueves 31/03/2022----*/
		System.out.println(Integer.toBinaryString(intVal));
		System.out.println(Integer.toHexString(intVal));

		System.out.println("Max Long " + Long.MAX_VALUE);
		System.out.println("Min Long " + Long.MIN_VALUE);
		System.out.println("Bytes Long " + Long.BYTES);
		System.out.println("Size Long " + Long.SIZE);

		System.out.println("Max short " + Short.MAX_VALUE);
		System.out.println("Max short " + Short.MIN_VALUE);
		System.out.println("Max short " + Short.BYTES);
		System.out.println("Size short " + Short.SIZE);

		// Definimos una variable tipo Long, L
		long valLong = 9223372036854775801L;

		// Definimos variable tipo float, f
		float floatVar = 3.4028234663852886E38f;

		// Definimos una variable Double, D
		double doubleValue = 1.7976931348623157E308;

		// Podemos usar var para declarar una variable local,JDK 10 en adelante
		// Local-Variable Type Interference
		/*----Siempre usar mejor los tipos primitivos----*/
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Hola humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;// No se usa var, porque trae el unicode

		System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);

		// Concatenar string
		System.out.println(variableString + " " + "gusto en saludarte");
		System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
		System.out.println("Mi numero " + (7 + 8));
		System.out.println(7 + 8 + " Mi numero");

		// Se pueden usar literales en char y String
		System.out.println("Este texto \n tiene dos líneas");
		System.out.println("Este texto tiene \' tiene apóstrofes \' ");

		// Convertir tipos de datos
		// Ojo si rebasa el límite le da la vuelta y me da ese número
		byte bVarTruncada = (byte) 2660;// 256*NVueltas+el que quiero que me de
		System.out.println(bVarTruncada);

		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1);

		System.out.println(caracter);

	}

}
