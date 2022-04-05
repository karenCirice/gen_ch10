package principal;

/**
 * Seccion JAva03, variables y asignación de datos.
 * 
 * @author elisa 31 mar. 2022
 */

/**
 * @author elisa
 * 31 mar. 2022
 */
/**
 * @author elisa
 * 31 mar. 2022
 */
public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definimos un variable boolean
		boolean result = true;
		// Variable de tipo caracter, se ebe escribir con comillas simples ''
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// tipo short
		short s = 10000;
		// tipo int
		int intVal = 26;
		// variable tipo int en hexadecimal
		int hexVal = 0x1a;
		// variable tipo int en binario
		int binVal = 0b11010;

		// syso + ctrl + barra
		// ctrl + tab - encontrar variables
//		System.out.println(result);
//		System.out.println(capitalC);
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(intVal);
//		System.out.println(hexVal);
//		System.out.println(binVal);
		
		//es posile separar un numero con _
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
		
		/**
		System.out.println(intValSeparado);
		//imprime numero entero a numero binario.
		System.out.println(Integer.toBinaryString(intVal));
		//imprime a formato hexadecimal
		System.out.println(Integer.toHexString(intVal));
		*/
		
		//verificamos los valores de tipo long
//		System.out.println("Max Long: " + Long.MAX_VALUE);
//		System.out.println("Min Long: " + Long.MIN_VALUE);
//		System.out.println("Byte: "+ Long.BYTES);
//		System.out.println("Size: " + Long.SIZE);
		
		//Para definir una variable long, se pone L al final del numero
		long valLong = 1923810293801298L;
//		System.out.println(valLong);
		
		//se coloca un f al final del numero
		float floatVar = 3.4028234663852886E38f;
//		System.out.println(floatVar);
		
		double doubleVar = 1.87368392878338;
		
		//Var son variables locales, pero es mejor usar las otras variables(tipado)
		var variableDouble = 3.4028234663852886E38;
		var variableString = "Hola Humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char varibaleUnicodeN = 109;
		
//		System.out.println( variableChar + " " + variableUnicode + " " + varibaleUnicodeN );
	
		
		//concatenar strings
		System.out.println(variableString + " " + "gusto es saludarte");
		System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
		System.out.println("Mi numero " + 7 + 8); // para que sume se ponen () entre los numeros
		System.out.println(7 + 8 + " Mi numero");
	
		//literales en chat y string
		System.out.println("Este texto  \n tiene 2 lineas");
		System.out.println("Este texto \'tiene apostrofes\'");
	
		//convetir tipos de datos
		byte bvarTruncada = (byte) 130; //x =(128-num)/ -128+x = resultado si te pasas de lo permitido
		
		System.out.println(bvarTruncada);
	
		//String a tipo int
		int edad = Integer.parseInt("20");
		System.out.println(edad);
		//String a double
		var valorPI = Double.parseDouble("3.141592");
		
		//un string es un objeto
		String edadTexto = String.valueOf(21);
		
		char caracter = "hola".charAt(1); // regresa el caracter e la posicion index.
	
	}
	

}
