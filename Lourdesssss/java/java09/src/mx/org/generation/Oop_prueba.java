package mx.org.generation;

public class Oop_prueba {
	
	//int atributoX; //Esto es una variable pero se considera atributo

	public static void main(String[] args) {
		/**
		 * @param numA es una variable por estar dentro de un método
		 * Definimos 2 variables locales 
		 * cada atributo es una varible, pero una variable 
		 * sólo se considera atributo si es miembro de una clase
		 * "var" no se puede utiliza en atributos.
		 */
		int numA;//esto se considera una varibale porque está dentro del public static
		int numB;
		
		Aritmetica operaciones = new Aritmetica();
		//se le llaman parametros de entrada a los datos que le pasamos al método
		int resultado = operaciones.sumarConArgumentos(4,6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());

		Aritmetica calculadora = new Aritmetica(); 
		
		otroMetodo();
	}
	
	/**
	 * Para que pueda ser usado este método en static main 
	 * este método tambien debe ser de tipo static
	 */
	static void otroMetodo() {
		System.out.println("Se ejecuta otro método");
	}
	
}
