/**
 * 
 */
package org.generation.vecino;

/**
 * Para acceder a la clase Persona desde otro paquete se debe  importar
 */
import org.generation.casa.Persona;

/**
 * @author Yoscelín RS
 *18 abr. 2022
 */
public class Desconocido {
	private String chismeContar1;
	//private String chismeContar2;
	//private String chismeContar3;
	
	public Desconocido() {
		Persona persona = new Persona();
		this.chismeContar1 = persona.getChsmPublic(); /* como pudimos ver, al momento de teclear persona. solo aparece la opción de getChsmPublic()*/
		
	}
	
	/**
	 * Método para retornar todos los chismes al que tiene acceso mi clase Desconocido
	 * @return cada de chisme completo
	 */
	public String getChismeCompleto() {
		return this.chismeContar1;
				
	}
	
}
