package principal;

/**
 * 
 * @author cynth
 *
 *12:13:52
 * 31 mar. 2022
 */


public class main {

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
				//Definimos una varible de tipo int, representación hexadecimal(CON UN 0x)
				int hexVal = 0x1a;
				//Definimos una variable de tipo int, representación binaria(CON UN 0b)
				int binVal = 0b11010;
				//Definimos una variable de tipo int, representación octal (CON UN 0)
				int octVal = 032;

				//es posible separar un numero con _ no puede ir al principio ni al final o antes y despus de un .
				int binValSeparado = 0b1011_10_11;
				int intValSeparado = 1_23_34_4; //se separa solo para ayuda visual, como si fuera coma,
				
				
				//para llamarlo rapido se usa syso ctrl + espacio
						//para correrlo es con ctrl f 11
				//System.out.println(intValSeparado);
				//System.out.println(capitalC);
				//System.out.println(b);
				
				//System.out.println(binValSeparado);
				
				//Si quiero que me lo imprima de manera integra si quiero hexa o birario:
				//System.out.println(Integer.toBinaryString(intVal));
				//System.out.println(Integer.toHexString(intVal));

				
				//A CNTINUACION MANDAMOS A LLAMAR UN LONG
				/*System.out.println("Max long "+ Long.MAX_VALUE);
				System.out.println("MIN long "+ Long.MIN_VALUE);
				System.out.println("Bytes long "+Long.BYTES);
				System.out.println("Size long "+Long.SIZE);*/
				
				//A CNTINUACION MANDAMOS A LLAMAR UN LONG
				/*stem.out.println("Max short "+ Short.MAX_VALUE);
				System.out.println("MIN short "+ Short.MIN_VALUE);
				System.out.println("Bytes short "+Short.BYTES);
				System.out.println("Size short "+Short.SIZE);*/
				
				
				//PARA DEFINIR UNA VARIABLE DE TIPO LONG PONER UNA L m AL FINAL DEL NUMERO:
				long valLong = 9223372036854775801L;
				
				//PARA DEFINIR UNA VARIABLE FLOAT SE LE PONE F AL FINAL, SI NO SE REPRESENTA COMO UN BOUBLE
				float floatVar = 1.1754943508222875E-38F;
				
				//PARA DEFINIR UN DOABLE NO SE NECESITA PONER UNA LETRA
				
				//var es solo local, no en modo global
				//PARA PONER UN CARACTER UNICODE SE LE PONE /
				var variableString = "Hola humano";
				var variableChar = 'm';
				var variableBoolean = true;
				var variableUnicode = '\u006D';
				char variableUnicodeN = 109;/*
				System.out.println( variableChar + "" + variableUnicode + "" +variableUnicodeN );*/
				
				//CONCATENAR STRING:
				/*stem.out.println(variableString + " " + "gusto saludarte");
				System.out.println("My numero " + (7 + 8));
				
				//Se pueden usar SALTOS DE LINEA Y APOSTROFES:
				System.out.println("Este texto \n tiene 2 lineas");
				System.out.println("Este texto \' tiene apostrofes \' ");*/
				
				
				
				//Convertir tipos de datos, no hay forma que te lo represente asi que lo da en forma negativa
				byte bVarTruncada = (byte)2660; //125 o 126
				System.out.println(bVarTruncada);
				
				//Convertir tipo string a tipo int
				int edad = Integer.parseInt("20");
				var valorPI = Double.parseDouble("3.141592");

				//convertir un numero a un string
				String edadTexto = String.valueOf(21);
				char caracter = "hola".charAt(0); /*si tengo un string y quiero jalar un dato 
				se usa igual que un arreglo*/
				
				System.out.println(caracter);
				
				
				
				
				
			}
	}


