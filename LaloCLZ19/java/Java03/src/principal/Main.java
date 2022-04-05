package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// DEfinimos una varibale de tipo int, representación decimal
		int intVal = 26;
		// Definimos una varible de tipo int, representación hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representación binaria
		int binVal = 0b11010;
		// Definimos una variable de tipo int, representación octal
		int octVal = 032;
		
		//Es posible separar un numero con;
		int binValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
		
		System.out.println(intValSeparado);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toHexString(intVal));
		
		//Verificamos el maximo valor de un tipo Long
		
		System.out.println("Max Long: "+Long.MAX_VALUE);
		System.out.println("Bytes: "+Long.BYTES);
		System.out.println("Min Long: "+Long.MIN_VALUE);
		System.out.println("Max Size: "+Long.SIZE);
		//Long valie
		long valLong = 9223372036854775807L;
		
		//Float
		float valFloat = 3.4028234663852886E38f;
		// tambien se puede usar un envoltorio (float)
		
		//Podemos usar var para declarar una variable local, JDK en adelante
		var variableDouble = 3.4028234663852886E38f;
		var variableString = "Hola humano";
		var variableBool = true;
		var variableChar = 'C';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		System.out.println();
		
		System.out.println("Este texto \n tiene 2 lineas");
		System.out.println("Este texto \'tiene apostrofes\'");
		
		//Convertir tipos de datos
		byte bvTr = (byte) 2260;
		System.out.println(bvTr);
		
		//Convertir tipo Stringo to int
		int edad = Integer.parseInt("20");
		
		//Convertir a double
		var valorPi = Double.parseDouble("3.1416");
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1);
		
		System.out.println(edadTexto+".");
		System.out.println(caracter);
	}

}
