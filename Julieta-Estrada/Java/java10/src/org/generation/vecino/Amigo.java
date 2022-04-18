package org.generation.vecino;

//con extends estoy diciendo que amigo es una sub-clase de persona
//de todos modo tienes que importarlo 
import org.generation.casa.*;
public class Amigo extends Persona {

	private String chismeContar1;
	private String chismeContar2;
	//private String chismeContar3;
	
	public Amigo() {
		/**
		 * Usando super, podemos acceder a los métodos y
		 * atributos de la clase superior (Superclase o clase padre)
		 */
		this.chismeContar1 = super.getChsmPublic();
		this.chismeContar2 = super.getChsmProtected();
	}
	/**
	 * Metodo para retornan todos los chismes
	 * a los que tiene acceso la subclase AMiGO
	 * @return cade de chisme completo.
	 */
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" +
				this.chismeContar2 + "\n";
	}
}

