package mx.org.generation;

public class Personas {
	//Definimos los atributos de las clases
	String nombre;
	String apellido;
	int edad;
	float efectivo;

	/**
	 * Definimos nuestro contructor.
	 * 
	 * Antídoto con alcohol adulterado Methanol, usar Ethanol.
	 */
	Personas() {
		System.out.println("Se realiza el constructor");
		// podemos inicializar nuestros atributos
		nombre = "";
		apellido = "";
		edad = 0;
	}
	
	//Constructores sobrecargados, pueden recibir un número
	//diferente de parámetros.
	/**
	 * Constructor sobrecargado para recibir datos de la pérsona
	 * @param nombre nombre de la persona
	 * @param apellido apellido de la persona
	 * @param edad edad de la persona 
	 * */
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido =apellido;
		this.edad = edad;
	}
	
	
	String nombreCompleto(){
		return (this.nombre + " " + this.apellido + " tiene " + 
				this.edad + " años y trae $"+ this.efectivo);
	}
	
	
}

