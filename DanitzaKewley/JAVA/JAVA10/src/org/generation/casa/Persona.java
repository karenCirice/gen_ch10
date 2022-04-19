package org.generation.casa;

public class Persona {
 /*
  *Definimos los atributos de la clase
  *Los modificadoes de acceso en orden de menos a más restrictivos:
  * (+) public: Accesible para todas las clases
  * (#) protected: Accessible solo dentro de las clases y subclases.
  * (~) default: Accesible dentro de la clase y clases dentro del mismo paquete.
  * (-) private: Accesible solo dentro de la clase. 
  */
	
	/**
	 * La encapsulacion sirve paar restringir el acceso directo
	 * a los datos (atributos)
	 */
	private String chsmPublic;
	private String chsmProtected;
	private String chsmDefault;
	private String chsmPrivate;
	
	public Persona() {
		this.chsmPublic = "Me gusta coleccionar aretes raros";
		this.chsmProtected = "No me gusta la nuez";
		this.chsmDefault = "Me gusta la pelicula de crepusculo";
		this.chsmPrivate = "No se me ocurre otro chisme =(";
	}
	
	/*
	 * Metodo get para retornar el chisme publico
	 * get: obtengo
	 * @return chisme
	 */
	public String getChsmPublic() {
		return this.chsmPublic;
	}
	
	/**
	 * Metodo set para establecer un nuevo chisme
	 * set: establesco.
	 * @param chsmPublic nuevo chisme para almacenar
	 */
	public void setChsmPublic(String chsmPublic) {
		this.chsmPublic = chsmPublic;
	}
	
	/**
	 * Método protegido, solo accedido solo por subclases y dentro
	 * de la clase
	 * @return chisme protegido.
	 */
	protected String getChsmProtected() {
		return this.chsmProtected;
	}
	
	/**
	 * Metodo protegido, acceido por subclases y dentro
	 * de la clase.
	 * @param chsmProtected
	 */
	protected void setChsmProtected(String chsmProtected) {
		this.chsmProtected = chsmProtected;
	}

	/**
	 * Metodo default, accesible por la clases y clases
	 * dentro del mismo paquete
	 * @return chisme default
	 */
	String getChsmDefault() {
		return chsmDefault;
	}
	
	/**
	 * metodo default, accesible por la clase y clases
	 * dentro del mismo paquete.
	 * para un metodo default no se escribe al metodo el modificador
	 * @param chsmDefault nuevo chisme
	 */
	void setChsmDefault(String chsmDefault) {
		this.chsmDefault = chsmDefault;
	}

	/**
	 * Metodo private, sol accesible denro de la clase.
	 * @return the chsmPrivate
	 */
	private String getChsmPrivate() {
		return chsmPrivate;
	}

	/**
	 * Metodo private, para establecer el chisme privado
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
