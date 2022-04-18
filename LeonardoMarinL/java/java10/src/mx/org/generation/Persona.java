package mx.org.generation;

public class Persona {
	/**
	 * Definimos los atributos de la clase
	 * Los modificadores de acceso en orden de menos a más restrictivos:
	 * (+) public: accesible para todas las clases
	 * (#) protected: accesible solo dentro de la clase y subclases
	 * (~) default: accesible dentro de la clase y clases dentro del mismo paquete
	 * (-) private: accesible solo dentro de la clase
	 */
	
	/**
	 * La encapsulación sirve para restringir el acceso directo a los datos
	 */
	private String chsmPublic;
	private String chsmProtected;
	private String chsmDefault;
	private String chsmPrivate;
	
	public Persona() {
		this.chsmPublic = "En su casa viven 3 perros labrador";
		this.chsmProtected = "Leonardo prefiere el café negro";
		this.chsmDefault = "El apellido original no era Marín, se lo cambió el tatarabuelo";
		this.chsmPrivate = "Mi cantante favorita es Adele";
	}
	
	/**
	 * Método get para retornar el chisme público.
	 * @return chisme
	 */
	public String getChsmPublic() {
		return this.chsmPublic;
	}
	
	/**
	 * Método set para establecer un nuevo chisme
	 * set: establecer
	 * @param chsmPublic nuevo chisme para almacenar
	 */
	public void setChsmPublic(String chsmPublic) {
		this.chsmPublic = chsmPublic;
	}
	
	/**
	 * Método protegido, solo accesible para subclases y dentro
	 * de la clase
	 * @return
	 */
	protected String getChsmProtected() {
		return this.chsmProtected;
	}
	
	/**
	 * Método protegido, accesible para subclases y dentro
	 * de la clase
	 * @param chsmProtected
	 */
	protected void setChsmProtected(String chsmProtected) {
		this.chsmProtected = chsmProtected;
	}
	
	/**
	 * Método default, accesible por la clase y clases del
	 * mismo paquete
	 * @return
	 */
	String getChsmDefault() {
		return chsmDefault;
	}
	
	/**
	 * Método default, accesible por la clases y clases
	 * dentro del mismo paquete
	 * Para un método default no se escribe el método modificador
	 * @param chsmDefault nuevo chisme
	 */
	void setChsmDefault(String chsmDefault) {
		this.chsmDefault = chsmDefault;
	}
	
	/**
	 * Método private, solo accesible dentro de la clase
	 * @return
	 */
	private String getChsmPrivate() {
		return chsmPrivate;
	}
	
	/**
	 * Método private para establecer el chisme privado
	 * @param chsmPrivate
	 */
	private void setChsmPrivate(String chsmPrivate) {
		this.chsmPrivate = chsmPrivate;
	}
	
	/**
	 * Método para retornar todos los chismes alq ue tiene
	 * acceso mi propia clase
	 * @return
	 */
	public String getChismeCompleto() {
		return this.chsmPublic + "\n" + 
				this.chsmProtected + "\n" + 
				this.chsmDefault + "\n" + 
				this.chsmPrivate;
	}

}
