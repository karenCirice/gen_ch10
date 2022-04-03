package principal;

public class Main {
	/**
	 * Este es un comentario realizaco con /** Enter, el cual se puede editar la
	 * forma base con Windows>preferences>java>codestyle>codeTemplates y escoges em
	 * type la configuración que quieras
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo desde el IDE");
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// Definimos una variable de tipo int. base 10
		int i = 26;
		// Definimos una variable de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representación binaria
		int binVal = 0b11010;
		// Definimos una variable de tipo int, representación octal
		int octVal = 32;

		// Es posible separar un número con _
		int binValSeparado = 0b1001_10_11;
		int intValSeparado = 1_23_34_5;

		//System.out.println(intValSeparado);
		
		//El integer sirve para que imprima el número en decimal, binario o de la forma que busquemos
		//System.out.println(Integer.toBinaryString(15));
		
		//Verificamos el máximo valor de un tipo long
		//Se manda imprimir se pone entre comillas el texto que queremos y el valor a evaluar y que quieres
		//System.out.println("Max Long "+ Long.MAX_VALUE);
		//System.out.println("Min long "+Long.MIN_VALUE);
		//System.out.println("Bytes "+Long.BYTES);
		//System.out.println("Size "+Long.SIZE);
		
		//Se le tiene que decir que es un número grande agregando la letra L
		long valLong = 9223372036854775807L;
		
		//Definimos una variable de tipo float, se agrega la f al final para convertirlo a float
		float floatVar = 3.4028234663852886E38f;
		
		//Podemos usar la palabra var para declarar variable local, Java v.10 en adelante
		var variableDouble = 3.4028e38;
		var variableBoolean = true;
		var variableString = "Hola humano";
		var variableChar = "m";
		var variableUnicode = '\u006D';
		//En este caso se tiene que indicar que es char, ya que si lleva var, toma el valor como númer, al poner char luego ya se puede poner var.
		char variableUnicodeN = 109;
		//short valShort = 50109;
		
		
		
		//Concatenar String
		System.out.println("Mi número "+ (7+8)); //De esta forma con () nos suma los valores primero
		System.out.println(7 + 8 + " Es mi número"); // suma luego concatena		
		System.out.println(variableDouble + variableString);
		
		//Me pueden usar literales en char y String
		System.out.println("Este texto \n tiene 2 líneas"); //De esta forma da un salto de línea
		System.out.println("En este texto \'tiene apóstrofes\'"); // los \\ son para que deje poner los ''
		
		//Convertir tipos de datos
		byte bVarTruncada = (byte) 128; // como el máximo es 127, convertimos el byte
		System.out.println(bVarTruncada);
		
		//Convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(2);
		
		System.out.println(caracter);
 		
		// System.out.println(i);
		// System.out.println(hexVal);
		// System.out.println(binVal);
		// System.out.println(octVal);
		// Del 11 al 15 no hay actividades
	}

}
