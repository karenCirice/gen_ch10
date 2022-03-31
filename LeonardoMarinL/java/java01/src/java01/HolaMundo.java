package java01;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo de nuevo");
		//definimos una variable boolean
		boolean result = true;
		//definimos una variable de tipo caracter, se debe escribir con apóstrofe
		char capitalC = 'C';
		//definimos una variable de tipo byte
		byte b = 100;
		//definimos una variable de tipo short
		short s = 10000;
		//definimos una variable de tipo int base 10
		int i = 26;
		//definimos una variable de tipo int representación hexadecimal
		int hexVal = 0x1a;
		//definimos una variable de tipo int representación binaria;
		int binVal = 0b11010; //un valor binario siempre se antepone un 0b
		
		int octVal = 032; //un valor octal se antepone un 0
		


		System.out.println(i);
		System.out.println(hexVal);
		System.out.println(binVal);
		System.out.println(octVal);
	}

}
