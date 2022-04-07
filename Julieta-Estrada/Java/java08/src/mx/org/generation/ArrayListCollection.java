package mx.org.generation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		// Una lista es una colección ordenada
		//la cual permite elementos duplicados
		//El contenido de ArrayList puede ser dinámico
		//Ósea que puede amuentar su tamaño 
		
		//Definimos un array de tipo String se tiene
		//que impostar el util.Arraylist 
		//Entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		System.out.println(cars);
		
		//Obtenemos la longitud del ArrayList
		int size = cars.size();
		System.out.println(size);
		
		//Obtenemos un dato
		String miAuto = cars.get(4);
		System.out.println("Mi auto romántico: "+miAuto);
	
		//Eliminar un elemento
		cars.remove(2);
		System.out.println(cars);
		
		//Interar todos los elementos en ciclo for.
		
		for (int i =0; i<cars.size(); i++) {
			System.out.println("Te regalo el auto: "+cars.get(i));
		}
		
		//Segunda forma de interar 
		//Otra forma de interar con for 
		//solo creas una nueva avrible y le dices de dodne jale la info
		for(String car : cars) {
			System.out.println("Auto "+car);
		}
		
		//Tercera forma de interar usando forEach
		cars.forEach(car ->{
			System.out.println("Autos forEach: "+ car);
		});
		
		//Inicializar un Array usando una subclase anonima
		ArrayList<Integer> calificaciones =
				new ArrayList<Integer>() {{add(9);add(10);add(8);}};
	}
	

}
