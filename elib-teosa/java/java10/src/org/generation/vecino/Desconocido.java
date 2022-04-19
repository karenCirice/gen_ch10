package org.generation.vecino;


/**
 * Para acceder a la clase Persona desde otro paquete
 * se debe importar.
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
	 * Método para retornar todos los chismes al que tiene
	 * acceso mi clase Desconido
	 * @return cade de chisme completo.
	 */
	public String getChismeCompleto() {
		return this.chismeContar1;
	}

}