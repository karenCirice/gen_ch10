package mx.org.generation;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		//Una lista es una coleccion ordenada
		//La cual permite elementos duplicados
		//El contenido de ArrayList puede ser dinamico
		//Puede aumentar su tama;o
		
		//Definimos un ArrayList de tipo String
		//Entre<> se define el tipo de dato envolvente
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");//donde decia null se pone el String
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		
		//Obtenemos el tama;o del arreglo (longitud)
		int size = cars.size();
		System.out.println("Total autos :" + size);
		
		//Obtenemos ed dato "Tsuru"
		String miAuto = cars.get(4);
		System.out.println("Mi auto romantico "+miAuto);
		
		//Eliminamos el auto "Ford"
		cars.remove(4);
		System.out.println(cars);
	
		//Interar todos los elementos en ciclo for.
		for (int i = 0; i < cars.size(); i++) {
		}
	}

}
