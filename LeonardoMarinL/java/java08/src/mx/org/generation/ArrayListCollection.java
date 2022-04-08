package mx.org.generation;

import java.util.ArrayList;

import javax.swing.plaf.FontUIResource;

public class ArrayListCollection {

	public static void main(String[] args) {
		// una lista es una colección ordenada
		//la cual permite elementos duplicados
		//el contenido de ArrayList puede ser dinámico
		//Puede aumentar su tamaño
		
		//definimos un arrayList tipo string
		//entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		System.out.println(cars);
		
		//obtenemos la longitud de ArrayList
		int size = cars.size();
		System.out.println("Total autos: "+size);
		
		//obtenemos el dato "Tsuru"
		String miAuto = cars.get(4);
		System.out.println("Mi auto romántico: "+miAuto);
		
		//Eliminar el auto Ford
		cars.remove(2);
		System.out.println(cars);
		
		//iterar todos los elementos en ciclo for
		for (int i=0; i<cars.size(); i++) {
			System.out.println("Te regalo el auto: "+cars.get(i));
		}
		
		//segunda forma de iterar con for
		for (String car: cars) { //al crear la variable se le va asignando el valor de cada elemento del arreglo en cada ciclo
			System.out.println("Auto "+car);
		}
		
		//tercera forma de iterar con for
		cars.forEach(car->{
			System.out.println("Autos en forEach: "+car);
		});
		
		//Inicializar un ArrayList usando una subclase anónima
		ArrayList<Integer> calificaciones = 
				new ArrayList<Integer>() {{add(9);add(10);add(8);}};
	}

}
