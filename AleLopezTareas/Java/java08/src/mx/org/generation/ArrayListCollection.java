package mx.org.generation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		// Una lista para coleccion ordenada la cual permite elementos duplicados
		//el contenido de ArrayList pued ser dinámico
		//puede aumentar su tamaño
		
		//definimos un ArrayList de tipo String
		
		ArrayList<String> cars = new ArrayList<String>();
		
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Mazda");
	cars.add("Tsuru");
	System.out.println(cars);
	
	//Obtenemos la longitud del ArrayList
	int size = cars.size();
	System.out.println("total de autos: " + size);
	
	//obtenemos el dato "Tsuru"
	String miAuto = cars.get(4);
	System.out.println("mi auto romántico: "+ miAuto);
	
	//eliminar el auto "Ford"
	cars.remove(2);
	System.out.println(cars);
	
	//Iterar todos los elementos en ciclo for 
	for(int i = 0; i < cars.size(); i++) {
		System.out.println("Te regalo el auto: " + cars.get(i));
	}
	
	//Otra forma de iterar con for 
	for(String car : cars) {
		System.out.println("Auto" + car);
	}
	
	//tercera forma de iterar con for 
	cars.forEach(car ->{
		System.out.println("Autos en forEach: " + car);
	} );
	

	}

}
