package mx.org.generation;

public class Oop_prueba {
	int atributoX;  //Esto es una variable, pero se llama atributo
	int atributoY; //Esto es una variable, pero se llama atributo
	
	public static void main(String [] args) {
		
		/**
		 * Definimos 2 variables locales
		 * Cada atributo es una variable, pero una variable
		 * Solo se considera atributo si es miebro de una clase
		 * "var" no se puede utilizar en atributos.
		 * 
		 */
		

		//Para que pueda ser usado este metodo en static main
		//este metodo tambien debe ser de tipo static
		static void otroMetodo () {
		System.out.println("Se ejecuta otro método");
		}
		
		int numA; //Esto se considera variable.
		int numB; //Esto se considera variable.
		
		Aritmetica operaciones =new Aritmetica();
		//Se le llama parametros de entrada a los datos 
		//que le pasamos a nuestro metodo.
		int resultado = operaciones.sumarConArgumentos (4,6);
		System.out.println(operaciones);
	    System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica ();
		
		otroMetodo();
		
		
		
		
		
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		

