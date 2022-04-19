/**
 * 
 */
package org.generation.casa;

/**
 * @author Yoscelín RS
 *18 abr. 2022
 */
public class Persona {



/*
 * Definimos los atributos de la clase
 * Los modificadores de acceso en orden de menos a más restrictivos
 * (+)public: Accesible para todas las clases.
 * (#) Protected: Accesible solo dentro de las clases y subclases
 * (~)default:Accesible dentro de las clases y clases dentro del mismo paquete
 * (-) private: Accesible solo dentro de la clase
 */
/*
 * La encapsulación sirve para restirngir el acceso directo a los datos
 */
private String chsmPublic;
private String chsmProtected;  /* aqui encapsulamos nuesttros datos poniendo private*/
private String chsmDefault;
private String chsmPrivate;

public Persona(){
this.chsmPublic = "A Yoz le gusta la Rosalía";
this.chsmProtected = "Le gustó su nuevo album después de ver a Altozano";
this.chsmDefault = "Hoy comí 5 paletas de hielo";
this.chsmPrivate = "Me gusta la canción de Sakura";
}

/**
 * Método get para retornar el chisme público
 * @return chismw
 */
public String getChsmPublic() { /* get accede, obtengo*/
	return this.chsmPublic;
}

/**
 * Método para establecer nuevo chisme
 * set: establesco.
 *
 * @param chsmPublic nuevo chisme para almacenar
 */

public void setChsmPublic(String chsmPublic) {
	this.chsmPublic = chsmPublic;
}

/**
 * Método protegido, solo accedido por subclases y dentro de la clase
 * @return 
 */
protected String getChsmProtected() {
	return this.chsmProtected;
}

/**
 * Método protegido, solo accedido por subclases y dentro de la clase
 * @return  chsmProtected
 */

protected void setChsmProtected (String chsmProtected) {
	this.chsmProtected = chsmProtected;
			
}

/**
 * @return the chsmDefault
 */
String getChsmDefault() {
	return chsmDefault;
}

/**
 * Método default, accesible por la clase y clases
 * dentro del mismo paquete.
 * Para un método default no se escribe al método el modificador
 * @param chsmDefault the chsmDefault to set
 */
void setChsmDefault(String chsmDefault) {
	this.chsmDefault = chsmDefault;
}

/**
 * @return the chsmPrivate
 */
private String getChsmPrivate() {
	return chsmPrivate;
}

/**
 * Método private para establecer el chisme privado 
 * @param chsmPrivate the chsmPrivate to set
 */
private void setChsmPrivate(String chsmPrivate) {
	this.chsmPrivate = chsmPrivate;
}

/**
 * Método para retornar todos los chismes al que tiene
 * acceso mi propia clase
 * @return cade de chisme completo.
 */
public String getChismeCompleto() {
	return this.chsmPublic + "\n" +
			this.chsmProtected + "\n" +
			this.chsmDefault + "\n" +
			this.chsmPrivate;
}




}





