package org.generation.casa;

public class Familia {
	private String chismecontar1;
	private String chismecontar2;
	private String chismecontar3;
	
	/**
	public Familia (Persona persona) {
		this.chismecontar1 = persona.getChsmPublic();
		this.chismecontar2 = persona.getChsmProtected();
		this.chismecontar3 = persona.getChsmDefault();
	} ESTO ES LO MISMO QUE LO DE ABAJO
	*/
	
	public Familia () {
		Persona miPariente = new Persona();
		this.chismecontar1 = miPariente.getChsmPublic();
		this.chismecontar2 = miPariente.getChsmProtected();
		this.chismecontar3 = miPariente.getChsmDefault();
	}
	
	/**
	 * Metodo para retornar todos los chismes al que tiene
	 * acceso mi clase familia
	 * @return cadena de chisme completo
	 */
	public String getChismeCompleto() {
		return this.chismecontar1 + "\n" +
				this.chismecontar2 + "\n" +
				this.chismecontar3 + "\n";
	}
}
