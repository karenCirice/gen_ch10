package mx.org.generation;

import java.util.ArrayList;

public class ArrayCollection {

	public static void main(String[] args) {
		//Una lista es una coleccion ordenada, la cual permite elementos duplicados
		//El contenido de ArrayList puede ser dinamico, puede aumentar su tamanio
		
		//Definimos un ArrayList de tipo String
		//Entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>(); //marca error entonces se importa el java.util.ArrayList
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		System.out.println(cars);
		
		//Obtenemos la longitud de ArrayList
		int size = cars.size();
		System.out.println("Total de autos: " + size);
		
		//Obtenemos el dato "Mazda"
		String miAuto = cars.get(3);
		System.out.println("Mi auto: " + miAuto);
		
		cars.remove(3);
//		System.out.println(cars);
		
		//Iterar todos los elementos en ciclo for
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto: " + cars.get(i));
			
		}
		
		cars.add("Mazda");
		
		//Segunda forma de iterar con for
		for (String car : cars) {
			System.out.println("Auto " + car);
		}
		
		
		//Tercera forma de iterar, usando forEach
		cars.forEach(car -> {
			System.out.println("Autos en forEach: " + car);
		});
	
		//Inicializar un ArrrayList usando una subclase anonima
		ArrayList<Integer> calificaciones =
				new ArrayList<Integer>() {{add(9);add(10);add(8);}};
		
				
				
	}

}
