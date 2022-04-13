package mx.org.generation;

public class Personas {

	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	/***
	 * Definimos nuestro constructor.
	 */
	
	Personas(){
		System.out.println("Se realiza el constructor");
		//Podemos inicializar nuestros atributos
		
		nombre = "";
		apellido = "";
		edad =0;
		
	}
	//Constructores sobrecargados, pueden recibir un numero
	//diferente de parametros.
	
	/***
	 * Constructores sobrecargados para recibir los datos de la persona 
	 * @param nombre nombre de la persona
	 * @param apellido de la persona 
	 * @param edad de la persona 
	 */
	
		Personas (String nombre, String apellido, String edad){
			this.nombre =nombre;
			this.apellido= apellido;
			this.edad = edad; 
		}
	
	
	String imprimeNombreCompleto(){
		return (this.nombre+ " "+ this.apellido+ "tiene"+ this.edad + "años y trae $"+ efectivo)
		
		
		
		
		
		
		
		
		
	}
}
