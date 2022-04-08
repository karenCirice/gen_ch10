package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {
	
	public static void main(String[] args) {
		//Un HashMap relaciona una llave (key) con un valor llave -valor
		//formando una especie de tabla de datos
		
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a mi coleccion
		postres.put(1, "Cheesecake");
		postres.put(2, "Chocolate");
		postres.put(3, "Macarrones");
		postres.put(4, "Frapuchino");
		postres.put(5, "Cupcakes");
		postres.put(5, "Jericalla");
		postres.put(6, "Pastel");
		System.out.println(postres);
		postres.put(5, "Cupcakes");
		System.out.println(postres);
		postres.put(44, "Jericalla"); //Se puede poner cualquier numero
		System.out.println(postres);
		
		//Desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total: " + longitud);
		
		//Desplegamos el postre Frapuchino
		String postrecito = postres.get(3);
		System.out.println("El mejor postre: " + postrecito);
		
		//Removemos un postre
		postres.remove(2);
		System.out.println(postres);
		
		//Iteramos los valores de postres
		for (int key : postres.keySet()) {
			System.out.println("Key: " + key + ", value: " + postres.get(key));
			
		}
		
		//Usando forEach
		postres.forEach((llave,valor) -> {
			System.out.println("La llave " + llave + " tiene el valor de " + valor);
		});
		
	}
	
}
