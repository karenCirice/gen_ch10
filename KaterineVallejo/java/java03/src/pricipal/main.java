package pricipal;
/**
 * sesion java 03 Variables y asignacion 
 */
public class main {

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
				
				int binValSeparado = 0b1011_10_11;
				int intValSeparado = 1_23_34_5;
				
				
				/*
				System.out.println(intValSeparado);
				System.out.println(hexVal);
				System.out.println(intVal);
				System.out.println(Integer.toBinaryString(intVal));
				System.out.println(Integer.toHexString(intVal));
				*/
				
				//Verificamos el valor de long
				/*System.out.println("Max Long" + Long.MAX_VALUE);
				System.out.println("Min Long" + Long.MIN_VALUE);
				System.out.println("Bytes Long" + Long.BYTES);
				*/
				
				//VERIFICAMOS LOS DE SHORT
				/*System.out.println("Max short" + Short.MAX_VALUE);
				System.out.println("Min short" + Short.MIN_VALUE);
				System.out.println("Bytes short" + Short.BYTES);
				*/
				
				//Definimos una variable tipo long
				long valLong = 9223372036854775807L;
				
				//Definimos una variable tipo float
				float floatVar = 3.4028234663852886E38f;
				
				//Definimos una variable tipo double
				//ouble doubleVar = 1.7976931348623157E308;
				
				//Podemos usar var para declarar una variable local, JDK apartor 10
				//Local variable Type Inference
				/*var variableDouble = 3.4028234663852886E38;
				var variableString ="Hola";
				var variableBoolean= true;
				var variableChar ='m';
				var variableUnicode ='\u006D';
				char variableUnicodeN = 109;
				System.out.println(variableChar + " " + variableUnicode + " " + variableUnicodeN );
				*/
				//Concatenar string
				/*System.out.println(variableString + " " + "Gusto saludarte");
				System.out.println(variableString + " "+variableDouble + " " + variableBoolean);
				System.out.println("Mi numero" + 7 + 8); // si ponemos parentesis ya lo convierte en numero + (7+8)
				System.out.println(7 + 8 + "Mi numero");
				*/
				
				//se pueden usar literales en char y string
				/*System.out.println("Este texto \n tiene 2 lineas");
				System.out.println("Este texto \'tiene apóstrofes\'");
				*/
				
				//convertir tipos de datos 
				byte bVarTruncada =(byte) 140;
				//System.out.println(bVarTruncada);
				
				int edad = Integer.parseInt("20");
				var valorPI = Double.parseDouble("3.1416");
				
				String edadTexto = String.valueOf(21);
				char caracter = "hola".charAt(1);
				System.out.println(caracter);
				

	}
				

	}

