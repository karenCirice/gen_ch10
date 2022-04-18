package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// Un HashMap relaciona una llave (key) con un valor
		// llave-valor
		//formando una especie de tabla de datos
		//No nos interesa el ordeen ya que usamos la llave para ubicar un elemento
		
		//Definimos una colección de tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a mi colección
		//Totis reemplaza a jericalla por que ambos estan en el 5
		postres.put(10, "Cheesecake");
		postres.put(21, "Blizzard");
		postres.put(34, "Niño envuelto");
		postres.put(44, "Milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis");
		postres.put(7,  "Esquites");
		System.out.println(postres);
		
		//Desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total: " + longitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre que trajó Gera: " + postreGera);
		
		//Remove el postre cheeesecake
		postres.remove(10);
		System.out.println(postres);
		
		//Iteramos los valores de postres
		for (int key : postres.keySet()) {
			System.out.println("key: " + key + " value: " + postres.get(key));
		}
		//Iteramos usando for Each
		postres.forEach((llave,valor)->{
			System.out.println("La llave: " + llave + " tiene el valor: " + valor);
		});
		
	}

}
