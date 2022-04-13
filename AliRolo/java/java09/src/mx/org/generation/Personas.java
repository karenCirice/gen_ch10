package mx.org.generation;

	public class Personas {
		String nombre;
		String apellido;
		int edad;
		float efectivo;
		
		/**
		 * Definimos nuestro constructor
		 */
		
		Personas(){
			System.out.println("Se realiza el constructor");
			//Podemos inicializar nuestros atributos
			nombre = "";
			apellido = "";
			edad = 0;
		}
		
		//Constructores sobrecargados, pueden recibir un número
		//diferente de paramétros
		/**
		 * Constructor sobrecargado para recibir datos de la persona
		 * @param nombre de la persona
		 * @param apellido de la persona
		 * @param edad de la persona
		 */
		Personas(String nombre, String apellido, int edad){
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
		}
		
		String nombreCompleto(){
			return nombre + " " + apellido + " tiene " + edad
					+ " años y trae $" + efectivo; 
		}
}
