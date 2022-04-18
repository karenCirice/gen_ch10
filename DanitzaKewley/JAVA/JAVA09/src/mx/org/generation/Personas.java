package mx.org.generation;

public class Personas {
	//Definimos los atributos
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	/**
	 * Definimos nuestro constructoor vacio
	 * 
	 * Antidoto con alcoho adulterado Methanol, usar Ethanol.
	 */
	Personas(){
		System.out.println("Se realiza el constructor vacio");
		//podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	
	//Constructores sobrecargados, pueden recibir un número
	//diferente de parámentros.
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
		return (this.nombre + " " + this.apellido + " tiene " +
	this.edad + " años y trae $ " + this.efectivo); 
	}
}
