package principal;

public class Main {

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

				//Es posible separar un número con _
				int binValSeparado = 0b1011_10_11;
				int intValSeparado = 123_345;
				
				System.out.println(intValSeparado);
				System.out.println(hexVal);
				System.out.println(binVal);
				System.out.println(Integer.toBinaryString(intVal));
				System.out.println(Integer.toHexString(intVal));
				
				//Verificamos el máximo valor de un tipo Long
				/*System.out.println("Max long "+ Long.MAX_VALUE);
				System.out.println("Min long "+ Long.MIN_VALUE);
				System.out.println("Bytes long "+ Long.BYTES);*/
				
				//Definimos una variable de tipo long
				//long longVal = 9223372036854778074;
				//Definimos una variable de tipo long y usamos litera L
				//long longVallLit = 9223372036854778074L;
				//System.out.println(Long.BYTES);
				
				//Definimos una variable de tipo Float
				float floatVar = 1.7929875239857E38f;
				
				//Definimos una variable de tipo double, puede agregarse la letra D
				double doubleVar = 1.7976931348623157E308;
				
				//Podemos usar var para declarar una variable local, JDK 10 en adelante 
				//Local-Variable Type Interference
				var variableDouble = 3.4028234663852886E38;
				var variableString = "Hola humano";
				var variableBoolean = true;
				var variableChar = 'm';
				var variableUnicoide = '\u006D';
				char variableUnicoideN = 109; 
				System.out.println( variableChar + " " + variableUnicoide + " " + variableUnicoideN );
				
				//var suma = longValLit * variableDouble;
				
				//Concatenar string
				System.out.println(variableString + " " + "gisto en saludarte");
				System.out.println(variableString + " " + variableDouble);
				System.out.println("Mi numero " + 7 + 8);
				System.out.println(7 + 8 + " Mi numero ");
				
				
				//Se pueden usar literales en char y string
				System.out.println("Este texto  \n tiene 2 líneas");
				System.out.println("Este texto \'tiene apostrofes\' ");
				
				//convertir tipos de datos
				byte bVarTruncada = (byte) 129;  //125 126
				System.out.println(bVarTruncada);
				
				//Convertir tipo string a tipo int 
				int edad = Integer.parseInt("20");
				System.out.println(edad);
				var valorPI = Double.parseDouble("3.141592");
				
				String edadTexto = String.valueOf(21);
				char caracter = "hola".charAt(3);
				
				System.out.println(edadTexto);
				System.out.println(caracter);
				
	}

}
