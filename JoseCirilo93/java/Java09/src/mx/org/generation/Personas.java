package mx.org.generation;

public class Personas {
	//Definimos los atributos de la clase
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	/**
	 * Definimos nuestro constructor.
	 */
	Personas(){
	System.out.println("Se realiza el constructor");
	// podemos inicializar nuestros atributos
	this.nombre = "";
	this.apellido ="";
	this.edad = 0;
	}
	
	
	
	//Constructores sobrecargados, pueden recibir un numero 
	//diferente de parametros
	/**
	 * Constructores sobrecargados para recibir datos de la persona
	 * @param nombre nombre de la persona 
	 * @param apellido apellido de la persona
	 * @param edadedad de la persona
	 */
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	

	String nombreCompleto(){
		return (nombre + " " + apellido + " tiene " +
				edad + " años y trae $"+efectivo);
	}

	
}
