package mx.org.generation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		//una lista es una coleccion ordenada
		//el cual permite elementos duplicados
		//El contenido de ArrayList puede ser dinamico
		//Puede aumentar su tamaño
		
		//Definimos un arrayList tipo String
		//entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BWM");
		cars.add("Ford");
		cars.add("Tsuru");
		System.out.println(cars);
		//Obtenemos el tamaño de ArrayList
		int size = cars.size();
		System.out.println("Total autos: "+size);
		
		//Obtenemos Tsuru
		String miAuto = cars.get(3);
		System.out.println("Mi auto favorito: "+miAuto);
		
		//Eliminar auto "Ford"
		cars.remove(2);
		System.out.println(cars);
		
		//Iterar todos lo elementos en ciclo for
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto: "+cars.get(i));
		}
		
		//otra forma de iterar con for
		for(String car: cars) {
			System.out.println("Auto "+car);
		}
		
		//Tercer forma de iterar usando forEach
		cars.forEach(car ->{
			System.out.println("Autos en forEach "+car);
		});
	
		//Inicializar un ArrayList usando una subclase anonima
		ArrayList<Integer> calificaciones =
				new ArrayList<Integer>() {{add(9);add(10);add(8);}};
	}
	
	
}
