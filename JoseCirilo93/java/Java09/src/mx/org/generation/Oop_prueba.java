package mx.org.generation;

public class Oop_prueba {
	//int atributoX; //Esto es una variable, pero se llama atributo
	//int atributoY; //Esto es una variable, pero se llama atributo	
	
	public static void main(String[] args) {
		/**
		 * Definimos 2 variables locales
		 * Cada atributo es una variable, pero una variable
		 * solo se considera atributo si es miembro de una clase
		 * "var" no se puede utilizar en atributos.
		 */
		int numA; //Esto se considera variable.
		int numB; //Esto se considera variable.
		
		Aritmetica operaciones = new Aritmetica();
		//Se le llama argumentos  los datos 
		// que le pasamos a nuestro método.
		int resultado = operaciones.sumarConArgumentos(4, 6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica();
		
		otroMetodo();
	}

	/**
	 * Para que pueda ser usado este método en static main
	 * este métedo tambien debe ser de tipo static
	 */
	static void otroMetodo() {
		System.out.println("Se ejecuta otro método");
	}
}
