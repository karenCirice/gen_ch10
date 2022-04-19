package mx.org.generation;

public class Personas {
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	/**
	 * Definimos nuestro constructor vacío
	 */
	Personas(){
		System.out.println("Se realiza el constructor");
		
		// podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	// Constructores sobrecargados, pueden recibir un 
	// número diferente de parametros
	/**
	 * Contructor sobrecargado para recibir datos de la persona
	 * @param nombre nombre de la persona
	 * @param apellido apellido de la persona
	 * @param edad edad de la persona
	 */
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	String imprimeNombreCompleto(){
		return (this.nombre + " " + this.apellido 
				+ " tiene "+ this.edad + " años y trae $" + this.efectivo);
	}
}
