package mx.org.generation;

public class Botana {
	//Esta será la clase para la botanita de la fiesta de Gaby =p
	//Definimos los atributos
	String nombre;
	int gramage;
	boolean enfriado;
	int idBotana;
	
	/**
	 * Static: Es una variable que pertenece a la clase y no al objeto
	 * 
	 */
	static int contadorBotana;
	
	/**
	 * Botana para una fiesta casual
	 * @param nombre de la botana
	 * @param gramage el peso de la botana en gramos
	 * @param enfriado requiere refrigeración?
	 */
	
	Botana(String nombre, int gramage, boolean enfriado){
		this.nombre = nombre;
		this.gramage = gramage;
		this.enfriado = enfriado;
		this.idBotana = ++Botana.contadorBotana;
	}
	
	//Este constructor, tenía el parametro id botana, el cual
	//se introducía manualmente
//	Botana(String nombre, int gramage, boolean enfriado, int idBotana){
//		this.nombre = nombre;
//		this.gramage = gramage;
//		this.enfriado = enfriado;
//		//idBotana = contadorBotana++;
//		this.idBotana = idBotana;
//	}
	
	
	String datosBotana() {
		return ("Botana: " + this.idBotana + " " + this.nombre + " " + this.gramage +
				"requiere refrigeración? " + this.enfriado);
	}
}
