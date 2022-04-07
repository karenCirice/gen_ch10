package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// Un HashMap relaciona una llave (key) con un valor
		// Llave -valor
		//Formando una especie de tabla de datos
		
		//Definimos una coleccion de tipo Integer, String
		HashMap<Integer, String> postres =  new HashMap<Integer, String>();
		
		//Agregamos datos a mi coleccion
		postres.put(1, "Cheesecake");
		postres.put(2, "Blizzard");
		postres.put(3, "Niño envuelto");
		postres.put(4, "Milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis");
		postres.put(7, "Esquites");
		System.out.println(postres);
		
		//Desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total :" + longitud);
		
		//Desplegamos el postre Totis
		String postreGera = postres.get(5);
		System.out.println("Postres que trajo gera: " + postreGera);
		
		//Removemos el portre de Alondra 
		postres.remove(1);
		System.out.println("Postre eliminado " + postres); 
		
		//Iteramos los valores de los postres
		for (int key : postres.keySet()) {
			System.out.println("Key :" + key + " Value: " + postres.get(key));
		}
		
		postres.forEach((llave, valor)->{
			System.out.println("La llave " + llave + " Tiene el valor " + valor);
		});
	}

}
