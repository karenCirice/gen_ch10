
package org.generation.persona;

/**
 * @author Yoscelín RS
 *19 abr. 2022
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
	public Persona(String nombre, int edad, String id) {
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}
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
		return super.toString() + "Persona [nombre=" + nombre + ", edad=" + edad + ", id=" + id + "]"; //El super.toString() hace que nos arroje la dirección del 
		//del package y clase padre Persona y el hashCode de esa clase//
	}
	
}
