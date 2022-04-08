package mx.org.generation;

public class Personas {
		String nombre;
		String apellido;
		int edad;
		float efectivo;
		
		//los constructores no llevan retorno, y su nombre es el mismo de la clase
		Personas() {
			System.out.println("Se realiza el constructor vacio");
			//podemos inicializar nuestros productos
			this.nombre = "";
			this.apellido = "";
			this.edad = 0;
			
		}
		
		/**
		 * Constructor sobrecargado para recibir nombre de la persona
		 * @param nombre de la persona
		 * @param apellido de la persona
		 * @param edad de la persona
		 */
		//Constructores sobrecargados, pueden recibir un numero diferente de parametros
		Personas(String nombre, String apellido, int edad) {
			this.nombre = nombre; //se utiliza el mismo nombre 
			this.apellido = apellido; //usar this en los metodos y constructores, porque hace referencia al objeto
			this.edad = edad;
		}
		
		String NombreCompleto() {
		return (this.nombre + " " + this.apellido + " tiene " + this.edad + 
				" anios y trae $" + this.efectivo);
	}
}
