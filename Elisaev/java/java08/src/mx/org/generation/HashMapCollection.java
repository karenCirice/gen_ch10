package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// Un hashMap relaciona una llave con un valor
		//llave -valor
		//formado una especie de tabla de datos
		
		//Definimos una coleccion de tipo integer,String
		HashMap<Integer,String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a mi coleccion
		postres.put(1, "Cheescake");
		postres.put(2, "Blizzard");
		postres.put(2, "Niño envuelto");
		postres.put(4, "Tapioca");
		postres.put(5,"Jericalla");
		postres.put(5, "totis"); // si se repiten remplaza a la ultima palabra.
		System.out.println(postres);
		
		//Desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total: " + longitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre que trajo gera: " +postreGera);
		
		//removemos el postre cheescake
		postres.remove(1);
		System.out.println(postres);
	
		//Iteramos los valores de postres
		for (int key : postres.keySet()) { // .keySet() nos devuelve todas la llaves que tiene hashMap
			System.out.println("key : " + key + "value: " + postres.get(key));
		}
	
		//iteramos usando forEach
		postres.forEach((llave,valor) -> {
			System.out.println("La llave " +llave + "tiene el valor: "+ valor);
		});
			
	}
}

