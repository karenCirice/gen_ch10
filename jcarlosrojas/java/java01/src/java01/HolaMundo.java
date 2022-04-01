package java01;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo desde el IDE");
		
		short s = 10000;
		
		int intVal = 26;
		
		int hexVal = 0x1a;
		
		int binVal = 0b11010;
		
		int octVal = 032;
		
		int bintValSeparado = 0b1011_10_11;
		int intValSeparado = 123_345;
		
		//System.out.println(intValSeparado);
		//System.out.println(hexVal);
		//System.out.println(binVal);
		
		//convertir tipos de datos
		byte bVarTruncada = (byte) 128;
		System.out.println(bVarTruncada);
		
		//Convertir un tipo string a tipo int
		int edad = Integer.parseInt("20");
		var valorPI = Double.parseDouble("3.141592");
		
		String edadTexto = String.valueOf(21);
		char caracter = "hola".charAt(1);
		 
		
		

	}

}
