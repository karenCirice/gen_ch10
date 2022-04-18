package mx.org.generation;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// Una lista es una coleccion ordenada
		//La cual permite elementos duplicados
		//el contenido de Array List puede ser dinamico
		//puede aumentar su tamaño
		
		//Definimos un ArrayList de tipo String
		//entre <> se define el tipo de dato
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		System.out.println(cars);
		
		//Obtenemos el tamaño de ArrayList
		int size = cars.size();
		System.out.println("Total autos: " + size);
		
		//Obtenemos el dato "Tsuru"
		String miAuto = cars.get(4);
		System.out.println("Mi auto romantico: " +miAuto);
		
		//Eliminar el auto "Ford"
		cars.remove(2);
		System.out.println(cars);
		
		//Iterar todos los elementos de un ciclo for
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto: " + cars.get(i));
		}
		//Segunda forma de iterar con for
		for (String car : cars) {
			System.out.println("Auto " + car);
		}
		// Tercera forma de iterar con forEach
		cars.forEach(car ->{
			System.out.println("Autos en forEach: " + car);
		});
		//Inicializar un ArrayList usando una subclase anonima
		ArrayList<Integer> calificaciones = newArrayList<Integer>(){{add(9); add(10); add(8);}};
	}

}
