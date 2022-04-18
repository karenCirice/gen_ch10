/**
 * 
 */
package mx.org.generation;

import java.util.ArrayList;

/**
 * @author Yoscelín RS
 *6 abr. 2022
 */
public class ArrayListCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Una lista es una colección ordenada
		//la cual permite elementos duplicados
		//El contenido de array list puede ser dinámico
		//Puede aumentar su tamaño.
		
		//Definimos un ArrayList de tipo String
		//Entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>(); //Este necesita importar el java.util que esta en la línea 6
		// lo que esta arriba es la forma de declarar un arraylist
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		System.out.println(cars);
		
		
		//Obtenemos el tamaño de ArrayList
		int size = cars.size();
		System.out.println("Total autos:" + size);
		
		//Obtenemos el dato "Tsuru"
		String miAuto = cars.get(4);
		System.out.println("Mi auto romántico:" +miAuto);
		
		//Eliminar el auto "Ford"
		cars.remove(2);
		System.out.println(cars);
		
		//Iterar todos los elementos del ciclo for.
		
		for (int i =0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto :" + cars.get(i));
			
		}
		
		//Otra forma de iterar con for 
		for (String car: cars) {
			System.out.println("Auto" + car);
		}
		
		//Tercer forma de iterar usando fotEach
		cars.forEach(car ->{
			System.out.println("Autos en forEach:" + car);
		});
		
		
		//Inicializar un ArrayList usando una subclase aánonima
		
		ArrayList<Integer> calificaciones =
				new ArrayList <Integer>() {{ add(9);add(10);add(8);}};  //necesitamos utilizar el método add para inicializar un arraylist
		
		
		

	}

}
