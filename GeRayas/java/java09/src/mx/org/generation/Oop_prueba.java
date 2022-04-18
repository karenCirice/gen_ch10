package mx.org.generation;

public class Oop_prueba {

	public static void main(String[] args) {
		/**
		 * Definimos dos variables locales
		 * cada atributo es una variable, pero una variable
		 * solo se considera atributo si es miembro de una clase
		 * "Var" no se puede utilizar en atributos
		 */
		int numA;
		int numB;
		
		Aritmetica operaciones = new Aritmetica();
		//se le llama argumentos a los datos que le pasamos al metodo
		int resultado = operaciones.sumarConArgumentos(4, 6);
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica();
		
		otroMetodo();
}

	/**
	 * Para que se pueda usar este metodo en static main
	 * este metodo tambien tiene quer ser static
	 */
	static void otroMetodo() {
		System.out.println("Se ejecuta otro metodo");

	}

}