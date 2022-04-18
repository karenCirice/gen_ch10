package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		/*Un hashMao relaciona una llave (key) con una variable
		 * siempre recordar llave-valor
		 * formando una especie de tabla de datos*/
		
		/*definimos una colección de tipo integer, string */
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		postres.put(1,  "Ceesecake");
		postres.put(2,  "Blizzard");
		postres.put(2,  "Niño envuelto");
		postres.put(4,  "milk tea con tapioca");
		postres.put(5,  "jericalla");
		postres.put(6,  "Esquites");
		System.out.println(postres);
		postres.put(5,  "Totis");
		System.out.println(postres);
		
		/*desplegamos la longitud del hashmap*/
		int longitud = postres.size();
		
		System.out.println("La longitud de postres: "+longitud);
		
		/*Desplegamos el postre totis*/
		String postreGera=postres.get(5);
		System.out.println("Postre para gera "+postreGera);
		
		/*remover un postre*/
		postres.remove(1);
		System.out.println(postres);
		
		/*iteramos los valores de postres*/
		for(int key:postres.keySet()){
			System.out.println("Key: "+key+" value"+postres.get(key));
		}
		
		
		/*iteramos usando un foreach*/
		postres.forEach((llave, valor)->{
			System.out.println("La llave "+llave+" tiene valor "+valor);
		});
	}

}
