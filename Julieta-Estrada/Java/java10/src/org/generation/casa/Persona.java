package org.generation.casa;

public class Persona {
	/*
	 * Definimos los atributos de la clase
	 * Los modificadores de acceso en orden de menos a más restrictivos:
	 * (+) public : Accesible para todas las clases.
	 * (#) protected : Accesible solo dentro de la clases y subclases.
	 * (~) default: Accesible dentro de la clases y clases dentro del mismo paquete.
	 * (-) private : Accesible solo dentro de la clase.
	 */

	/**
	 * La encapsulación sirve para restringir el acceso directo
	 * a los datos 
	 */
	
	private String chsmPublic;
	private String chsmProtected;
	private String chsmDefault;
	private String chsmPrivate;
	
	public Persona() {
		this.chsmPublic = "Trabajo en las mañanas";
		this.chsmProtected = "No me gusta el café";
		this.chsmDefault = "Me estrelle contra un parquimetro";
		this.chsmPrivate = "Me gusta el reggeton";
	}
	
	/**
	 * Método get para retornar el chisme público.
	 * get: obtengo.
	 * @return chisme
	 */
	public String getChsmPublic() {
		return this.chsmPublic;
	}
	
	/**
	 * Método set para establecer un nuevo chisme
	 * set: establesco.
	 * @param chsmPublic nuevo chisme para almacenar
	 */
	public void setChsmPublic(String chsmPublic) {
		this.chsmPublic = chsmPublic;
	}
	
	/**
	 * Método protegido, solo accedido por subclases y dentro
	 * de la clase.
	 * @return chisme portegido.
	 */
	protected String getChsmProtected() {
		return this.chsmProtected;
	}
	
	/**
	 * Método protegido, accedido por sublcases y dentro
	 * de la clase.
	 * @param chsmProtected
	 */
	protected void setChsmProtected(String chsmProtected ) {
		this.chsmProtected = chsmProtected;
	}
	
	/**
	 * Método default, accesible por la clases y clases 
	 * dentro del mismo paquete
	 * @return chisme default
	 */
	String getChsmDefault() {
		return chsmDefault;
	}
	
	/**
	 * Método default, accesible por la clase y clases
	 * dentro del mismo paquete.
	 * Para un método default no se escribe al método el modificador
	 * @param chsmDefault nuevo chisme
	 */
	void setChsmDefault(String chsmDefault) {
		this.chsmDefault = chsmDefault;
	}

	/**
	 * Método private, solo accesible dentro de la clase.
	 * @return the chsmPrivate
	 */
	private String getChsmPrivate() {
		return chsmPrivate;
	}

	/**
	 * Método private, para establecer el chisme privado
	 * @param chsmPrivate the chsmPrivate to set
	 */
	private void setChsmPrivate(String chsmPrivate) {
		this.chsmPrivate = chsmPrivate;
	}

	/**
	 * Método para retornar todos los chismes al que tiene
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
