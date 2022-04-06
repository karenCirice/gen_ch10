package java03_;
/**
 * Programa de archivos JAVA03
 * @author Alberto Ceja
 *
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
				//es posible separa un numero con "__"
				int bintValSeparado = 0b1011_10_11;	
				int  intValSeparado = 123_345;
				
				System.out.println(intValSeparado);
				
				//Comprobar el valor max de Long
				System.out.println("Max Long "+ Short.MAX_VALUE);
				//Comprobar el valor min de Long
				System.out.println("Min Long "+ Short.MIN_VALUE);
				//Comprobar el valor de maximo de BYTE
				System.out.println("Byte value "+ Short.BYTES);
				
				//Convertir un string a un tipo numérico
				int edad = Integer.parseInt("20");
				//Convertir string a Double
				var valorPI = Double.parseDouble("3.141592");
				
				String edadTexto = String.valueOf(21);
				char caracter = "hola".charAt(2);
				 
				
	}
}
