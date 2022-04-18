package mx.org.generation.vecino;

import mx.org.generation.Persona;

public class Desconocido {
	private String chismeContar1;
	
	public Desconocido() {
		Persona persona = new Persona();
		this.chismeContar1 = persona.getChsmPublic(); //solo se tiene acceso a este m�todo porque es el �nico permitido al ser public
	}
	
	/**
	 * M�todo para retornar todos los chismes al que tiene 
	 * acceso mi clase Desconodido
	 * @return
	 */
	public String getChismeCompleto() {
		return this.chismeContar1;
	}

}
