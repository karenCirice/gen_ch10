package org.generation.pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebasTryCatch {

	public static void main(String[] args) {
		/**
		 * Une excepci�n es una sutuaci�n no esperada
		 * durante la ejecuci�n de nuestro programa.
		 * 
		 * Existen 2 tipos de excepciones:
		 * 
		 * A) Checked Excepciones que se heredan desde la clase Excepcion.
		 * Estas se tienen que declarar en la firma del m�todo o usar los
		 * bloques try/catch.
		 * 
		 * B) Unchecked Excepcions o Excepciones que se heredan
		 * de la clase RunTimeException. No es obligatorio preocesarlas,
		 * es opceional el uso de try/catch.
		 * 
		 * Las excpciones de tipo error son arrojadas por la JVM, los
		 * cuales son erroees de los que no nos podemos recuperar. En cambio 
		 * las de tipo excepction o RunTimeException son provocadas por nuestro c�digo.
		 * 
		 * try: Bloque de c�digo que pruba errores mientras s ejecuta.
		 * catch: Se ejecutr� al terminar el bloque try.
		 * finally: Se ejecutar� al terminar el bloque try o catch,
		 * no es obligatorio usarlo.
		 * 
		 * El stacktrace de una excepci�n es el conjunto
		 * de mensajes de error desde el origen del error hasta
		 * la �ltima clase que recibe el error.
		 */
		double division = 0;
		
		try {
			division = 100/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Termina mi bloque try/catch ");
		}
		
		System.out.println("El resultado es: " + division);
		
		System.out.println("\n Realizaremos la lectura de un archivo \n");
		
		File file = new File("miarchivo.txt");
		//El IDE nos obliga a procesar la excepci�n
		//se puede hacer la en la firma del metodo
		//con throws FileNotFoundException
		//O bien se puede con la estructura Try
		try {
			Scanner myReader = new Scanner(file);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Hijole !! No se pudo cargar el archivo :'c ");
		}
		
		/*ArrayList<Integer> ArrayListInt = new ArrayList<Integer>();
		for (int i =0; i < 1_000_000_000; i++) {
			arrayListInt.add(i);
		}*/
		
	}
}
