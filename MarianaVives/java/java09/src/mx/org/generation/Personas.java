package mx.org.generation;

public class Personas {
	//Definimos atributos de la clase
	String nombre;
	String apellido;
	int edad;
	float efectivo;

	/**
	 * Definimos nuestro contructor.	 
	 * Antídoto con alcohol adulterado Methanol, usar Ethanol.
	 */
	Personas() {
		System.out.println("Se realiza el constructor vacio");
		// podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	//Constructores sobrecargados, pueden recibir un número
	//Diferente de parámetros.
	Personas (String nombre, String apellido,int edad){
		this.nombre= nombre;
		this.apellido= apellido;
		this.edad = edad;
	}
	
	
	String nombreCompleto() {
		return (nombre + " " + apellido + " tiene " + edad +
				" años y trae $ " + efectivo);
	}
	
}