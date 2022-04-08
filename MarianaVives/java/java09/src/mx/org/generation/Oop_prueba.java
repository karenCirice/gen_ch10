package mx.org.generation;

public class Oop_prueba {
	// int atributoX; //Esto es una variable pero se llama atributo
	// int atributoY; //Esto es una variable pero se llama atributo

	public static void main(String[] args) { // esto es un metodo
		/**
		 * Definimos 2 variables locales Cada atributo es una variable, pero una
		 * variable solo se considera atributo si es miembro de una clase "var" no se
		 * puede utilizar en atrributos
		 */
		// Si esta dentro de un metodo, estos son variables (metodo=funcion)
		int numA; // Esto se considera una variable
		int numB; // Esto se considera una variable

		Aritmetica operaciones = new Aritmetica();
		// Se le llaman argumentos a los datos
		// Que le pasamos a nuestro método. En este caso (4,6)
		int resultado = operaciones.sumarConArgumentos(4, 6);
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());

		Aritmetica calculadora = new Aritmetica();

		otroMetodo();

	}
	// Para que pueda ser usado este método en static main
	// Este metodo tambien debe de ser tipo static

	static void otroMetodo() {
		System.out.println("Se ejecuta otro método");
	}
}
