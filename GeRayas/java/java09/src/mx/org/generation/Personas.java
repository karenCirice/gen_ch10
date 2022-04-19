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
		//podemos inicializar nuestros atributos
		nombre = "";
		apellido = "";
		edad=0;
	}
	
	//Constructores sobrecargados, pueden recibir un número diferente de parametros
	Personas(String nombre, String apellido, int edad){
		this.nombre =nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	String NombreCompleto(){
		return (nombre + " "+ apellido + " Tiene " + edad+
				" años y trae $"+ efectivo);
	}
}
