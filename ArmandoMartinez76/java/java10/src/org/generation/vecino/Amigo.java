package org.generation.vecino;

import org.generation.casa.Persona;
/**
 * La cklase amigo es subclase de Persona, al usar extends.
 * @author MARTI
 *18 abr. 2022
 */
public class Amigo extends Persona {
		
	private String chismeContar1;
	private String chismeContar2;
	//private String chismeContar3;
	
	public Amigo() {
		/**
		 * Usando super podremos acceder a los metodos
		 * y atributpos de la clase suiperior(Superclase o Clase padre
		 */
		this.chismeContar1 = super.getChsmPublic();
		this.chismeContar2 = super.getChsmProtected();
	}
	
	public String getChismeContar1() {
		return this.chismeContar1 + "\n" + this.chismeContar2;
	}
}
