/**
 * 
 */
package mx.org.generation;

import java.util.HashMap;

/**
 * @author Yoscelín RS
 *7 abr. 2022
 */
public class HashMapCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Un HashMap relaciona una llave (key) con un valor
		//llave-valor
		//formando una especie de tabla de datos.
		//No nos interesa el orden en un HashMap porque no lo vamos a encontrar por su index, sino por su llave
		
		//Definimos una colección de tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer,String>();
		//declaramos HaashMap<llave,valor> nombre = new Hasap...
		
		//Agregamos datos a mi colección utilizando el método .put no .add
		postres.put(10, "Cheesecake");
		postres.put(21, "Blizzard");
		postres.put(34, "Niño envuelto");
		postres.put(44, "milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis");
		
		//Desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total : " + longitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre que trajo Gera:" + postreGera);
		
		//Removemos al postre cheesecake
		postres.remove(10);
		System.out.println(postres);
		
		//Iteramos los valores de postres
		for(int key: postres.keySet()) {
			System.out.println("key : " + key + "Value:" + postres.get(key));
			
		}
		//Iteramos usando forEach
		postres.forEach((llave,valor)->{
			System.out.println("La llave" + llave +"tiene el valor :" + valor);
		});
		

	}

}
