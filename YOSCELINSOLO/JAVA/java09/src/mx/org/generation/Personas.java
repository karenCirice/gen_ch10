/**
 * 
 */
package mx.org.generation;

/**
 * @author Yoscel�n RS
 *7 abr. 2022
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
		System.out.println("Se realiza el constructor vacio");
		// podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	/**
	 * Constructores sobrecargados, pueden recibir un n�mero diferente de par�metros
	 * Constructor sobrecargado para recibir datos de la persona
	
	 * @param nombre nombre de la persona
	 * @param apellido apellido de la persona
	 * @param edad edad de la persona
	 */
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	 String nombreCompleto(){
		 return (nombre + " " + apellido + " tiene" + edad + " a�os y trae $" +efectivo);
	 
		
				 
	}


}
