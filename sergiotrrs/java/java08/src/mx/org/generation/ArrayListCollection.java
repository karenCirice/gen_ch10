package mx.org.generation;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		//Una lista es una colección ordenada
		//la cual permite elementos duplicados
		//El contenido de ArrayList puede ser dinámico
		//Puede aumentar su tamaño.
		
		//Definimos un ArrayList de tipo String
		//Entre <> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		//Obtenemos el longitud de ArrayList
		int size = cars.size();
		System.out.println("Total autos :" + size);
		
		//Obtenemos el dato "Tsuru"
		String miAuto = cars.get(4);
		System.out.println("Mi auto romántico: "+miAuto);
		
		//Eliminar el auto "Ford"
		cars.remove(2);
		System.out.println(cars);
		
		//Iterar todos los elementos en ciclo for
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto :" + cars.get(i));
		}
		
		//Segunda forma de itear con for
		for (String car : cars ) {
			System.out.println("Auto "+ car);
		}
		
		//Tercer forma de iterar usando forEach
		cars.forEach(car ->{
			System.out.println("Autos en forEach: "+ car);
		});	
		
		//Inicializar un ArrayList usando una subclase anónima
		ArrayList<Integer> calificaciones = 
				new ArrayList<Integer>() {{add(9);add(10);add(8);}};
		
		
	}

}
