package java01;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo de nuevo");
		//Definimos una variable booleana
		boolean result = true;
		//Definimos una variable de tipo caracter, se DEBE escribir con apostrofe
		char capitalC = 'C';
		//Definimos una variable de tipo byte
		byte b = 100;
		//Definimos una variable de tipo short
		short s = 10000;
		//Definimos una variable de tipo int, base 10
		int i = 26;
		//Definimos una variable de tipo int, representacion hexadecimal
		int hexVal = 0x1a;
		//Definimos una variable de tipo int, representacion binaria
		int binVal = 0b11010;
		//Definimos una variable de tipo int, representacion octal
		int octVal = 032;
		
		System.out.println(result);
		System.out.println(capitalC);
		System.out.println(b);
		System.out.println(i);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(octVal);
	}

}
