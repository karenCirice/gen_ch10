package mx.org.generation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArreyListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*una lista es una coleccion ordenada la cual
		permite elementos duplicados.
		El contenido de ArrayList puede ser dinámico*/
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		
		/*obtener longitud (cuántos elementos tiene, no confundir con capacidad que es cuántos elementos puede tener límite el array)*/
		int size=cars.size();
		System.out.println("total de longitud: "+size);
		
		/*obtener el dato ford*/
		String miAuto=cars.get(2);
		System.out.println("Mi auto es "+miAuto);
		
		/*eliminar un elemento del arraylist*/
		cars.remove(0);
		System.out.println(cars);
		/*tener cuidado de refrescar la variable size porque conserva valor anterior*/
		System.out.println(size);
		
		/*iterar todos los elementos del arreglo*/
		System.out.println("Tus autos son:");
		for (int i = 0; i < cars.size(); i++) { 
			System.out.println(cars.get(i));
			
		}
		
		/*otra forma de iterar */
		for (String car : cars) {
			System.out.println("Auto "+ car);
			
		}
		
		/*usando for each*/
		cars.forEach(car->{
			System.out.println("Autos foreach"+car);
		});
		
		/*crear otro array list agregando ahí mismo elementos*/
		ArrayList <Integer> calif = new ArrayList<Integer>() {{add(9);add(10);add(8);} };
	}

}
