package org.generation.vecino;

/**
 * Para acceder a la clase Persona desde otro paquete
 * se debe importar
 */

import org.generation.casa.Persona;

public class Desconocido {
	private String chismeContar1;
	//private String chismeContar2;
	//private String chismeContar3;
	
	public Desconocido() {
		Persona persona = new Persona();
		this.chismeContar1 = persona.getChsmPublic();
		
	}
	
	/**
	 * Metodo para retornar yodos los chism,es al que tiene 
	 * acceso mi clase Desconocido
	 * @return cadena de chisme compelto
	 */
	
	public String getChismeCompelto() {
		return this.chismeContar1;
				
	}
}
