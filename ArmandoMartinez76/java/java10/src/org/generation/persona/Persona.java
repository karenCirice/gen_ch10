package org.generation.persona;
/**
* @author Armando
*19 abr. 2022+
*/
public class Persona {
private String nombre;
private int edad;
private String id;
/**
* @param nombre
* @param edad
* @param id
*/

	/**
	* @return the nombre
	*/
	public String getNombre() {
	return nombre;
	}
	/**
	* @param nombre the nombre to set
	*/
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	/**
	* @return the edad
	*/
	public int getEdad() {
	return edad;
	}
	/**
	* @param edad the edad to set
	*/
	public void setEdad(int edad) {
	this.edad = edad;
	}
	/**
	* @return the id
	*/
	public String getId() {
	return id;
	}
	/**
	* @param id the id to set
	*/
	public void setId(String id) {
	this.id = id;
	}
	@Override
	public String toString() {
	return "Persona {nombre=" + nombre + ", edad=" + edad + ", id=" + id + "}";
	}

}
