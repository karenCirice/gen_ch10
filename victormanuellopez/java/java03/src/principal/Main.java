package principal;

public class Main {
	
	public static void main(String[] args) {
		
		//definimos una variable booleana.
				boolean result = true;
				//definimos una variable de tipo caracter, se debe escribir con apostrofe
				char capitac = 'C';
				//definimos una variable tipo byte
				byte b = 100;
				//definimos una variable tipo short
				short s = 10000;
				//definimos una variable tipo int, representacion decimal.
				int intVal = 26;
				//definimos una variable tipo int, representacion hexadecimal.
				int exaVal = 0x1a;
				//definimos una variable tipo int, representacion binaria.
				int binVal = 0b11010;
				//definimos una variable tipo int, representacion octal.
				int octVal = 032;
				
				//es posible separe un numero con _
				// el _ no debe ir al principio o final 
				int binValSeparado = 0b1011_10_11;
				int intValSeparado = 123_456;
				/*
				System.out.println(intValSeparado);
				System.out.println(exaVal);
				System.out.println(binVal);
				System.out.println(Integer.toBinaryString(intVal));
				System.out.println(Integer.toHexString(intVal));
				*/
				System.out.println("Valores de Long:");
				System.out.println("Max Long: " + Long.MAX_VALUE);
				System.out.println("Min Long. " + Long.MIN_VALUE);
				System.out.println("Bytes: " + Long.BYTES);
				System.out.println("Size: " + Long.SIZE);
				
				System.out.println("Valores de Short:");
				System.out.println("Max Long: " + Short.MAX_VALUE);
				System.out.println("Min Long. " + Short.MIN_VALUE);
				System.out.println("Bytes: " + Short.BYTES);
				System.out.println("Size: " + Short.SIZE);
				
				//definimos una variable de tipo long
				long lonValLit = 9223372036854775807L;
				
				//definimos una variable de tipo float
				float floatVal = 3.4028234663852886E38f;
				
				//definimos una variable de tipo double
				double doubleVal = 1.7976931348623157E308;
				
				//Local-Variable Type Interface
				var variableDouble = 1.7976931348623157E308;
				var variableString = "Hola Mundo";
				var variableDouble2 = true;
				
				
				
				//Concatenar string
				System.out.println(variableString + " " + "Un gusto saludarte");
				System.out.println("Mi numero " +(6+7));
				
				//se puede usar literales en char y String
				System.out.println("Este texto \n tiene 2 lineas");
				System.out.println("Este texto \'tiene apostrofes");
				
				//Convertir tipos de datos
				byte bVarTrunca = (byte) 140;
				System.out.println(bVarTrunca);
				
				// convertir tipo string a tipo int
				int edad = Integer.parseInt("20");
				System.out.println(edad);
				//convertir tipo string a tipo double
				var valorPI = Double.parseDouble("3.141592");
				String edadTextString = String.valueOf(21);
				char caracter = "hola".charAt(1);
				
				
	}

}
