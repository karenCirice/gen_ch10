package java01;

public class HolaMundo {
	/**
	 * Este es un comentario realizaco con /** Enter, el cual se puede editar la
	 * forma base con Windows>preferences>java>codestyle>codeTemplates y escoges em
	 * type la configuraci�n que quieras
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo desde el IDE");
		// Definimos una variable booleana
		boolean result = true;
		// Definimos una variable de tipo caracter, se DEBE escribir con ap�strofe
		char capitalC = 'C';
		// Definimos una variable de tipo byte
		byte b = 100;
		// Definimos una variable de tipo short
		short s = 10000;
		// Definimos una variable de tipo int. base 10
		int i = 26;
		// Definimos una variable de tipo int, representaci�n hexadecimal
		int hexVal = 0x1a;
		// Definimos una variable de tipo int, representaci�n binaria
		int binVal = 0b11010;
		// Definimos una variable de tipo int, representaci�n octal
		int octVal = 32;

		// Es posible separar un n�mero con _
		int binValSeparado = 0b1001_10_11;
		int intValSeparado = 1_23_34_5;

		System.out.println(intValSeparado);
		
		//El integer sirve para que imprima el n�mero en decimal, binario o de la forma que busquemos
		System.out.println(Integer.toBinaryString(15));

		// System.out.println(i);
		// System.out.println(hexVal);
		// System.out.println(binVal);
		// System.out.println(octVal);
		// Del 11 al 15 no hay actividades
	}

}
