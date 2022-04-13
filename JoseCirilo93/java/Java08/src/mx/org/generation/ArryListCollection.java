package mx.org.generation;

import java.util.ArrayList;

public class ArryListCollection {

	public static void main(String[] args) {
		//Una lista es una coleci�n ordenada
		//la cual permite elementos duplicados
		//El contenido de ArrayList puede ser dinamico
		//Puede aumentar su tama�o
		
		//Definimos un ArrayList de tipo String
		//Entre <> se define el tipo de dato envolvente 
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Tsuru");
		System.out.println(cars);
		
		//Obtenemos el tama�o de ArrayList
		int size = cars.size();
		System.out.println("Total autos : "+ size);
		
		//Obtenemos el dato de "Tsuru"
		String miAuto = cars.get(4);
		System.out.println("Mi auto rom�ntico: "+miAuto);
		
		//Eliminar el auto "ford"
		cars.remove(2);
		System.out.println(cars);
		
		//Iterar todos los elementos en ciclo for.
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Te regalo el auto :"+ cars.get(i));
			 
		}
		
		//Otra Forma de itear con for
		for (String car : cars) {
			System.out.println("Auto"+car);
		}
		
		cars.forEach(car ->{
			System.out.println("Auto en forEach: "+car);
		});
		
		//Inicializar un ArraList usando una subclase  anonima
		ArrayList<Integer> calificaciones =
				new ArrayList<Integer>() {{add(9);add(10);add(8);}};
		
		
	}

}
