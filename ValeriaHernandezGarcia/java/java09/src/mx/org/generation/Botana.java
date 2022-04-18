package mx.org.generation;

public class Botana {
	//Esta ser� la clase para la botanita de la fiesta Gaby =P
    //Definimos los atributos de la clase
    String nombre;
    int gramage;
    boolean enfriado;
    int idBotana;

    /*
     * Static: Es una variable que pertenece a la clase y no al objeto
     * 
     */
    static int contadorBotana;
    
    /**
     * Botana para una fiesta casual
     * @param nombre de la botana
     * @param gramage el peso de la botana en gramos
     * @param enfriado requiere refrigeraci�n?
     */
    Botana(String nombre, int gramage, boolean enfriado){
        this.nombre = nombre;
        this.gramage = gramage;
        this.enfriado = enfriado;        
        //idBotana = contadorBotana++;        
        this.idBotana = this.contadorBotana;
    }
    
    //Este contructor, ten�a el par�metro idBotana, el cual
    //se introduc�a manualmente.
//    Botana(String nombre, int gramage, boolean enfriado, int idBotana){
//        this.nombre = nombre;
//        this.gramage = gramage;
//        this.enfriado = enfriado;        
//        //idBotana = contadorBotana++;        
//        this.idBotana = idBotana;
//    }
    
    String datosBotana() {
        return ("Botana: "+ this.idBotana+" " + this.nombre + " " +
                this.gramage + " requiere regrigeraci�n ? " + 
                this.enfriado);
    }
}  
