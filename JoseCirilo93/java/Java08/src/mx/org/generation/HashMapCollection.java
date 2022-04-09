package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		//Un HashMap relaciona una llave (Key) con valor
		//llave-valor
		//formando una especie de tabla de datos.
		
		//Definimos una colección de tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a mi coleción 
		postres.put(1, "Cheesecake");
		postres.put(2, "Blizzard");
		postres.put(3, "Niño envuelto");
		postres.put(4, "milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis");
		postres.put(7, "Esquites");
		System.out.println(postres);
		
		//Desplegamos la longuitud del Hasmap
		int longitud = postres.size();
		System.out.println("Longitud Total : " + longitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre que trajo Gera: "+ postreGera);
		
		//Removemos el postre de Alondra =P
		postres.remove(1);
		System.out.println(postres);
		
		//Iteramos los valores de postres
		for (int key : postres.keySet()) {
			System.out.println("Key : " +key + " value: "+ postres.get(key));
		}
		
		postres.forEach((llave,valor)->{
			System.out.println("La llave "+llave+" tiene el valor :"+valor);
		});
		
		

	}

}
