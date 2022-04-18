package mx.org.generation;

public class Botana {
	//Esta sera la clase para la botanita de fiesta Gaby =P
	//Definimos los atributos de la clase
	String nombre;
	int gramage;
	boolean enfriado;
	int idBotana;
	
	/**
	 * Static: es una variable que pertenece a la clase y no al objeto
	 */
	
	static int contadorBotana;
	
	/**
	 * Botana para una fiesta casuel
	 * @param nombre de la botana
	 * @param gramage peso de la botana
	 * @param enfriado o no
	 */
	
	Botana(String nombre, int gramage, boolean enfriado){
        this.nombre = nombre;
        this.gramage = gramage;
        this.enfriado = enfriado;        
        //idBotana = contadorBotana++;        
        this.idBotana = ++Botana.contadorBotana;
    }
	//Este constructor, tenia el parametro idBotana, el cual se 
	//Introducia manuealmente
//	Botana(String nombre, int gramage, boolean enfriado, int idBotana){
//		this.nombre = nombre;
//		this.gramage = gramage;
//		this.enfriado = enfriado;
//		//contadorBotana++;
//		idBotana = contadorBotana;
//		
//	}
	
	
	String datosBotana() {
        return ("Botana: "+ this.idBotana+" " + this.nombre + " " +
                this.gramage + " requiere regrigeración ? " + 
                this.enfriado);
    }
}
