package java09;

public class personas {
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
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
		nombre = "";
		apellido = "";
		edad = 0;
	}

	String imprimeNombreCompleto(){
		return (nombre + " " + apellido + " " + "tiene" +
				edad + " s�os y trae $" + efectivo);
	}
	

}
