package mx.org.generation;

public class Oop_prueba {
	int atributoX; //esto es una variable, pero se llama atributo
	int atributoY; //esto es una variable, pero se llama atributo

	public static void main(String[] args) {
		/**
		 * Definimos 2 variables locales
		 * Cada atributo es una variable, pero una variabl
		 * solo se considera atributo si es miembro de una clase
		 * "var" no se puede utilizar en atributos
		 */
		int numA; //esto se considera una variable
		int numB; //esto se considera una variable
		
		Aritmetica operaciones = new Aritmetica();
		//se le llama parámetros de entrada a los datos
		//que le pasamos a nuestro método
		int resultado = operaciones.sumarConArgumentos(4, 6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica();
		
		otroMetodo();

	}
	
	/**
	 * Para que pueda ser usado este metodo en static main
	 * este método también debe ser de tipo static
	 */
	static void otroMetodo() {
		System.out.println("Se ejecuta otro método");
	}
	
}
