package mx.org.generation;

public class Botana {
	//Esta ser� la clase para la botanita de la fiesta 
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
	 * @param enfriado requiere refrigeraci�n?
	 */
	Botana (String nombre, int gramage, boolean enfriado){
		this.nombre = nombre;
		this.gramage = gramage;
		this.enfriado = enfriado;
		this.idBotana = ++Botana.contadorBotana; //lo adecuado es usar la clase dado que es una variable propia de la clase (por eso el static)
		//this.idBotana = ++this.contadorBotana; 
	}
	
	 //ESte contructor, ten�a el par�metro idBotana, el cual
    // se introduc�a manualmente.
//    Botana(String nombre, int gramage, boolean enfriado, int idBotana){
//        this.nombre = nombre;
//        this.gramage = gramage;
//        this.enfriado = enfriado;        
//        //idBotana = contadorBotana++;        
//        this.idBotana = idBotana;
//    }
	
	String datosBotana() {
		return ("Botana: "+this.idBotana+" "+this.nombre+" "+ 
				this.gramage+" �requiere refrigeraci�n?: "+
				this.enfriado);
	}

}
