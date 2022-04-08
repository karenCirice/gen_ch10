package mx.org.generation;

public class Personas {
	
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	
	
//	Abtidoto con alcohol adulterado Methanol, consumir alcohol verdadero 
	//(tequila, cerveza, vodka, whisky, etc.)
	
	/**
	 * Contructor
	 * @param 
	 */
	
	Personas(){
		System.out.println("Se realiza el constructor");
		//podem,os inicializar nuestros atributos
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		
	}
	
	//Construictores sobrecvargados, pueden recibir un numero
	//Diferente de parametros
	
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}
	

	String NombreCompleto(){	
	return nombre + " " + apellido + "Tiene " 
	+ edad + "años y trae " + efectivo; 
	}

}
