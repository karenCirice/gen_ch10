/**
 * 
 */
package mx.org.generation;

import java.util.HashSet;

/**
 * @author DELL
 *
 * 7 abr. 2022
 */
public class HashSetCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // UN SET ES UNA COLECCION NO ORDENADA DE ELEMENTOS
		// NO SE PERMITE ELEMENTOS DUPLICADOS
		// POR LO QUE CUALQUIER ELEMENTO DUPLICADO NO SE INSERTARÁ
		
		//DEFINIMOS UN HASSET DE TIPO STRING
		
		HashSet<String> superHeroes = new HashSet<String>();
		
		//AGREGAMOS VALORES AL HASHSET
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LadyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
        superHeroes.add("Chapulin Colorado");
        
        System.out.println(superHeroes);
        
        //DESPLEGAR LA LONGITUD
        int longitud = superHeroes.size();
        System.out.println("Longitud total :" + longitud);
        
        //VERIFICAR SI CONTIENE UN ELEMENTO
        boolean contieneNombre = superHeroes.contains("Caliman");
        System.out.println("Contiene Caliman? " + contieneNombre);
        
        //REMOVEMOS UN ELEMENTO
        superHeroes.remove("Thor");
        superHeroes.add("Caliman");
        superHeroes.add("Caliman");
        System.out.println(superHeroes);
        
        //OBTENER EL HASHCODE DE LOS ELEMENTOS HASHSET
        for (String superHeroe : superHeroes) {
        	System.out.println(System.identityHashCode(superHeroe));
        }
        
        // ITERAMOS LOS VALORES DE SUPERHEROES
        superHeroes.forEach(heroe -> System.out.println("Heroe :" +heroe));
       
        
	}

}
