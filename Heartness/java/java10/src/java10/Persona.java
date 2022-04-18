package java10;

public class Persona {
	
	// (+) Public es Accesible a todas las clases
	// (#) Protectes es Accesible solo dentro de las clases y sub clases
	// (~) Default es Accesible dentro de las clases y clases dentro de otras
	// (-) Private es Accesible solo dentro se su paquete
	
	private String chsmPublic;
	private String chsmProtected;
	private String chsmDefault;
	private String chsmPrivate;
	
	public Persona() {
		this.chsmPublic = "Eddie es God";
		this.chsmProtected = "A Eddie le gusta el Anime";
		this.chsmDefault = "Eddie comparte fecha de cumpleaños con Ernesto";
		this.chsmPrivate = "Eddie considera a Ernesto su Amigo";
	}
	
	public String getChsmPublic() {
		return this.chsmPublic;
	}
	
	protected String getChsmProtected() {
		return this.chsmProtected;
	}
	
	public void setChsmPublic(String chsmPublic) {
		this.chsmPublic = chsmPublic;
	}
	
	protected void setChsmProtected(String chsmProtected) {
		this.chsmProtected = chsmProtected;
	}

	String getChsmDefault() {
		return chsmDefault;
	}

	void setChsmDefault(String chsmDefault) {
		this.chsmDefault = chsmDefault;
	}

	private String getChsmPrivate() {
		return chsmPrivate;
	}

	private void setChsmPrivate(String chsmPrivate) {
		this.chsmPrivate = chsmPrivate;
	}
	
	

}
