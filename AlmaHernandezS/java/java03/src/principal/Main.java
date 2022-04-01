package principal;

public class Main {

	public static void main(String[] args) {
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se escribe con apostrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// Definimos una variable de tipo int, base 10
		int intVal = 26;
		// Definimos una variable de tipo int, representacion hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representacion binaria
		int binVal = 0b11010;
		//Definimos una variable de tipo int, representacion octal
		int octVal = 032;
		
		//Es posible separar un numero con
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 1_23_34_5;

		/*
		System.out.println(intValSeparado);
		System.out.println(intVal);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(octVal);
		System.out.println(Integer.toBinaryString(intVal));
		System.out.println(Integer.toHexString(intVal));
		*/
		
		//Verificamos el maximo valor de tipo long
		/*
		System.out.println("Max Long"+ Long.MAX_VALUE);
		System.out.println("Min Long"+ Long.MIN_VALUE);
		System.out.println("Bytes Long"+ Long.BYTES);
		System.out.println("Size Long"+ Long.SIZE); */
		
		/*
		System.out.println("Max short"+ Short.MAX_VALUE);
		System.out.println("Min short"+ Short.MIN_VALUE);
		System.out.println("Bytes short"+ Short.BYTES);
		System.out.println("Size short"+ Short.SIZE);
		*/
		
		//Definimos una variable tipo long y usamos literal L
		long valLong = 9223372036854775807L;
		//Definimos una variable tipo float
		float floatVal = 3.4028234663852886E38f;
		//Definimos una variable tipo double
		double doubleVal = 1.7976931348623157E308;
		
		//Podemos usar var para declarar una variable local, de tipo interferencia
		//A partir de la version 10
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Hola humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		//System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN );
		
		//Concatenar string
		/*
		System.out.println(variableString + " " + "gusto en saludarte");
		System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
		System.out.println("Mi numero" + (7 + 8) );
		System.out.println(7 + 8 + "Mi numero");
		*/
		
		//Se puede usar leterales en char y string
		/*
		System.out.println("Este texto \n tiene 2 lineas");
		System.out.println("Este texto \'tiene apostrofes\' ");
		*/
		
		//Convertir tipos de datos
		byte bVarTruncada = (byte) 128;
		System.out.println(bVarTruncada);
		//Convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1);
		System.out.println(caracter);
		

	}

}
