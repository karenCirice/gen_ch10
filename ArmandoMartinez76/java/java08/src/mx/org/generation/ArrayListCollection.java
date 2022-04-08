package mx.org.generation;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// Una lista es una coleccion ordenada
		//La cual permite elementos duplicados \
		//El contenido de ArrayList puede ser dinamico
		//Puede aumentar su tamaño.\
		
		//Definimos un Array de tipo String
		//Entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		cars.add("Tsuru tuneado");
		System.out.println(cars);
		
		//Obtenemos el tamaño de ArrayList
		int size = cars.size();
		System.out.println("Total de autos :" + size);
		
		//Obtenemos el dato Tsuru
		String miAutoma = cars.get(4);
		System.out.println("Mi auto romantico: " + miAutoma);
		
		//Eliminar el auto "Ford"
		cars.remove(2);
		System.out.println(cars);
		
		//Iterar todos los elementos del ciclo for
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto :" + cars.get(i));
		}
		
		
		//Segunda forma de iterar con for
		for (String car : cars ) {
			System.out.println("Auto " + car);
		}
		
		//Tercera forma de iterar usando forEach
		cars.forEach(car -> {
			System.out.println("Autos en forEach: " + car);
		});

	}

}
