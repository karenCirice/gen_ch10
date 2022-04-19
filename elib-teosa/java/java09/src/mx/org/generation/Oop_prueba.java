package mx.org.generation;

public class Oop_prueba {
	// Esto es una variable y se le llama atributo porque pertenece a una clase
//	int atributoX; 
//	int atributoY; 

	public static void main(String[] args) {
		/**
		 * Definimos 2 variable locales 
		 * cada atributo es una variable, pero solo se considera atributo si
		 * es miembro de una clase
		 * "var" no se puede usar como tipo de atributo
		 * si la variable esta dentro de un metodo NO es atributo solo variable
		 */
		
		int numA;
		int numB;
		
		Aritmetica operaciones = new Aritmetica();
		// se le llaman argumentos a los datos que le pasamos 
		// a nuestro método/función cuando lo mandamos a llamar
		// cuando definimos la función los argumentos que debe 
		// recibir una función son llamados parametros y no argumentos
		int resultado = operaciones.sumarConArgumentos(4, 6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		Aritmetica calculadora = new Aritmetica();
		
//		Oop_prueba otro = new Oop_prueba();
//		otro.otroMetodo();
		
		otroMetodo();
	}
	
	/**
	 * Para que pueda ser usado este metodo en static main
	 * este metodo también debe ser  de tipo static
	 */
	static void otroMetodo() {
		System.out.println("Se ejecuta otro metodo");
	}
}
