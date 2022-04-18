public class Main {

	public static void main(String[] args) {
	System.out.println("HolaMundo Ch10");
	
	/**
	 * Sesión Java 03, variables y asignación de datos.
	 * Datos primitivos en Java.
	 * @author adonyiriarte
	 */
			
	// Definimos una variable booleana.
	boolean result = true; 
	// Definimos una variable carácter.
	char capitalC = 'C';
	// Definimos una variable byte, un byte vale 8 bits.
	byte b = 100;
	// Definimos una variable short.
	short s = 10000;
	// Definimos una variable int base 10.
	int i = 100000;
	// Definimos una variable int base hexadecimal.
	int hexVal = 0x1a;
	// Definimos una variable int base binaria.
	int bVal = 0x11010;
	// Definimos una variable int base octal.
		int octVal = 032;
	//Es posible separar un número con _
	int binValSeparado = 0b1011_1011;
	int binValSeparado = 123_145;
	/*
	System.out.println(intVal);
	System.outp.println(capital(hexVal);
	System.out.print.ln(capital(binVal);
	System.out.println(Integer.toBinaryString(int.Val));
	 */
	
	//Verificamos el máximo valor 
	System.out.println("Max Long" + Long.MAX_VALUE);
	//Verificamos el mínimo valor 
	System.out.println("Min Long" + Long.MIN_VALUE);
	//Verificamos el bytes  
	System.out.println("size" + Long.SIZE);
	//Verificamos el size
	System.out.println("byte" + Long.BYTES);
	
	//Definimos una variable tipo long
	//long longVal = 92233720368547758071L;
	//Definimos una variable tipo long y usamos literalL
	//long longValLit = 9223372036854775807;
	
	//Podemos usar yar para declarar una variable local, JDK 10 en adelante
	//Local-Variable Type Inference 1

	var variableDouble= 3.4028234663852886E38;
	var variableString = "Hola humano”;
	var variableBoolean = true;
	var variableChar = 'm';
	var variableUnicode = '1u006D”;
	char variableUnicodeN = 109;
	
	System.out.println( variableChar, + " " + variableUnicode + " " + variableUnicodeN) ;
	

	//Se pueden usar literales en char y String
	System.out.println("Este texto \n tiene 2 líneas”);

	System.out.println("Este texto \' tiene apóstrofes1' ”);

	/*
	//Convertir tipos de datos

	byte bVarTruncada = (byte) 129;
	System.out.println(bVarTruncada);

	int edad = Integer.parseInt("20");
	yar valorPI = Double.parseDouble(”3.141592");

	String edadTexto = String.value0f(21);
	char caracter = "hola”.charAt(1);
	
	
		}
	}

