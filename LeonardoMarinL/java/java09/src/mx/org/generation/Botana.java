package mx.org.generation;

public class Botana {
	//Esta será la clase para la botanita de la fiesta 
	//Definimos los atributos de la clase
	String nombre;
	int gramage;
	boolean enfriado;
	int idBotana;
	/**
	 * Static:es una variable que pertenece a la clase y no al objeto
	 */
	static int contadorBotana;
	//Se genera el constructor (con el nombre de la clase)
	/**
	 * Botana para una fiesta casual
	 * @param el nombre de la botana
	 * @param gramage el peso en gramos
	 * @param enfriado requiere refrigeración?
	 */
	Botana (String nombre, int gramage, boolean enfriado){
		this.nombre = nombre;
		this.gramage = gramage;
		this.enfriado = enfriado;
		this.idBotana = ++Botana.contadorBotana; //lo adecuado es usar la clase dado que es una variable propia de la clase (por eso el static)
		//this.idBotana = ++this.contadorBotana; 
	}
	
	 //ESte contructor, tenía el parámetro idBotana, el cual
    // se introducía manualmente.
//    Botana(String nombre, int gramage, boolean enfriado, int idBotana){
//        this.nombre = nombre;
//        this.gramage = gramage;
//        this.enfriado = enfriado;        
//        //idBotana = contadorBotana++;        
//        this.idBotana = idBotana;
//    }
	
	String datosBotana() {
		return ("Botana: "+this.idBotana+" "+this.nombre+" "+ 
				this.gramage+" ¿requiere refrigeración?: "+
				this.enfriado);
	}

}
