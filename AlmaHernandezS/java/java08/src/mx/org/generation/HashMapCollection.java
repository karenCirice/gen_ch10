package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		//Un HashMap relaciona una llave (Key) con un valor
				// llave -valor
				//formando una especie de tabla de datos
				
				//Definimos una colecci�n de tipo Integer, String
				HashMap<Integer, String> postres = new HashMap<Integer, String>();
				
				//Agregamos datos a mi colecci�n
				postres.put(10, "Cheesecake");
				postres.put(21, "Blizzard");
				postres.put(34, "Ni�o envuelto");
				postres.put(44, "milk tea con tapioca");
				postres.put(5, "Jericalla");
				postres.put(6, "Esquites");
				System.out.println(postres);
				postres.put(5, "Totis");
				postres.put(7, "Esquites");
				System.out.println(postres);
				
				//Despegamos la longitud del HashMap
				int longitud = postres.size();
				System.out.println("Longitud total :"+longitud);
				//Desplegamos el postre totis
				String postreGera = postres.get(5);
				System.out.println("Postre que trajo Gera: " +postreGera);
				
				//Removemos el postre de Alondra :P
				postres.remove(10);
				System.out.println(postres);

	}

}
