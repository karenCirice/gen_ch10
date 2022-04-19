package mx.org.generation;

public class Botana {

	// Esta ser� la clase para la botanita de la fiesta Gaby =P
	// Definimos los atributos instancia
	String nombre;
	int gramage;
	boolean enfriado;
	int idBotana;
    //	Static: es una variable que pertenece a la clase y no al objeto
	//  es decir, no puede ser controlado por ning�n objeto
	// va a ser el mismo para todas las instancias de la clase, no se genera
	// uno por cada objeto
	// definimos con static un atributo de Clase
	// una analog�a a una variable mega global especial
	
	/*
	las clases tienen atributos y m�todos de clase, y atributos y m�todos de 
	instancia. O sea, los de clase son atributos que todos los objetos de esa 
	clase comparten y son iguales (de clase o est�ticos), los de instancia 
	son caracter�sticos de cada objeto creado.
	*/
	
	static int contadorBotana;

	/**
	 * Botana para una fiesta casual
	 * 
	 * @param nombre   de la botana
	 * @param gramage  el peso de la botana en gramos
	 * @param enfriado requiere refrigeraci�n?
	 */
	Botana(String nombre, int gramage, boolean enfriado) {
		this.nombre = nombre;
		this.gramage = gramage;
		this.enfriado = enfriado; 
		//contadorBotana++;
		this.idBotana = ++Botana.contadorBotana;
	}
	
	
	/*
	 * El contructor tenia el parametro idBotana, el cual se introduc�a manualmente
	 * Botana(String nombre, int gramage, boolean enfriado, int idBotana){
	 * this.nombre = nombre; this.gramage = gramage; this.enfriado = enfriado; //
	 * contadorBotana++; this.idBotana = idBotana; }
	 */

	
	/**
	 * Muestra los datos del objeto instanciado de la clase Botana
	 * @return
	 */
	String datosBotana() {
		return ("Botana: " + this.idBotana + " " + this.nombre + " " + this.gramage + " requiere regrigeraci�n ? "
				+ this.enfriado);
	}

}
