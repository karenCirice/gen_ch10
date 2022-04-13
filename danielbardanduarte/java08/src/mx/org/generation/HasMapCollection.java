package mx.org.generation;

import java.util.HashMap;

public class HasMapCollection {

	public static void main(String[] args) {
		// Un HashMap relaciona una llave (key) con un valor
		//formando una especie de tabla de datos.
		
		//Definimos una coleccion de tipo Integer, String
		HashMap<Integer,String> postres = new HashMap<Integer,String>();
		postres.put(1, "Cheescake");
		postres.put(2, "Blizzard");
		postres.put(3, "Niño envuelto");
		postres.put(4, "Milk tea de tapioca");
		postres.put(5, "Jericalla");
		postres.put(5, "Totis");
		postres.put(6, "Esquites");
		System.out.println(postres);
		
		//Desplegamos la longitud de HashMap
		int longitud = postres.size();
		System.out.println("Longitud total: " + longitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(5);  //Se usa la llave, no el index
		System.out.println("Postre que trajo Gera: " + postreGera);
		
		//Removemos el postre cheescake
		postres.remove(10);
		System.out.println(postres);
		
		//Iteramos los valores de postres
		for (int key : postres.keySet()) {
			System.out.println("key: " + key + " value: " + postres.get(key));
		}
	}

}
