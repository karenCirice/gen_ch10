package principal;
/**
 * Sesión Java 03, variables y asignación de datos
 * Datos primitivos en java
 * @author DELL
 * 31 mar.2022
 */

public class Main {
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
			int binValSeparado = 0b1011_10_11;
			int intValSeparado = 1_23_345;
			
			/*System.out.println(intValSeparado);
			System.out.println(binValSeparado);
			System.out.println(binVal);
			System.out.println(Integer.toBinaryString(intVal));
			System.out.println(Integer.toHexString(intVal));
			*/
			
			
			//Verificamos el máximo valor de un tipo long
			/*System.out.println("Max Long " + Long.MAX_VALUE);
			System.out.println("Min Long " + Long.MIN_VALUE);
			System.out.println("Bytes Long " + Long.BYTES);
			*/
			
			//Verificamos el máximo valor de un tipo Short
			/*System.out.println("Max Short " + Short.MAX_VALUE);
			System.out.println("Min Short " + Short.MIN_VALUE);
			System.out.println("Bytes short " + Short.BYTES);
			*/
			
			// Definir una variable de tipo long
			
			//podemos usar var para delarar una variable local, JDK 10 en adelante
		      
			var variableDouble= 3.402823456789848598;
			var variableString= "hola humano";
			var variableBoolean = true;
			System.out.println(variableBoolean);
			var variableChar = "m";
			var variableUnicode='\u006D';
			char variableUnicodeN =109;
			System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);
			
			System.out.println(variableString + " " + "gusto en saludarte");
			System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
			// Concatenar string 
			System.out.println("mi numero" +7 +8 );
			System.out.println(7+ 8 + "Mi numero");
			System.out.println("mi numero" + (7+8));
			
			// se pueden usar literales en char y string
			System.out.println("Este texto \n tiene 2 líneas");
			System.out.println("Este texto \'tiene apóstrofes\' ");
			
		     // convertir tipos de datos	
			byte bVarTruncada = (byte) 128;
			byte bVarTruncadaS = (byte) 2660;
			System.out.println(bVarTruncadaS);
			
			//convertir string a tipo int
			int edad= Integer.parseInt("20");
			var ValorPI= Double.parseDouble("3.141592");
			
			String edadTexto= String.valueOf(21);
			char caracter = "hola".charAt(2);
			
			System.out.println(caracter);
			
			
			
			
			
}
}
