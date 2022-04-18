package mx.org.generation;

import java.util.HashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// Un HashMap relaciona una llave (key) con un valor
		//llave-valor
		//formando una especie de tabla de datos
		
		//definimos una colección tipo integer, String
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//agregamos datos a mi colección
		postres.put(1, "Cheesecake"); //la llave puede ser cualquiera
		postres.put(2, "Blizzard"); //no es necesario que lleve un orden
		postres.put(3,"Niño envuelto"); //siempre que sea del tipo de dato declarado
		postres.put(4, "milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis"); //esto hace que Jericalla sea reemplazado por totis
		System.out.println(postres);
		
		//Desplegamos la longitud del HashMap
		int longitud = postres.size();
		System.out.println("Longitud total: "+longitud);
		
		//desplegamos el postre totis
		String postreGera = postres.get(5);
		System.out.println("Gera trajo: "+postreGera);
		
		//removemos el postre de Alondra
		postres.remove(1);
		System.out.println(postres);
		
		//iteramos los valores de postres
		//postres.forEach(postre -> System.out.println("Postre = "+postre)); esto es un error
		for (int key: postres.keySet()) { //itera sobre cada llave
			System.out.println("Key:"+key+"  "+"Value:"+postres.get(key));//.get(key) nos da el valor que contiene cada llave
		}
		
		//iteramos usando forEach
		postres.forEach((llave,valor)->{
			System.out.println("La llave "+llave+" tiene el valor: "+valor);
		});
	}

}
