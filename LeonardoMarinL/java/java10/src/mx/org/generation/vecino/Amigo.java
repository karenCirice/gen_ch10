package mx.org.generation.vecino;
import mx.org.generation.Persona;
/**
 * La clase Amigo es subclase de Persona, al usar estends
 * @author Leonardo
 *
 */
public class Amigo extends Persona{
	
	private String chismeContar1;
	private String chismeContar2;
	
	public Amigo () { //la palabra super nos permite acceder a los métodos de la superclase (Persona)
		this.chismeContar1 = super.getChsmPublic();
		this.chismeContar2 = super.getChsmProtected();
	}
	
	/**
	 * Método para retornar todos los chismes al que tiene 
	 * acceso mi SUBclase Amigo
	 * @return
	 */
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" + this.chismeContar2;
	}

}
