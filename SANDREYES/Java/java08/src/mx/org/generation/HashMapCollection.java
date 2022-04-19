/**
 * 
 */
package mx.org.generation;

import java.util.HashMap;

/**
 * @author DELL
 *
 * 7 abr. 2022
 */
public class HashMapCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // UN HASHMAP RELACIONA UNA LLAVE (KEY) CON UN VALOR
		// LLAVE-VALOR
		//FORMADO UNA ESPECIE DE TABLA DE DATOS
		
		//DEFINIMOS UNA COLECCIÓN DE TIPO INTEGER, STRING
		HashMap<Integer, String> postres = new HashMap<Integer, String>();
		
		//AGREGAMOS DATOS A MI COLECCIÓN
		postres.put(10, "Cheesecake");
		postres.put(2, "Blizzard");
		postres.put(3, "Niño envuelto");
		postres.put(4, "milk tea con tapioca");
		postres.put(5, "Jericalla");
		postres.put(6, "Esquites");
		System.out.println(postres);
		postres.put(5, "Totis");
		postres.put(7, "Esquites");
		System.out.println(postres);
		
		//DESPLEGAMOS LA LONGITUD DEL hashMap
		int longitud = postres.size();
		System.out.println("longitud total: " + longitud);
		
		//DESPLEGAMOS EL POSTRE TOTIS
		String postreGera= postres.get(5);
		System.out.println("Postre que trajo Gera:" +postreGera);
		
		//REMOVEMOS EL POSTRE DE ALONDRA CHEESECAKE
		postres.remove(10);
		System.out.println(postres);
		
		//ITERAMOS LOS VALORES DE POSTRES
		for (int key : postres.keySet()) {
			System.out.println("key :" +key + "value:" + postres.get(key));
			
		}
		
		
		
	}

}
