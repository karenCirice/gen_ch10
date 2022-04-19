package mx.org.generation.pruebas;

public class PruebasTryCatch {

	public static void main(String[] args) {
		
		/**
		 * Una excepción es una situación o esperada
		 * durante la ejecución de nuestro programa
		 * 
		 * Existen dos tipos de excepciones:
		 * 
		 * A) Checked Exceptions o Excepciones que se heredan
		 * de la clase Exception. Se tiene que declarar en la 
		 * firma del método o usar los bloques try/catch.
		 * 
		 * B) Unchecked Exceptions o Excepciones que se heredan 
		 * de la clase RunTimeException. No es obligatorio
		 * procesarlas, es opcional el uso de try/catch.
		 * 
		 * Las excepciones de tipo Error son arrojdas
		 * por la JVM, los cuales son errores de los que no 
		 * nos podemos recuperar. En cambio las de tipo Exception 
		 * o RunTimeException son provocadas por nuestro código.
		 * 
		 * try: Bloque de código que prueba los errores mientras 
		 * se ejecuta.
		 * catch: se ejecutará si ocurre un error en el bloque try
		 * finally: se ejecutará al terminar el bloque try o catch,
		 * no es necesario agregarlo
		 * 
		 * El stacktrace de una excepcion es el conjunto 
		 * de mensajes de error desde el origen del error hasta
		 * la última clase que recibe el error
		 */
		double division=0;
		try {
			division = 100/2;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Termina mi bloque try/catch");
		}
		
		System.out.println("El resultado es "+division);

	}

}
