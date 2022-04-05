package principal;

import java.nio.file.spi.FileSystemProvider;

/**
 * 
 * @autor TuX3
 * 31 mar. 2022
 */
public class Main {
	public static void main(String[] args){
		// Definimos una variable booleana
		boolean result = true;
		//Definimos una variable de tipo caracter, se DEBE escribir con ap�strofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		//Definimos una variable de tipo short
		short s = 10000;
		//Dfinimos una varibale de tipo int, representaci�n decimal
		int intVal = 26;
		//Definimos una varible de tipo int, representaci�n hexadecimal
		int hexVal = 0x1a;
		//Definimos una variable de tipo int, representaci�n binaria
		int binVal = 0b11010;
		//Definimos una variable de tipo int, representaci�n octal
		int octVal = 032;
		
		//Es posible separar un n�mero con _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
		
		/*
		System.out.println(intValSeparado);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(Integer.toBinaryString(intVal));
		System.out.println(Integer.toHexString(intVal));
		*/
		//Verificamos el m�ximo valor de un tip long
		/*System.out.println("Max Long "+ Long.MAX_VALUE);
		System.out.println("Min Long "+ Long.MIN_VALUE);
		System.out.println("Bytes Long "+ Long.BYTES);*/
		
		/*
		System.out.println("Max short "+ Short.MAX_VALUE);
		System.out.println("Min short "+ Short.MIN_VALUE);
		System.out.println("Bytes short "+ Short.BYTES);
		*/
		
		//Definimos una vriable de tipo Long
		//long longVal = 9223372036854775807;
		//Para una variable de tipo long se usa la literal L
		/*long valLong = 9223372036854775801L;
		 */
		
		//Definimos una variable de tipo float
		float floatVar = (float) 3.4028234663852886E38f;
		
		//Definimos una variable de tipo double, puede agregarse la letra D
		double doubleVar = 1.7976931348623157E308;
		
		//Podemos usar var para declarar una variable local, JDK 10 en adelante
		//Local-Variable Type Inference
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Hola humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		//System.out.println( variableChar + " " + variableUnicode + " " + variableUnicodeN);
		
		//Concatenar string
		/*
		System.out.println(variableString +" "+ "gusto en saludarte");
		System.out.println(variableString +" "+ variableDouble);
		//Con parentes�s primero hace la suma y luego la concatenaci�n
		System.out.println("Mi numero " + (7 + 8));
		System.out.println("Mi numero " + 7 + 8); 
		System.out.println(7 + 8 + " Mi numero"); 
		*/
		/*
		//Se pueden usar literales en char y String
		System.out.println("Este texto \n tiene dos l�neas");
		System.out.println("Este texto \'tiene ap�strofes\' ");
		*/
		
		//Convertir tipos de datos
		byte bVarTruncada = (byte)129;
		//System.out.println(bVarTruncada);
		
		//Convertir tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(2);
		
		System.out.println(caracter); 
		
		
				
	}
}
