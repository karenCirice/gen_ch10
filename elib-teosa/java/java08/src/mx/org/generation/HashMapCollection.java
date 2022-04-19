package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// Un hashmap relaciona una llave (key) con un valor
		// llave - valor
		// formando una especie de tabla de datos
		// no hay un orden, su pueden repetir los datos pero no las llaves
		
		// Definimos una colección de tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		// Agregamos datos a la coleccion
		postres.put(10, "Cheesecake");
		postres.put(21, "Blizzard");
		postres.put(34, "Niño envuelto");
		postres.put(44, "Milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis");
		postres.put(7, "Esquites");
		System.out.println(postres);
		
		// Desplegamos la longitud del Hashmap
		int longitud = postres.size();
		System.out.println("Longitud total: " + longitud);
		
		// DEsplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre de Gera: " + postreGera);
		
		// Se remueve un postre (cheesecake
		postres.remove(10);
		System.out.println(postres);
		
		// Iteramos los valores de postres
		for (int key: postres.keySet()) {
			System.out.println("key: " + key + ", value: " + postres.get(key));
		}
		
		// Iteramos usando forEach
		postres.forEach((llave, valor) ->
			System.out.println("La llave " + llave + " tiene el valor " + valor)
		);
	}

}
