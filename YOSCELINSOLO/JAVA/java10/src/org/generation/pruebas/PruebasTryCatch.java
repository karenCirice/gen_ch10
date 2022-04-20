
package org.generation.pruebas;

/**
 * @author Yoscelín RS 19 abr. 2022
 */
public class PruebasTryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Una excepción es una situación no esperada durante la ejecución de nuestro
		 * programa
		 * 
		 * Existen 2 tipos de excepciones:
		 * 
		 * A) Checked Exceptions o Excepciones que se heredan de la clase Exception. Se
		 * tiene que declarar en la firma del método o usar los bloques try/catch.
		 * 
		 * B) Unchecked Exceptions o Excepciones que se heredan de la clase
		 * RunTimeExcepcion. No esobligatorio procesarlas, es opcional el uso de
		 * try/catch.
		 * 
		 * Las excepciones de tipo Error son arrojadas por la JVM, los cuales son
		 * errores de los que no nos podemos recuperar. En cambio las de tipo Excpeption
		 * o RuntimeException son provocadas por nuestro código.
		 * 
		 * try: Bloque de código que prueba los errores mientras de ejecuta. Catch: Se
		 * ejecutará si ocurre un error en el bloque try FINALLY: Se ejecutará al
		 * terminar el bloque try o catch, no es necesario agregarlo.
		 * 
		 * El STACKTRACE de una excepción es el conjunto de mensajes de error desde el
		 * origen del error hasta la última clase que recibe el error.
		 */
		double division = 0;

		try {
			division = 100 / 2;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Termina mi bloque try/catch ");
		}
		System.out.println("El resultado es " + division);

	}

}
