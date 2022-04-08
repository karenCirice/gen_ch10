package mx.org.generation;

public class Personas {
	String nombre;
	String  apellido;
	int edad;
	float efectivo;
	
	 Personas() {
		System.out.println("Se realiza el constructor");
		//podemos inicializar nuestros atributos
		nombre = "";
		apellido = "";
		edad = 0;
	 }
	 
	 //Constructores sobrecargados, puden recibir un numero
	 //diferente de parametros
	 Personas(String nombre, String apellido, int edad){
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.edad = edad;
	 }
	 
	 String imprimeNombreCompleto(){
		 return (nombre + " "+ apellido+ " tiene " + edad +
				 " años y trae $"+efectivo);
	 }
	 
}
