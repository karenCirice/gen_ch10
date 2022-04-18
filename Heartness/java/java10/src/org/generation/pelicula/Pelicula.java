package org.generation.pelicula;

public class Pelicula {
	private String nombre;
	private String clasifica;
	private int region;
	/**
	 * Constructor de la clase pelicula
	 * @param nombre de la pel�cula
	 * @param clasifica clasificaci�n de la pel�cula
	 * @param region de la pel�cula
	 */
	public Pelicula(String nombre, String clasifica, int region) {
		super();
		this.nombre = nombre;
		this.clasifica = clasifica;
		this.region = region;
	}
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	String getClasifica() {
		return clasifica;
	}
	void setClasifica(String clasifica) {
		this.clasifica = clasifica;
	}
	int getRegion() {
		return region;
	}
	void setRegion(int region) {
		this.region = region;
	}
	
	
	
	
}
