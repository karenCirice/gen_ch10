package org.generation.casa;

public class Familia {
	private String chismeContar1;
	private String chismeContar2;
	private String chismeContar3;
	
	/* Esto es otra manera de hacerlo
	 * public Familia (Persona persona) { this.chismeContar1 =
	 * persona.getChsmPublic(); this.chismeContar2 = persona.getChsmProtected();
	 * this.chismeContar3 = persona.getChsmDefault(); }
	 */ 
	
	public Familia () {
		Persona miPariente = new Persona();
		this.chismeContar1 = miPariente.getChsmPublic();
		this.chismeContar2 = miPariente.getChsmProtected();
		this.chismeContar3 = miPariente.getChsmDefault();
	}
		
	/* 
	 * Metodo para retornar todos los chismes al
	 * que tiene acceso mi clase familia
	 * @return cada chisme completo 
	 */
	public String getChismeCompleto () {
		return	this.chismeContar3 + "\n";
	}
}
