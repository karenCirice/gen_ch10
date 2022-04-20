/**
 * 
 */
package mx.org.generation;

/**
 * @author DELL
 *
 * 8 abr. 2022
 */
public class Botana {
	//Esta sera la clase para la botanita de la fiesta Gaby=P
	//definimos los atributos de la clase
    String nombre;
    int gramage;
    boolean enfriado;
    int idBotana;
    
    // Static: es una variable que pertenece a una clase y no al objeto
    static int contadorBotana;
    
    /**
     * Botana para una fiesta casual
	 * @nombre de la botana
	 * @
	 * @
	 */
    // Este constructor tenia el parametro idBotana el cual
    // se introducia manualmente
   // Botana( String nombre, int gramage, boolean enfriado){
    	//this.nombre=nombre;
    	//this.gramage=gramage;
    	//this.enfriado=enfriado;
    	//contadorBotana ++;
    	//idBotana= contadorBotana;
   // }
    
    Botana( String nombre, int gramage, boolean enfriado){
    	this.nombre=nombre;
    	this.gramage=gramage;
    	this.enfriado=enfriado;
    	contadorBotana ++;
    	this.idBotana= this.contadorBotana;
   }
    
    String datosBotana() {
    	return ("Botana: "  + this.idBotana + this.nombre + " " + 
        this.gramage + "requiere refrigeración?" + 
        this.enfriado);
    	
    }
}
