package org.generation.pelicula;

public class Pelicula {
	private String nombre;
	private String clasifica;
	private int region;
	
	/**
	 * Constructor de la clase pelicula
	 * @param nombre de la pelicula
	 * @param clasifica clasificacion de la pelicula 
	 * @param region de la pelicula
	 */
	public Pelicula(String nombre, String clasifica, int region) {		
		this.nombre = nombre;
		this.clasifica = clasifica;
		this.region = region;
	}
	public String getNombre() {
		return nombre;
	}
	public String getClasifica() {
		return clasifica;
	}
	public int getRegion() {
		return region;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setClasifica(String clasifica) {
		this.clasifica = clasifica;
	}
	public void setRegion(int region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", clasifica=" + clasifica + ", region=" + region + "]";
	}
	
}
