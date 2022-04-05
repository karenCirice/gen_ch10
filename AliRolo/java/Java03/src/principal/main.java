package principal;
/**
 * Sesión Java 03, variables y asignación de datos.
 * Datos primitivos en Java
 * @author Alo
 * 31 de Marzo 2022
 *
 */
public class main {
public static void main(String[] args) {
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
			
			
			//Es posible separar un número con _
			int binValSeparado = 0b11_10_11;
			int intValSeparado = 123_345;
			
			System.out.println(intValSeparado);
			System.out.println(hexVal);
			System.out.println(Integer.toBinaryString(intVal));
			
			//Definimos una variable de tipo long
			System.out.println("Max Long " + Long.MAX_VALUE);
			System.out.println("Min Long " + Long.MIN_VALUE);
			System.out.println("Bytes Long " + Long.BYTES);
			//long longVal = 9223372036854775807
		
			
			//Definimos una variable de tipo float
			float floatVar = 3.4028234663852886E38f;
			
			//Definimos una variable de tipo double
			double doubleVar = 	1.7976931348623157E308;
			
			//Podemos usar var para declarar una variable local, JDK 10 en adelante
			//Local-Variable Type Inference
			var variableDouble = 3.4028234663852886E38;
			var variableString  = "Hola humano";
			var variableBoolean = true;
			var variableChar = 'm';
			var variableUnicodeN = 
					
			//Convertir tipos de datos
			//byte bVarTruncada = (byte) 2660;
			//System.out.println(bVarTruncada);
			
			//Convertir tipo string a tipo int
			int edad = Integer.parseInt("20");
			
			
	}

}
