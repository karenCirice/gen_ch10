package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		//un HashMap rlaciona una llave (Key) con un valor
		//Formando una especie de tabla de datos
		
		//definimos una coleccion de tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//agregamos datos a mi coleccion 
		//aquí no importa el orden dentro de un HashMap, porque encontraremos
		//el elemento por su llave no por su id!!
		postres.put(1, "Cheesecake");
		postres.put(2, "Blizzard");
		postres.put(3, "Niño envuelto");
		postres.put(4, "Milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(5, "Totis");
		postres.put(7, "Esquites");
		System.out.println(postres);
		
		//desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("La longitud es: " + longitud);
		
		//Desplegamos el postre Totis:
		String postreGera = postres.get(5);
		System.out.println("Postre que trajo Gera: " + postreGera);
		
		//Remover el poste cheesecake:
		postres.remove(1);
		System.out.println(postres);
		
		//iteramos los valores de los postres
		for (int key : postres.keySet()) {
			System.out.println("Key: " + key + "value: " + postres.get(key));
		}
		
	}

}
