/**
 * 
 */
package mx.org.generation;

/**
 * @author DELL
 *
 * 7 abr. 2022
 */
public class Oop_prueba {
// int atributoX; //Esto es una variable, pero se llama atributo
// int atrubutoY; //Esto es una variable, pero se llama atributo
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // DEFINIMOS 2 VARIABLES LOCALES
		//CADA ATRIBUTO ES UNA VARIABLE,PERO UNA VARIABLE
		// SOLO SE CONSIDERA ATRIBUTO SI ES MIEMBRO DE UNA CLASE
		// "VAR" NO SE PUEDE UTILIZAR EN ATRIBUTOS
		
		int numA; //Esto se considera variable
		int numB; //Esto se considera variable
		
	     Aritmetica operaciones=new Aritmetica();
	     //SE LE LLAMA PARAMETROS DE ENTRADA A LOS DATOS
	     //QUE LE PASAMOS A NUESTRO METODO
	     //int resultado = operaciones.sumarConArgumentos(4,6);
	     
	     //System.out.println(resultado);
	    // System.out.println(operaciones.sumarConReturn());
	     
	     Aritmetica calculadora = new Aritmetica();
	 otroMetodo();
	}
	// para que pueda ser usado este metodo en static main
	// este método tambien debe ser de tipo static
	static void otroMetodo() {
		System.out.println("se ejecuta otro metodo");
	     
	}
}
