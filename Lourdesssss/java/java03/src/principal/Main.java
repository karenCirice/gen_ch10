package principal;
/**
 * 
 * */
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
				
				//es posible separar un numero con:
				int bintValSeparado = 0b1011_10_11;
				int intValSeparado = 1014;
				/*
				System.out.println(intValSeparado);
				System.out.println(hexVal);
				System.out.println(binVal);
				System.out.println(Integer.toBinaryString(intVal));
				System.out.println(Integer.toHexString(intVal));
				*/
				//Verificamos el máximo, minimo y los bytes de un tipo Long
				/*System.out.println("Max Long" + Long.MAX_VALUE);
				System.out.println("Min Long" + Long.MIN_VALUE);
				System.out.println("Bytes Long" + Long.BYTES);*/
				
				System.out.println("Max Short" + Short.MAX_VALUE);
				System.out.println("Min Short" + Short.MIN_VALUE);
				System.out.println("Bytes Short" + Short.BYTES);
				
				//podemos utilizar var para declarar una variable:
				var variableDouble = 3.1416;
				var variableString = "Hola Humano";
				var variableBoolean = true;
				var variableChar = 'v';
				
	}

}
