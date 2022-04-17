package mx.org.generation;

import java.util.HashMap;

public class MashMapCollection {

	public static void main(String[] args) {
		//Un HashMap relaciona una llave (key) con un valor
		// llave-valor
		//formando una especie de tabla de datos.
		
		//Definimos una colección de tipo Integer, String
		//Indica el tipo de dato quee usa (llave-valor) (llave entera y valor tipo string
		//VErlo como un objeto de js--> Edad : numero
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//Agregamos datos a mi colección
		postres.put(1, "cheesecake");
		postres.put(2, "blizzard");
		postres.put(3, "niño envuelto");
		postres.put(4, "milk tea con tapioca");
		postres.put(5, "strudel");
		postres.put(6, "jericalla");
		postres.put(7, "tiramisu");
		System.out.println(postres);
		postres.put(8, "cupcakes");
		System.out.println(postres);
		
		//Verificar si hay un elemento
		boolean contienePostre = postres.containsKey(6);
		System.out.println("Contiene tiramisu? " + contienePostre);
		
		//Desplegamos la longityd del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total :"+longitud);
		
		//Desplegamos el postre totis
		String postreGera = postres.get(8);
		System.out.println("Postre que trajo Gera :"+postreGera);

		//REmovemos el postre cheesecake
		postres.remove(6);
		System.out.println(postres);
		
		//Iteramos los valores de postres -- Iterando variable key con los valores que tiene posters.keyset
		for (int key : postres.keySet()) {
			System.out.println("key :"+key +" value: "+ postres.get(key));
		}
		//Iteramso usando for  Each
		//postres.forEach(llave.valor)->{
			//System.out.println("La llave "+llave+" tiene el valor"+valor);
			
		//}
	}

}
