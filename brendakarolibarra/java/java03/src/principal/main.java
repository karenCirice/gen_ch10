package principal;

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
				
				//Es posible separar un número con
				int binValSeparado = 0b1011_10_11;
				int intValSeparado = 123_345;
				
		        System.out.println(intValSeparado);
		        System.out.println(hexVal);
		        System.out.println(binVal);
		        System.out.println(Integer.toBinaryString(intVal));
		        System.out.println(Integer.toHexString(intVal));
		        
		        //Verificamos el máximo valor de un tipo long
		      /
		        System.out.println("Max Long"+ Long.MAX_VALUE);
		        System.out.println("Max Long"+ Long.BYTES);
		        System.out.println("Max Long"+ Long.MIN_VALUE);
		        System.out.println("Max Long"+ Long.SIZE);
		        
		        
		      //Verificamos el máximo valor de un tipo short
		        System.out.println("Max Short"+ Short.MAX_VALUE);
		        System.out.println("Max Short"+ Short.BYTES);
		        System.out.println("Max Short"+ Short.MIN_VALUE);
		        System.out.println("Max Short"+ Short.SIZE);
		        
		        
		        //Definimos una variable de tipo Long
		        
		        long valLong = 9223372036854775807L;
		        
		        //Definimos una variable de tipo float
		        float floatVar = 3.4028234663852886E38f;
		        
		        //Definimos una variable de tipo double; puede agregarse la letra D
		        double doubleVar = 1.7976931348623157E308;
		        
		        //Podemos usar var para declarar una variable local, JDK 10 en adelante
		        //Local-Variable Type Interference
		        var variableDouble = 3.40;
		        var varibaleString = "Hola humano";
		        var variableBoolean = true;
		        var variableChar = 'm';
		        var variableUnicode= '\u006D';
		        char variableUnicodeN = 109;
		        //System.out.println (variableChar + " " + variableUnicode + " " + variableUnicodeN)
		        
		        //Concatenar String//
		        System.out.println(variableString + "" + "gusto en saludarte");
		        System.out.println (variableString + "" + variableBoolean;
		        System.out.println ("Mi numero" + 7 +8);
		        System.out.println(7+8+ "Mi numero");
		        
		        //sE PUEDEN USAR LITERALES E CHAR Y sTRING
		        System.out.println ("Este texto \ n tiene 2 lineas");
		        System.out.println ("Este texto \ 'tiene apostrofes\' ");
		        
		        //Convertir tipos de datos 
		        byte bVarTruncada = (byte) 129;
		        System.out.println(bVarTruncada);
		        
		        int edad = Integer.parseInt("20");
		        var valorPI = Double.parseDouble("3.141592");
		        
		        
		        
		       //Convertir tipos de datos  
		       byte bVarTruncada = (byte) 2660;
		       System.out.println(bVariableTruncada);
		       
		       
		       //Convertir tipo string a tipo int 
		       int edad= Integer.parseInt("20");
		       var valorPI =Double.parseDouble("3.141592");
		       
		       
		       String edadTexto = String.valueOf(21);
		       char caracter = "hola".charAt (2);
		       System.out.println(caracter);
		       
		       
		       
		        
		        
		        
		        
		        

		
		
		
		
		
		
		
		
		
		
		

	}

}
