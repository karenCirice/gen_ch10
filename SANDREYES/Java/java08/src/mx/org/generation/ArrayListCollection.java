/**
 * 
 */
package mx.org.generation;

import java.util.ArrayList;

/**
 * @author DELL
 *
 * 6 abr. 2022
 */
public class ArrayListCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // UNA LISTA ES UNA COLECCION ORDENADA
		//LA CUAL PERMITE ELEMEMTOS DUPLICADOS
		//EL CONTENIDO DE ARRAYLIST PUEDE SER DINAMICO
		//PUEDE AUMENTAR SU TAMAÑO.
		
		//DEFINIMOS UN ARRAYLIST DE TIPO STRING
		ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tsuru");
        cars.add("Audi");
        System.out.println(cars);
        
        
        //OBTENEMOS LA LONGITUD DE ARRAYLIST
        int size = cars.size();
        System.out.println("Total autos:"+ size);
     
        //OBTENEMOS EL DATO "TSURU"
        String miAuto = cars.get(5);
        System.out.println("Mi auto romántico: "+miAuto);
	
        //ELIMINAR EL AUTO "FORD"
        cars.remove(2);
        System.out.println(cars);
        
        //ITERAR TODOS LOS ELEMENTOS EN CICLO FOR
        
        for(int i=0; i<cars.size(); i++) {
        	System.out.println("Te regalo el auto :" + cars.get(i));
        
        // otra forma de iterar con for
        	for(String car : cars) {
        		System.out.println("Auto "+ car);
        	}     		
        //TERCER FORMA DE ITERAR USANDO FOREACH
        		cars.forEach(car ->{
        			System.out.println("autos en forEach:" + car);
        		});
        // INICIALIZAR UN ARRAYLIST USANDO UNA SUBCLASE ANONIMA
        		ArrayList<Integer>calificaciones =
                new ArrayList<Integer>() {{add(9);add(10);add(8);}};
        System.out.println("calificaciones");
        
        }
        }
}
