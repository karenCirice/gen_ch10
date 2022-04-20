package org.generation.persona;

public class Persona {

	private String nombre;
	private int edad;
	private String id;
	
	public Persona(String nombre, int edad, String id) {
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", id=" + id + "]";
	}
}
