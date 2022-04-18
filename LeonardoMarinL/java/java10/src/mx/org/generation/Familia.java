package mx.org.generation;

public class Familia {
	private String chismeContar1;
	private String chismeContar2;
	private String chismeContar3;
	/**
	 * Se elabora el constructor
	 * Se tiene acceso solo a los m�todos cuya encapsulaci�n lo permite
	 * @param persona
	 */
	public Familia() {
		Persona miPariente = new Persona();
		this.chismeContar1 = miPariente.getChsmPublic();
		this.chismeContar2 = miPariente.getChsmProtected();
		this.chismeContar3 = miPariente.getChsmDefault();
	}
	
	/**
	 * M�todo para retornar todos los chismes
	 * @return
	 */
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" + 
				this.chismeContar2 + "\n" + 
				this.chismeContar3 + "\n";
	}
	
}
