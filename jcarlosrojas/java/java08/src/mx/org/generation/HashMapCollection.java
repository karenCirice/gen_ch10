package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// Un HashMap relaciona una llave (key) con un valor
		// llave - valor
		//formando una especie de tabla de datos
		
		//Definimos una coleccionde tipo Integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a mi coleccion
		postres.put(1, "Cheesecake");
		postres.put(2, "Blizzard");
		postres.put(3, "Niño envuelto");
		postres.put(4, "milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(5, "Totis");
		postres.put(6, "Esquites");
		System.out.println(postres);
		
		//Desplegamos la longuitud de HashMap
		int longuitud = postres.size();
		System.out.println("Longuitud total : "+longuitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Postre que trajo Gera : "+postreGera);
		
		//Removemos el postre cheesecake
		postres.remove(10);
		System.out.println(postres);
		
		//Iteramos los valores de postres
		postres.forEach((llave,valor)->{
			System.out.println("La llave "+llave+" tiene el valor : "+valor);
		});
		
		

	}

}
