/**
 * 
 */
package mx.org.generation;

/**
 * @author DELL
 *
 * 7 abr. 2022
 */
public class Personas {
	
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	/**
	 * Definimos nuestro contructor.
	 * 
	 * Ant�doto con alcohol adulterado Methanol, usar Ethanol.
	 */
	Personas() {
		System.out.println("Se realiza el constructor");
		// podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	/**
	 * Constructor sobrecargado para recibir datos de la persona
	 * @param nombre nombre de la persona
	 * @param apellido apellido de la persona
	 * @param edad edad de la persona
	 */
	//CONSTRUCTORES SOBRECARGADOS, PUEDEN RECIBIR UN NUMERO
	//DIFERENTE DE PARAMETROS
	Personas(String nombre, String apellido, int edad){
		this.nombre= nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	String nombreCompleto() {
		return ( this.nombre + " " + this.apellido + "tiene" +
	    edad + "a�os y trae $"+efectivo);
	}
	
	

}
