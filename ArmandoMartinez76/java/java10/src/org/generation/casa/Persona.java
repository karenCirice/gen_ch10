package org.generation.casa;

public class Persona {
	private String chsmPublic;
	private String chsmProtected;
	private String chsmDefault;
	private String chsmPrivate;
	
	public Persona() {
		this.chsmPublic = "Quiero un vodka";
		this.chsmProtected = "A Armando le gustra el cafe sin azucar";
		this.chsmDefault = "Armando rompio un sarten de la cocina";
		this.chsmPrivate = "A Armando si le gusta bailar salsa, pero lo hace mal";
	}
	
	
	/*
	 * Definimos los atributos de la clase
	 * Los modificadores de acceso en orden de menos a m�s restrictivos:
	 * (+) public : Accesible para todas las clases.
	 * (#) protected : Accesible solo dentro de la clases y subclases.
	 * (~) default: Accesible dentro de la clases y clases dentro del mismo paquete.
	 * (-) private : Accesible solo dentro de la clase.
	 */
	
	/**
	 * M�todo get para retornar el chisme p�blico.
	 * get: obtengo.
	 * @return chisme
	 */
	public String getChsmPublic() {
		return this.chsmPublic;
	}
	
	/**
	 * M�todo set para establecer un nuevo chisme
	 * set: establesco.
	 * @param chsmPublic nuevo chisme para almacenar
	 */
	public void setChsmPublic(String chsmPublic) {
		this.chsmPublic = chsmPublic;
	}
	
	/**
	 * M�todo protegido, solo accedido por subclases y dentro
	 * de la clase.
	 * @return chisme portegido.
	 */
	protected String getChsmProtected() {
		return this.chsmProtected;
	}
	
	/**
	 * M�todo protegido, accedido por sublcases y dentro
	 * de la clase.
	 * @param chsmProtected
	 */
	protected void setChsmProtected(String chsmProtected ) {
		this.chsmProtected = chsmProtected;
	}

	
	/**
	 * M�todo default, accesible por la clases y clases 
	 * dentro del mismo paquete
	 * @return chisme default
	 */
	String getChsmDefault() {
		return chsmDefault;
	}
	
	/**
	 * M�todo default, accesible por la clase y clases
	 * dentro del mismo paquete.
	 * Para un m�todo default no se escribe al m�todo el modificador
	 * @param chsmDefault nuevo chisme
	 */
	void setChsmDefault(String chsmDefault) {
		this.chsmDefault = chsmDefault;
	}

	/**
	 * M�todo private, solo accesible dentro de la clase.
	 * @return the chsmPrivate
	 */
	private String getChsmPrivate() {
		return chsmPrivate;
	}

	/**
	 * M�todo private, para establecer el chisme privado
	 * @param chsmPrivate the chsmPrivate to set
	 */
	private void getChsmPrivate(String chsmPrivate) {
		this.chsmPrivate = chsmPrivate;
	}
	
	/**
	 * M�todo para retornar todos los chismes al que tiene
	 * acceso mi propia clase
	 * @return cade de chisme completo.
	 */
	public String getChismeCompleto() {
		return this.chsmPublic + "\n" +
				this.chsmProtected + "\n" +
				this.chsmDefault + "\n" +
				this.chsmPrivate;
	}


}


