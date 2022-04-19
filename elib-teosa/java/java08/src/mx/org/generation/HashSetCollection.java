package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// Un SET es una colección no ordenada de alementos
		// No se permite elementos duplicados
		// Por lo que cualquier elemento  duplicado no se insertará
		
		// DEfinimos un hashset de tipo string
		HashSet<String> superHeroes = new HashSet<String>();
		
		// Agregamos valores al HashSet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("Lady Bug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Capulin Colorado");
		
		System.out.println(superHeroes);
		
		// Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total: " + longitud);
		
		// Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman? " + contieneNombre);
		
		// Removemos un elemento
		superHeroes.remove("Thor");
		// No se agregan porque Caliman ya existe 
		superHeroes.add("Caliman");
		superHeroes.add("Caliman");
		System.out.println(superHeroes);
		
		// Obtener el HashCode de los elementos HashSet
		// para fines educativos
//		for (String superHeroe : superHeroes) {
//            System.out.println(System.identityHashCode(superHeroe));
//        }

		// Iteramos los valores de superHeroes
		superHeroes.forEach(heroe -> System.out.println("Heroe: " + heroe));
		
	}

}
