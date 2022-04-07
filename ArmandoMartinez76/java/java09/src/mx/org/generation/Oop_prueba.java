package mx.org.generation;

public class Oop_prueba {
	//int atribuitoX; //Esto es una variable, pero se llama atributo
	//int atributoY; // Esto es una variable, pero se llama atributo
	
	//Esto es un metodoto/funcion
	public static void main(String[] args) {
	//Esto es un metodoto/funcion
		/**
		 * Definimos dos variables locales
		 * Cada atributo es una variable, pero una variable 
		 * solo se considera atributo y es miembro de una clase
		 * "var" no se puede utilizar en atributos
		 */

		int numA; //Esto se considera variable
		int numB; //Esto se considera variable
		
		Aritmetica operaciones = new Aritmetica();
		//Se le llama argumentos de entrada a los datos
		//Que le pasamos a nuestro metodo
		int resultado = operaciones.sumarConArgumentos(4, 6);
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica();
		
		otroMetodo();
	}
	/**
	 * Para qeu pueda ser usado este metodo en static main
	 * este metodo tambien debe ser tipo static
	 * 
	 */
	//void otroMetodo() 
	static void otroMetodo(){
		System.out.println("Se ejecuta otro metodo");
		
	}
}
