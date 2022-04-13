package mx.org.generation;

import java.util.ArrayList;

public class ArrayListColletion {

	public static void main(String[] args) {
		//una lista es una coleccion ordenada la cual permite 
		//elementos duplicados
		//el contenido de ArrayList puede ser dinamico
		//puede aumentar su tamaño.
		
		//definimos un Araaylis de tipo string
		//entre<> se define el tipo de dato envolvente.
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("tsuru");
		
		System.out.println(cars);
		
		//obtenemos la longitud de ArrayList
		int size = cars.size();
		System.out.println("Total autos: " +size);
		
		String miAuto = cars.get(4);
		System.out.println("Mi auto Romantico: " + miAuto);
		
		//Eliminar el auto ford
		cars.remove(2);
		System.out.println(cars);
		
		//iterar todo los elementos en ciclo for
		for (int i=0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto:" + cars.get(i));
		}
		
		
		//segunda forma de iterar con for
		for(String car : cars) {
			System.out.println("Auto" + car);
		}
		
		//tercara forma de iterar usando forEach
		cars.forEach(car->{
			System.out.println("Autos en forEach: "+car);
		});
		
		//Inicializar un ArrayList usando una subclse anonima
		ArrayList<integer> calificaciones = 
				new ArrayList<Integer>() {{add(9);add(10);add(8);}};
	}

}
