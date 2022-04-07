package principal;

public class main {

	public static void main(String[] args) {
	

			
			//Definimos una variable booleana
			boolean result = true;
			//Definimos una variable de tipo caracter, se DEBE escribir con apostrofe
			char capitalC = 'C';
			//Definimos una variable tipo byte
			byte b = 100;
			//Definimos una variable de tipo short
			short s = 10000;
			//Definimos una variable de tipo int
			int i = 100000;
			//Definimos una variable de tipo int, base 10
			int j = 26;
			//Definimos una variable de tipo int, representacion hexagecimal
			int hexVal = 0x1a;
			//Definimos una variable de tipo int, representacion binaria
			int binVal = 032;
			//Definir variable tipo Long
			long valLong = 9223372036854775807L; //Se termina con la letra L	
			//Concatenar String
			var variableString = "Hola humano";
			System.out.println(variableString + " " + "gusto en saludarte");
			
			// Convertir tipo string a tipo int
			int edad = Integer.parseInt("20");
			
			var valorPI = Double.parseDouble("3.141592"); //Cuando es decimal
			System.out.println(valorPI);
			
			//Covertir int a String
			String edadTexto = String.valueOf(21);
			
			//Obtener un dato 
			char caracter = "hola".charAt(1);
			System.out.println(caracter);
			
			//Verificamos el maximo valor de un tipo long
			System.out.println("Max Long" + Long.MAX_VALUE);

			//es posible separar un numero con:
			int binValSeparado = 0b1011_10_11;
			int intValSeparado = 123_34;
			System.out.println(Integer.toBinaryString(10));
			
			System.out.println(result);
			System.out.println(capitalC);
			System.out.println(b);
				

		}

	
}

