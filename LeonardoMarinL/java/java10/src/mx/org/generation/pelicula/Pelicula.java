package mx.org.generation.pelicula;

public class Pelicula {
	private String nombre;
	private String clasifica;
	private int region;
	
	/**
	 * Constructor de la clase película
	 * @param nombre de la pelicula
	 * @param clasifica
	 * @param region
	 */
	public Pelicula(String nombre, String clasifica, int region) {
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

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", clasifica=" + clasifica + ", region=" + region + "]";
	}
	
}
