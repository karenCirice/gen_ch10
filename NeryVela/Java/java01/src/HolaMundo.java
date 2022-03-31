package java01;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola mundo de nuevo");
		boolean result = true; //Definimos una variable booleana
		char capitalC =  'C'; //Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
		byte b = 100; //Definimos una variable de tipo byte
		short s= 10000; //Definimos una variable de tipo short
		int i = 26; //Definimos una variable de tipo int, base 10
		int hexVal = 0x1a; //Int en hexadecimal
		int binVal = 0b11010;//Int en binario
		int octVal=032; //Int en octal
		
		System.out.println(i);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(octVal);
		System.out.println(capitalC);
		System.out.println(b);
		System.out.println(s);
	}

}