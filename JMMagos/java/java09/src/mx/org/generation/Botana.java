package mx.org.generation;

public class Botana {
	String nombre;
	int gramage;
	boolean enfriado;
	int idBotana;
	
	/*
	 * variable que pertenece a la clase y no
	 * al objeto.
	 */
	static int contadorBotana;
	
	/**
	 * 
	 * @param nombre el nombre de la botana
	 * @param gramage cu�nto pesa en entero
	 * @param enfriado si est� frio o no
	 * @param idBotana su identificador 
	 * @param contadorBotana para saber cu�ntos hay
	 */
	public Botana(String nombre, int gramage, boolean enfriado){
		this.nombre=nombre;
		this.gramage=gramage;
		this.enfriado=enfriado;
		this.idBotana=++Botana.contadorBotana;
		
		
	}
	
	String datosBotana() {
		return ("Botana: " + this.nombre + " " + this.idBotana+" "+
				this.gramage + " requiere regrigeraci�n ? " + 
				this.enfriado);
	}

}
