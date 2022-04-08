package mx.org.generation;

public class Botana {
	//clase para botana de la fiesta
	//definimos los atributos de la clase
	String nombre;
	int gramage;
	boolean enfriado;
	int idBotana;
	
	/**
	 * Static es una variable que pertenece a la clase y no al objeto
	 */
	static int contadorBotana; //esto son atributos
	
	//constructor, el comment es para que al poner el cursor nos aparezcan los datos
	/**
	 * Botana para una fiesta casual
	 * @param nombre de la botana
	 * @param gramage el peso de la botana en gramos
	 * @param enfriado requiere refrigeracion?
	 */
	/*Este contructor era para poner idBotana de manera manual
	 * Botana(String nombre, int gramage, boolean enfriado, int idBotana) {
	 * this.nombre = nombre; this.gramage = gramage; this.enfriado = enfriado;
	 * //contadorBotana++; //idBotana = contadorBotana; this.idBotana = idBotana; }
	 */
	
	Botana(String nombre, int gramage, boolean enfriado) {
		this.nombre = nombre;
		this.gramage = gramage;
		this.enfriado = enfriado;
		this.idBotana = ++Botana.contadorBotana;
	}
	
	//definir funcion que de el nombre de la botana
	String datosBotana() {
		return ("Botana: " + this.idBotana + " " + this.nombre + " " + this.gramage + 
				" requiere refrigeracion? " + this.enfriado);
	}
	
	
	
	
	
}
