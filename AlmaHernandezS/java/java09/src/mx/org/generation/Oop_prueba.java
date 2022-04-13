package mx.org.generation;

public class Oop_prueba {

	public static void main(String[] args) {
		/**
		 * Definimos 2 variables locales
		 * Cada atributo es una variable, pero una variable solo se considera atributo si es miembro de una clase
		 * "var" no se puede utilizar en atributos
		 */
		int numA;
		int numB;
		
		Aritmetica operaciones = new Aritmetica();
		//Se le llama parametros de entrada a los datos que le pasamos a nuestro metodo
		int resultado = operaciones.sumarConArgumentos(4,6);
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica();
		
		otroMetodo();
		
	}
	/**
	 * Para que pueda ser usado este metodo en static main, debe de ser tipo static	
	 */
	static void otroMetodo() {
			System.out.println("Se ejecuta otro metodo");
		}

	}


