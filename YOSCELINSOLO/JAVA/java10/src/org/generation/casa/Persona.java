/**
 * 
 */
package org.generation.casa;

/**
 * @author Yoscel�n RS
 *18 abr. 2022
 */
public class Persona {



/*
 * Definimos los atributos de la clase
 * Los modificadores de acceso en orden de menos a m�s restrictivos
 * (+)public: Accesible para todas las clases.
 * (#) Protected: Accesible solo dentro de las clases y subclases
 * (~)default:Accesible dentro de las clases y clases dentro del mismo paquete
 * (-) private: Accesible solo dentro de la clase
 */
/*
 * La encapsulaci�n sirve para restirngir el acceso directo a los datos
 */
private String chsmPublic;
private String chsmProtected;  /* aqui encapsulamos nuesttros datos poniendo private*/
private String chsmDefault;
private String chsmPrivate;

public Persona(){
this.chsmPublic = "A Yoz le gusta la Rosal�a";
this.chsmProtected = "Le gust� su nuevo album despu�s de ver a Altozano";
this.chsmDefault = "Hoy com� 5 paletas de hielo";
this.chsmPrivate = "Me gusta la canci�n de Sakura";
}

/**
 * M�todo get para retornar el chisme p�blico
 * @return chismw
 */
public String getChsmPublic() { /* get accede, obtengo*/
	return this.chsmPublic;
}

/**
 * M�todo para establecer nuevo chisme
 * set: establesco.
 *
 * @param chsmPublic nuevo chisme para almacenar
 */

public void setChsmPublic(String chsmPublic) {
	this.chsmPublic = chsmPublic;
}

/**
 * M�todo protegido, solo accedido por subclases y dentro de la clase
 * @return 
 */
protected String getChsmProtected() {
	return this.chsmProtected;
}

/**
 * M�todo protegido, solo accedido por subclases y dentro de la clase
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
 * M�todo default, accesible por la clase y clases
 * dentro del mismo paquete.
 * Para un m�todo default no se escribe al m�todo el modificador
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
 * M�todo private para establecer el chisme privado 
 * @param chsmPrivate the chsmPrivate to set
 */
private void setChsmPrivate(String chsmPrivate) {
	this.chsmPrivate = chsmPrivate;
}

/**
 * M�todo para retornar todos los chismes al que tiene
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





