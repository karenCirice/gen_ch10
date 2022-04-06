package principal;
/**
 * Sesión Java 03, variables y asignación
 * Datos primitivos
 * @author Leonardo
 * 31 mar-2022
 */
public class Main {

	public static void main(String[] args) {
		// definimos una variable boolean
				boolean result = true;
				// definimos una variable de tipo caracter, se debe escribir con apóstrofe
				char capitalC = 'C';
				// definimos una variable de tipo byte
				byte b = 100;
				// definimos una variable de tipo short
				short s = 10000;
				// definimos una variable de tipo int base 10
				int intVal = 26;
				// definimos una variable de tipo int representación hexadecimal
				int hexVal = 0x1a;
				// definimos una variable de tipo int representación binaria;
				int binVal = 0b11010; // un valor binario siempre se antepone un 0b
				//definimos una variable tipo int, representación octal
				int octVal = 032; // un valor octal se antepone un 0
				
				//es posible separar un número con _
				int binValSeparado = 0b1011_10_11;
				int intValSeparado = 123_345; //el guión no puede ir al inicio ni al final, y en número flotantes no van antes o después del punto
				
				/*
				System.out.println(intVal);
				System.out.println(hexVal);
				System.out.println(binVal);
				System.out.println(octVal);
				System.out.println(binValSeparado);
				System.out.println(intValSeparado);
				System.out.println(Integer.toBinaryString(intVal));
				System.out.println(Integer.toHexString(intVal)); //convierte a un string hexadecimal
				*/
				
				//Verificamos el máximo valor de un tipo long
				System.out.println("Max Long " + Long.MAX_VALUE);
				System.out.println("Min Long " + Long.MIN_VALUE);
				System.out.println("Size Long" + Long.SIZE);
				System.out.println("Bytes Long " + Long.BYTES);

				//Verificamos el máximo valor de un tipo short
				System.out.println("Max Short " + Short.MAX_VALUE);
				System.out.println("Min Short " + Short.MIN_VALUE);
				System.out.println("Size Short" + Short.SIZE);
				System.out.println("Bytes Short " + Short.BYTES); //esto por 8 para tener el valor real porque cada byte tiene 8 bits
				
				//definimos una variable de tipo long
				long valLong = 9223372036854775807L; //sin la L final no es reconocido como una variable long y marca error porque se procesa como un tipo int
				System.out.println(valLong);
				
				//definimos una variable de tipo float
				float floatVar = 3.4028234663852886E38f; //usa la f al final para reconocerlo como flotante
				System.out.println(floatVar);
				
				//definimos una variable de tipo double, puede llevar una D al final o no
				double doubleVar = 1.7976931348623157E308;
				System.out.println(doubleVar);
				
				//podemos usar var para declarar una variable local, de JDK10 en adelante
				//la desventaja es que una vez que dicha variable sea declarada, siempre será el tipo de dato que se la haya asignado, ya no podrá ser cambiado
				//Local-Variable Type Interference
				var variableDouble = 3.4028234663852886E38;
				var variableString = "Hola humano";
				var variableBoolean = true;
				var variableChar = 'm';
				var variableUnicode = '\u006D';
				char variableUnicodeN = 109;
				System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN);
				
				//Concatenar string
				
				System.out.println(variableString + " " + "gusto en saludarte");
				System.out.println(variableString + " " + variableDouble + " " + variableBoolean);
				System.out.println("Mi número "+(7+8)); // o lo concatenará
				System.out.println(7+8+ " Mi número");
				
				//Se pueden usar literales en char y string
				System.out.println("Este dato \n tiene 2 líneas"); // \n es un salto de línea
				System.out.println("Este texto \'tiene apóstrofes\' "); 
				
				//Convertir tipos de datos
				byte bVarTruncada = (byte)1000; // al ser el máximo 127 los restantes los pasa a su valor negativo, en este caso sería -126 porque los 3 restantes van de -128,-127 y termina en -126
				System.out.println(bVarTruncada);
				
				//convertir tipo string a tipo int (entero)
				int edad = Integer.parseInt("20");
				var valorPI = Double.parseDouble("3.141592");
				
				String edadTexto = String.valueOf(21);
				char caracter = "hola".charAt(1);
				
				System.out.println(edadTexto);
				System.out.println(caracter);
				

	}

}
