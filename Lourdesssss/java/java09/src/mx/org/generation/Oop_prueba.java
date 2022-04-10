package mx.org.generation;

public class Oop_prueba {
	
	//int atributoX; //Esto es una variable pero se considera atributo

	public static void main(String[] args) {
		/**
		 * @param numA es una variable por estar dentro de un m�todo
		 * Definimos 2 variables locales 
		 * cada atributo es una varible, pero una variable 
		 * s�lo se considera atributo si es miembro de una clase
		 * "var" no se puede utiliza en atributos.
		 */
		int numA;//esto se considera una varibale porque est� dentro del public static
		int numB;
		
		Aritmetica operaciones = new Aritmetica();
		//se le llaman parametros de entrada a los datos que le pasamos al m�todo
		int resultado = operaciones.sumarConArgumentos(4,6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());

		Aritmetica calculadora = new Aritmetica(); 
		
		otroMetodo();
	}
	
	/**
	 * Para que pueda ser usado este m�todo en static main 
	 * este m�todo tambien debe ser de tipo static
	 */
	static void otroMetodo() {
		System.out.println("Se ejecuta otro m�todo");
	}
	
}
