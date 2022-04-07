package mx.org.generation;

public class Personas {
	//Definimos los atributos de la clase
	String nombre;
	String apellido;
	int edad;
	float efectivo;

	/**
	 * Definimos nuestro contructor vacío
	 * Antídoto con alcohol adulterado Methanol, usar Ethanol.
	 */
	Personas() {
		System.out.println("Se realiza el constructor vacio");
		// podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}

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
	 		
	String nombreCompleto(){
		return (this.nombre + " " + this.apellido + " tiene " +
				this.edad + " años y trae $"+ this.efectivo);
	}

}
