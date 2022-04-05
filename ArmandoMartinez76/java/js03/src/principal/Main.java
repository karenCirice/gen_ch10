package principal;

public class Main {
	
	/**
	 * Sesion Java 03, variables y asignacion de datos
	 * Datos primitivos en java
	 * @param args
	 */
	
	public static void main(String[] args) {
		//System.out.println("Hola de nuevo");
		// Definimos una variable booleana
				String saludo = "Hola humano";
				boolean result = true;
				//Definimos una variable de tipo caracter, se DEBE escribir con apóstrofe
				var capitalC = 'C';
			    // Definimos una variable de tipo byte
				byte b = 100;
				//Definimos una variable de tipo short
				short s = 10000;
				//DEfinimos una varibale de tipo int, representación decimal
				var intVal = 26;
				//Definimos una varible de tipo int, representación hexadecimal
				var hexVal = 0x1a;
				//Definimos una variable de tipo int, representación binaria
				var binVal = 0b11010;
				//Definimos una variable de tipo int, representación octal
				var octVal = 032;
				
				//Es posible separar un numero con _
				int binValSeparado = 0b1011_10_11;
				int ValSeparado = 123_456;
				/*
				 
				
				System.out.println(Integer.toBinaryString(intVal));
				System.out.println(Integer.toHexString(intVal));

				System.out.println(binValSeparado);
				System.out.println(ValSeparado);
				*/
		
				//Verificamos el maximo valor de un tipo long
				/*
				var Unicode = '\u0046';
				System.out.println(Unicode);
				
				System.out.println("Max long " + Long.BYTES);
				System.out.println("Max long " + Long.MAX_VALUE);
				System.out.println("Max long " + Long.MIN_VALUE);
				System.out.println("Max long " + Long.SIZE);
				

				System.out.println("BYTES short " + Short.BYTES);
				System.out.println("Max short " + Short.MAX_VALUE);
				System.out.println("Min long " + Short.MIN_VALUE);
				System.out.println("sIZE long " + Short.SIZE);
				
				//Definimos una variable tipo long
				long  valLong = 9223372036854775807L;
				
				//Definimos una variable de tipo float
				float floatVar = 3.4028234663852886E38f;
				float floatVar2 = 0f/0f;
				System.out.println(floatVar);
				System.out.println(floatVar2);
				
				//Definimos un double
				double doubleVar = 3.4028234663852886E38f;
				System.out.println(doubleVar);
				System.out.println(hexVal);
				System.out.println(saludo + "Gusto en saludarte");
		// TODO Auto-generated method stub
				
				System.out.println(saludo + " " + doubleVar + " " + floatVar2);
				System.out.print(7 + 8 + " " + "Mi numero \n ");
				System.out.print("Mi numero" + " " + 9 + 8);
				
				System.out.print("Este texto \n tiene dos lineas \n");
				
				byte bNumero = (byte) 2660;
				System.out.print(bNumero);
				
				*/
				
				//Convertir un strin a int
				int edad = Integer.parseInt("20");
				
				var valorPI = Double.parseDouble("3.141692");
						
				//System.out.print(edad);
				
				//System.out.print(valorPI);
				
				String edadTexto = String.valueOf(21);
				
				char caracter = "hola".charAt(2);
				
				System.out.println(caracter);

				System.out.println(edadTexto);
				
	}

}
