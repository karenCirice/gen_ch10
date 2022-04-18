package java10;

public class Familia {
	private String chismeContar1;
	private String chismeContar2;
	private String chismeContar3;
	
	public Familia (Persona persona) {
		this.chismeContar1 = persona.getChsmPublic();
		this.chismeContar2 = persona.getChsmProtected();
		this.chismeContar3 = persona.getChsmDefault();
	}
	
	public String getChismeCompleto() {
		return this.chismeContar1 + "\n" +
				this.chismeContar2 + "\n" +
				this.chismeContar3 + "\n";
		
	}
}
