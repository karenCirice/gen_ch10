/**
 * 
 */
package mx.org.generation;

import java.util.HashSet;

/**
 * @author Yoscelín RS
 *7 abr. 2022
 */
public class HashSetCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Un SET, es una colección NO ORDENADA de elementos
		//No se permite elementos duplicados
		//Por lo que cualquier elemento duplicado no se insertará.
		
		//Carateristicas de un hashs
		
		//Definimos un HashSet de tipo string
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LaddyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulin Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total :" + longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman ? " + contieneNombre);
		
		//Remover un elemento
		
		superHeroes.remove("Thor");
		superHeroes.add("Caliman");
		superHeroes.add("Caliman");
		System.out.println(superHeroes);
		
		
		//obtener el HashCode de los elementos HashSet
		//for (String superHeroe :superHeroes) {
		//System.out.println(System.identifyHashCode(superHeroe)); }
		
		//Iteramos los valores de superHeroes.
		superHeroes.forEach(heroe -> System.out.println("Heroe : " + heroe));
		// en la línea de arriba tenemos: el HashSet.ciclo forEach(declaramos la nueva variable heroe donde se va a guardar la info
		
		
		
	}

}
