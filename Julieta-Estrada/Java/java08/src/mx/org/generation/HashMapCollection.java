package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// Un HashMap relaciona una llave (Key) con un valor 
		//llave - valor foma una especie de tabla de datos.
		
		//definimos una coleccion de tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a la coleccion 
		postres.put(10, "Cheesecake");
		postres.put(21, "Blizzar");
		postres.put(34, "Niño envuelto");
		postres.put(44, "milk tea Tapioca ");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis");
		System.out.println(postres);
		
		//Desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total :"+longitud);
		
		//desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre que trajo Gera: "+postreGera);
		
		//Removemos el postre cheescake
		postres.remove(10);
		System.out.println(postres);
		
		//Interamos el valor de los postres
		for(int key : postres.keySet()) {
			System.out.println("Key :"+key+" value :"+postres.get(key));
		}
		
	}

}
