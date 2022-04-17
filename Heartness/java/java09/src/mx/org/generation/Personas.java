package mx.org.generation;

public class Personas {
	String nombre;
	String apellido;
	int edad;
	float efectivo;
	
	Personas(){
		System.out.println("Se realiza el constructor vacio");
		nombre = "";
		apellido = "";
		edad = 0;
	}
	
	Personas(String nombre, String apellido, int edad, float efectivo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.efectivo = efectivo;
	}
	
	static void aumentarEfectivo(float dinero){
		System.out.println("Se tiene $"+ dinero);
		dinero += 1000f;
		System.out.println("Ahora tiene $" + dinero);
	}
	
	String nombreCompleto() {
		return (this.nombre + " " + this.apellido + " tiene " + this.edad + " años y trae $" + this.efectivo + " Varos" );
	}
}
