package mx.org.generation;

	public class Oop_prueba {
		int atributoX; //Esto es una variable, pero se llama atributo
		int atributoY; //Esto es una variable, pero se llama atributo
		
		public static void main(String[] args) {
			/**
			 * Definimos 2 variables locales
			 * cada atributo es una variable, pero una variable}
			 * solo se considera atributo si es miembro de una clase
			 * "var" no se puede utilizar en atributos-
			 */
			
			int numA; //Esto se considera una variable.
			int numB; //Esto se considera una variable.
			
			Aritmetica operaciones = new Aritmetica();
			//Se le llama argumentos a los datos
			//que le pasamos a nuestro m�todo
			int resultado = operaciones.sumarConArgumentos(4, 6);
			
			
			System.out.println(resultado);
			System.out.println(operaciones.sumarConReturn());
			
			Aritmetica calculadora = new Aritmetica();
			
			otroMetodo();
			
		}
		
		/**
		 * Para que pueda ser usado este metodo en static main
		 * este m�todo tambi�n debe ser de tipo static
		 */
		static void otroMetodo() {
			System.out.println("Se ejecuta otro m�todo");
		}
} 
