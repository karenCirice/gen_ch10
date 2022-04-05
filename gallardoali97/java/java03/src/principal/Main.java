package principal;

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
			
			int binValSeparado = 0b1011_10_11;
			int intValSeparado = 123_456;
			/*
			System.out.println(Integer.toBinaryString(intVal));
			System.out.println(binValSeparado);
			System.out.println(intValSeparado);
			*/
            //Verificamos el mmaximo valor de un tipo long
			/*System.out.println("Max Long"+Long.MAX_VALUE);
			System.out.println("Max Long"+Long.MIN_VALUE);
			System.out.println("Max Long"+Long.SIZE);
			System.out.println("Max Long"+Long.BYTES);
    */
			
			long valorLong = 12313142342353555L;
			float floatVar = (float) 3.141634245325355;
			float floatVar2 =  3.141634245325355F;
			double doubleVar = 1.792343242423;
			
			//Variable local de tipo interferencia
			var variableDouble = 3.23232;
			var variableString = "Hola humano";
			var variableBoolean = true;
			var variableChar =  'n';
			var variableUnicode = '\u006D';
			var variableInt = 123456;
			
			//Concatenar
			//System.out.println(variableString + ", "+"un susto y un gusto");
			//System.out.println("Este texto se divide \n en 2");
			//System.out.println("Este texto \'tiene apostrofes\'");
			//byte bVarTruncada = (byte) 100;
			//System.out.println(bVarTruncada);
			//Convertir tipo string a tipo int
			int edad = Integer.parseInt("20");
			var valorPI = Double.parseDouble("3.141592");
			
			String edadTexto = String.valueOf(21);
			char caracter = "hola".charAt(2);
			
			System.out.println(caracter);
			
  }        
}
