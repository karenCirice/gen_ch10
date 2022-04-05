
package javaid;

/**
 *
 * @author giselsepulveda
 */
public class PrincipalMain {
    public static void main(String[] args){
       //Booleano
        boolean resulta = true;
        //Character
        char capitalC = 'C';
        //Byte
        byte b = 100;
        //Short
        short s = 10000;
        //int
        int i = 26;
        //hexadecimal
        int hexVal = 0x1a;
        //Binario
        int binVal = 0b11010;
        
        int octalVal = 0110;
        
        //long
        //para una variable tipo long usamos la L al final del numero
        long valLong =9223372036854775807L;
        
        var variableString= "HOLA HUMANO";
        
        //convertir tipos de datos 
        byte bVarTruncada= (byte) 2660;
        System.out.println(bVarTruncada);
        
        //convertir un string a un int
        int edad = Integer.parseInt("20");
         System.out.println(edad);
         
        //
        var valorPI = Double.parseDouble("3.141592");
        System.out.println(valorPI);
        
        //
        String edadTexto= String.valueOf(21);
        char caracter = "hola".charAt(2);
         System.out.println(caracter);

        System.out.println(i);
        System.out.println(hexVal);
        System.out.println(binVal);
        System.out.println(octalVal);
        System.out.println("Max Long " + Long.MAX_VALUE );
        System.out.println("Min Long " + Long.MIN_VALUE );
        System.out.println("Size Long " + Long.SIZE );
        System.out.println("Bytes Long " + Long.BYTES );
        System.out.println("Bytes Short " + Short.BYTES );
        System.out.println("Size Long " + Short.SIZE );
        System.out.println("Max Long " + Short.MAX_VALUE );
        System.out.println("Min Long " + Short.MIN_VALUE );
        System.out.println(variableString + " "+ "gusto en saludarte");
        System.out.println("Mi numero "+ 7 +8 );
        System.out.println( 7 + 8 + " Mi numero" );
        System.out.println("Mi numero "+ (7 + 8) );
        System.out.println("Este texto tiene \n dos líneas" );
        System.out.println("Este texto tiene \'tiene apostrofes\'" );
    }
               
}
