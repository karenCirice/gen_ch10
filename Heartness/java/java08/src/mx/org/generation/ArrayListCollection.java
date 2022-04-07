package mx.org.generation;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// Una lista es una colección ordenada
		//la cual permite elementos duplicados
		//El contenido de ArrayList puede ser dinámico
		//Puede aumentar su tamaño
		
		//Definimos un ArrayList de tipo String
		//Entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru Tuneado");
		System.out.println(cars);
		
		//Obtenemos el tamaño de ArrayList
		int size = cars.size();
		System.out.println("Total autos: " + size);
		
		//Obtenemos el dato Tsuru
		String miAuto = cars.get(4);
		System.out.println("Mi auto romántico: " + miAuto);
		
		//Eliminar el auto "Ford"
		cars.remove(2);
		//Agregar Tesla en el indice donde estaba Ford
		cars.add(2, "Tesla");
		System.out.println(cars + "\n");
		
		//Iterar todos los elementos en un for
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto: " + cars.get(i));
		}
		System.out.println("\n");
		
		//Otra forma de iterar con for
		for(String car : cars) {
			System.out.println("Auto " + car);
		}
		System.out.println("\n");
		
		//Iterar con forEach
		cars.forEach(car -> {System.out.println("Autos en forEach: " + car);});
	
	}

}