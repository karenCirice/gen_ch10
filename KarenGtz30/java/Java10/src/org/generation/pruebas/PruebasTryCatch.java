package org.generation.pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebasTryCatch {

	public static void main(String[] args) {
		/**
		 * Una excepción es una situación no esperada
		 * durante la ejecución de nuestro programa.
		 * 
		 * Existen dos tipo de excepciones:
		 * 
		 * A) Checked Exceptions o Excepciones que se heredan
		 * de la clase Exception. Se tiene que declarar en la
		 * firma del método o usar los bloques try/catch.
		 * 
		 * B) Unchecked Exceptions o Excepciones que se heredan
		 * de la clase RunTimeException. No es obligatorio
		 * procesarlas, es opcional el uso de try/catch.
		 * 
		 * Las excepciones de tipo Error son arrojadas
		 * por la JVM, los cuales son errores de los que no
		 * nos podemos recuperar. En cambio las de tipo Exception
		 * o RuntimeException son provocadas por nuestro código.
		 * 
		 * try: Bloque de código que prueba los errores mientras
		 *  se ejecuta.
		 * catch: Se ejecutará si ocurre un error en el bloque try
		 * finally: Se ejecutará al terminar el bloque try o catch,
		 *  no es necesario agregarlo.
		 *  
		 *  El stacktrace de una excepción es el conjunto
		 *  de mensajes de error desde el origen del error hasta
		 *  la última clase que recibe el error.
		 */
		double division = 0;
				
		/*try {
			division = 100/0;			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Termina mi bloque try/catch ");
		}		
		System.out.println("El resultado es " + division);
		*/
		
		// Lo siguiente va a marcar error por que se intenta acceder
		// al indice 5, y esto no existe en el arreglo de 4 elementos.
		/*int[] arreglo = new int [4];		
		int miDato = arreglo[5];		
		System.out.println(miDato);*/
		
		System.out.println("Realizaremos la lectura de un archivo");
		File file = new File("miarchivo.txt");
		//El IDE nos obliga a procesar la excepción
		// se puede hacer en la firma del método
		// con throws FileNotFoundException
		try {
		Scanner myReader = new Scanner(file);
		}
		catch (Exception e) {
			System.out.println(e);			
		}
		finally {
			System.out.println("Se termina la lectura");
		}
		
		/*
		ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
		for (int i = 0; i < 1_000_000_000; i++) {
			arrayListInt.add(i);			
		}*/
		

	}

}