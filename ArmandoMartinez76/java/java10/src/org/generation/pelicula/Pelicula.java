package org.generation.pelicula;

public class Pelicula {
	private String nombre;
	private String clasifica;
	private int region;
	/**
	 * Constructor de una clase pelicula
	 * @param nombre
	 * @param clasifica de la pelicula
	 * @param region de la pelicula
	 */
	public Pelicula(String nombre, String clasifica, int region) {
		super();
		this.nombre = nombre;
		this.clasifica = clasifica;
		this.region = region;
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
	 * @return the clasifica
	 */
	public String getClasifica() {
		return clasifica;
	}
	/**
	 * @param clasifica the clasifica to set
	 */
	public void setClasifica(String clasifica) {
		this.clasifica = clasifica;
	}
	/**
	 * @return the region
	 */
	public int getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(int region) {
		this.region = region;
	}
	
	
}
