package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Un set es una colección NO ORDENADA de elementos .
		 * no se permiten elementos duplicados.
		 * por lo que cualquier elemento duplicado no se insertará*/
		
		/*definimos un HashSet de tipo string*/
		HashSet<String> superheroes = new HashSet<String>();
		superheroes.add("Thor");
		superheroes.add("Chapulin colorado");
		superheroes.add("Porfirio Cadenas");
		superheroes.add("Caliman");
		superheroes.add("LaddyBug");
		System.out.println(superheroes);
		
		//longitud
		int longitud =superheroes.size();
		System.out.println("Longitud de heroes: "+longitud);
		
		//quiero saber si contiene un elementoy almacenar valor en una variable
		boolean contieneNombre=superheroes.contains("chupifrut");
		
		/*remover un elemento*/
		superheroes.remove("Thor");
		System.out.println(superheroes);
		
		/*recordar que no hay repeticiones, caliman no se agrega*/
		superheroes.add("Caliman");
		System.out.println(superheroes);
		
		/*obtener el hashcode de los elementos hashset*/
		for (String superH : superheroes) {
			System.out.println(System.identityHashCode(superheroes));
			
		/*iteramos los valores de superheroes*/
		superheroes.forEach(heroe ->{
			System.out.println("Heroe: "+heroe);
		});
		}
		
	}

}
