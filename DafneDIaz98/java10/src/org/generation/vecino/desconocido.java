package org.generation.vecino;

public class desconocido {
	rivate String chismeContar1;
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

}
