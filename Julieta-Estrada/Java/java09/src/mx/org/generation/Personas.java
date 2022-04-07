package mx.org.generation;

public class Personas {
	String nombre;
	String apellido;
	int edad;
	float efectivo;

	/*
	 * Definimos nuestro constructor lleva el mismo nombre
	 * antidoto de alchol aldulterado, alchol del bueno 
	 * es un costructor con nada 
	 */
	Personas() {
			System.out.println("Se realiza el constructor vacio ");
			// podemos inicializar nuestros atributos
			this.nombre = "";
			this.apellido = "";
			this.edad = 0;
	}
	
	/**
	*Costructores (todos tienen que tener el mimo nombre de la clase) 
	*sobrecargados, se puede recibir un numero con diferentes parametros 
	*/
	Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}
	
	//this hace refrencia a tus atributos en las clases se usa en las funciones
	//y en los contructores 
	String nombreCompleto(){
		return (this.nombre + " " + this.apellido +" tiene "+
				this.edad + " años y trae $"+this.efectivo);
	}
	
}
