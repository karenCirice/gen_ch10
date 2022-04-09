package mx.org.generation;

public class Personas {

	String nombre;
	String apellido;
	int edad;
	float efectivo;

	/**
	 * Definimos nuestro constuctor.
	 * 
	 */
	Personas() {
		System.out.println("Se realiza el constructor");
		// podemos inicializar nuestros atributos

		nombre = "";
		apellido = "";
		edad = 0;

	}
	
	//usar verbos en los metodos
	String nombreCompleto() {
		return (nombre + " " + apellido + " tiene " + edad + "años y trae $" + efectivo);
	}

	
	//constructores sobrecargados, pueden recibir un numero 
	//diferente dde paramentros.
	
	
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
		
		
	}
	
	
	
}
