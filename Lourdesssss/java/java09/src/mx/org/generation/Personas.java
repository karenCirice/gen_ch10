package mx.org.generation;

public class Personas {
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	/**
	 * Definimos nuestro constructor
	 * Los constructores no tienen retorno 
	 */
	
	Personas (){
		System.out.println("Se realiza el constructor");
		//podemos analizar nuestros atributos 
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	/**
	 * constructores supercargados pueden recibir un número
	 * diferente de parámetros 
	 * @return de personas ();
	 * @param nombre de la persona
	 * @param apellido de la persona
	 * @param edad de la persona
	 */

	Personas(String nombre, String apellido,  int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	String nombreCompleto(){
		return (nombre + " " + apellido + " tiene "  + edad + " años y trae $ " + efectivo);
	}
}
