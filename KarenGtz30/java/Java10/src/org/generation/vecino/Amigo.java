package org.generation.vecino;

import org.generation.casa.Persona;

/**
 * La clase Amigo es subclase de Persona, al usar extends.
 * @author 
 *
 */
public class Amigo extends Persona {

	private String chismeContar1;
	private String chismeContar2;
	//private String chismeContar3;
	
	public Amigo() {
		/**
		 * Usando super, podremos acceder a los métodos
		 * y atributos de la clase superior(Superclase o clase padre).
		 */
		this.chismeContar1 = super.getChsmPublic();
		this.chismeContar2 = super.getChsmProtected();
		
	}
	
	/**
	 * Método para retornar todos los chismes al que tiene
	 * acceso mi SUBCLASE Amigo
	 * @return cade de chisme completo.
	 */
	public String getChismeCompleto() {
		return this.chismeContar2;
	}
	
}