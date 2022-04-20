package org.generation.casa;

public class Familia {
	private String chismeContar1;
	private String chismeContar2;
	private String chismeContar3;

	public Familia() {
		Persona miPariente = new Persona();
		this.chismeContar1 = miPariente.getChsmPublic();
		this.chismeContar1 = miPariente.getChsmProtected();
		this.chismeContar1 = miPariente.getChsmDefault();
		
	}
	
	/**
	 * M�todo para retornar todos los chismes al que tiene acceso mi clase familia
	 * @return cada de chisme completo
	 */
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" +
				this.chismeContar2 + "\n" +
				this.chismeContar3 + "\n";
	}
}

}
