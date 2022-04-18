package mx.org.generation;

public class Personas {
	//Definimos los atributos de la clase
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	/**
	 * Definimos nuestro constructor
	 * 
	 */
	Personas(){
		System.out.println("Se realiza el constructor vacío");
		//podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	//Constructores sobrecargados, pueden recibir un número
	//diferente de parámetros
	//Los constructores tienen el mismo nombre de la clase y no tienen retorno
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//Se recomienda usar verbos como nombre de los métodos
	String nombreCompleto(){
		return (this.nombre+" "+this.apellido+" tiene "+
				this.edad +" años y trae $ "+this.efectivo);
	}
	
}
