package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		//Un set es una coleccion no ordenada de elementos
		//No se permiten elementos duplicados
		//Por lo que cualquier elemento duplicado no se insertara
		
		//Definimos un HashSet de tipo String
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores
		superHeroes.add("Calcetin con rombos man");
		superHeroes.add("Thor");
		superHeroes.add("LadyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Spiderman");
		System.out.println(superHeroes); //los datos aparecen ordenados deacuerdo
										//al hashcode
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total: " + longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman? " + contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		System.out.println(superHeroes);
		superHeroes.add("Caliman");
		superHeroes.add("Caliman"); //Los elementos duplicados solo los agrega 1 vez
		
		/*
		 * //Obtener el HashCode de los elementos HashSet for (String superHeroe :
		 * superHeroes) { System.out.println(System.identityHashCode(superHeroes)); }
		 Esta informacion no es relevante pues es coleccion no ordenada			*/
		
		//Iteramos los valores de superHeroes
		superHeroes.forEach(heroe -> System.out.println("Heroe: " + heroe));
		
		
	}

}
