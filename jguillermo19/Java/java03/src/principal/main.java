package principal;

public class main {
	public static void main(String[] args) {
		// Definimos una variable booleana
		boolean result = true;
		//Definimos una variable de tipo caracter, se DEBE escribir con ap�strofe
		char capitalC = 'C';
	    // Definimos una variable de tipo byte
		byte b = 100;
		//Definimos una variable de tipo short
		short s = 10000;
		//DEfinimos una varibale de tipo int, representaci�n decimal
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
		
		System.out.println(intValSeparado);
		System.out.println(Integer.toBinaryString(intVal));
	}
}


