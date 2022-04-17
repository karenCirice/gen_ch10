package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		//Un HashMap relaciona una llave (key) con un valor
		//formando una especie de tabla de datos
		
		//Definimos una coleccion de tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a mi coleccion
		postres.put(1, "Cheesecake");
		postres.put(2, "Blizzard");
		postres.put(3, "Niño envuelto");
		postres.put(4, "Jericalla");
		postres.put(5, "Torta");
		postres.put(5, "Esquites");
		System.out.println(postres);
		
		//Desplegamos la longitud
		int longitud = postres.size();
		System.out.println("Longitud total: "+longitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre que traje: "+postreGera);
		
		//Removemos el postre de Alondra
		postres.remove(3);
		System.out.println(postres);
		
		//Iteramos los valores de postres
		for(int key: postres.keySet()) {
			System.out.println("Key:" + key + " Value:" + postres.get(key));
		}
	}

}
