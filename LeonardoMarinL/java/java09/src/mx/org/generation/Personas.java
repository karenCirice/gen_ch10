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
		System.out.println("Se realiza el constructor vac�o");
		//podemos inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	
	//Constructores sobrecargados, pueden recibir un n�mero
	//diferente de par�metros
	//Los constructores tienen el mismo nombre de la clase y no tienen retorno
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//Se recomienda usar verbos como nombre de los m�todos
	String nombreCompleto(){
		return (this.nombre+" "+this.apellido+" tiene "+
				this.edad +" a�os y trae $ "+this.efectivo);
	}
	
}
