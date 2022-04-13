package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// Un SET es una colecci�n NO ORDENADA de elementos
		//NO se permite elementos duplicados
		//Por lo que cualquier elemento duplicado no se insertar�
		
		//Definimos un HashSet de tipo String
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superHeroes.add("Calcet�n Conrombos Man");
		superHeroes.add("Thor");
		superHeroes.add("LaddyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapul�n Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud Total: "+longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("�Contiene Caliman? "+contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		System.out.println(superHeroes);
		
		//Obtener el HasCode de los elementos HashSet
//		for (String superHeroe: superHeroes) {
//			System.out.println(System.identityHashCode(superHeroes));
//		}
		
		//iteramos los valores de superHeroes
		superHeroes.forEach(heroe -> System.out.println("Heroe: "+heroe));

	}

}
