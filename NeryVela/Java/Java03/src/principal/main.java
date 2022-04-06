package principal;

/**
 * @author NVV
 * 31 mar. 2022
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int bitValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;

		System.out.println(bitValSeparado);
		System.out.println(intValSeparado);
		System.out.println(Integer.toBinaryString(intVal));
		
		//Verificamos el maximo valor de un tipo long
		System.out.println("Max Long " + Long.MAX_VALUE);
		//Verificamos el minimo valor de un tipo long
		System.out.println("Min Long " + Long.MIN_VALUE);
		//Verificamos los bytes de un long
		System.out.println("Bytes Long " + Long.BYTES);
		//Verificamos el tamaño de un long
		System.out.println("Size Long " + Long.SIZE);
		
		//Definimos un variable de tipp float
		long valLong = 9223372036854775807L; 
		System.out.println(valLong);
		//Definimos un variable de tipp float
		float floatVar = 3.4028234663852886E38f;
		System.out.println(floatVar);
		
		//Podemos usar var para declarar una variable local, JDK 10 en adelante
		//Local-Variable Type Inference
		var variableDouble = 3;
		var variableString = "Hola humano";
		var variableBoolean = true;
		var variableChar = 'm';
		var variableUnicode = '\u006D';
		char variableUnicodeN = 109;
		
		System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);
		System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
		System.out.println("Mi numero: " + 7 + 8);
		
		byte bVar = (byte) 130;
		System.out.println(bVar);
		
		//Convertir de string a int
		int edad = Integer.parseInt("20");
		System.out.println(edad);
		
		var valorPI = Double.parseDouble("3.141592");
		System.out.println(valorPI);
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(2);
		
		System.out.println(caracter);
	}

}