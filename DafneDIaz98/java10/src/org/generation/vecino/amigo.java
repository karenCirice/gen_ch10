package org.generation.vecino;

public class amigo {
	private String chismeContar1;
	private String chismeContar2;
	//private String chismeContar3;
	
	public Amigo () {
		/**
		 * Usando super, podremos acceder a los m�todos y atributos de la clase superior (Superclase o clase padre).
		 */
		this.chismeContar1 =super.getChsmPublic();  /* CON SUPER VAMOS A PODER ACCEDER A M�TODOS Y ATRIBUTOS DE LA CLASE SUPERIOR (sUPERCLASE O CLASE PADRE)*/
		this.chismeContar2 = super.getChsmProtected();
	}
	
	/**
	 * M�todo para retornar todos los chismes al que tiene acceso mi SUBCLASE amigo
	 * @return cade de chisme completo.
	 */
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" + this.chismeContar2;
	}


}
