package mx.org.generation;

public class Botana {
	// Definimos los atributos de la clase
	String nombre;
	int gramage;
	boolean enfriado;
	int idBotana;

	/*
	 * Atributos de clase
	 * Static: Es una variable que se enlaza a la clase 
	 * y no al objeto
	 */
	static int contadorBotana;

	/**
	 * Botana para una fiesta casual
	 * 
	 * @param nombre   de la botana
	 * @param gramage  el peso de la botana en gramos
	 * @param enfriado requiere refrigeración?
	 */
	
	//Defines el constructor
	Botana(String nombre, int gramage, boolean enfriado) {
		this.nombre = nombre;
		this.gramage = gramage;
		this.enfriado = enfriado;
		this.idBotana = ++Botana.contadorBotana; // tener el numero de botanas 
	}

	// Este contructor, tenía el parámetro idBotana, el cual
	// se introducía manualmente.
//    Botana(String nombre, int gramage, boolean enfriado, int idBotana){
//        this.nombre = nombre;
//        this.gramage = gramage;
//        this.enfriado = enfriado;        
//        //idBotana = contadorBotana++;        
//        this.idBotana = idBotana;
//    }

	
	//Defines el metodo
	String datosBotana() {
		return ("Botana: " + this.idBotana + " " + this.nombre + " " + this.gramage + " requiere regrigeración ? "
				+ this.enfriado);
	}

}