package mx.org.generation;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		/*
		 * A List is a collection order which allows duplicate elements 
		 * the content of ArrayList can be dynamic can increase its size
		 * we define a Array of type List
		 * Between <> the enclosing data type is defined
		*/
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Tsuru");
        System.out.println(cars);

        //Now we get the length of ArrayList:
        int size = cars.size();
        System.out.println("Total autos :" + size);
        
        //now we get the data:
        String miAuto = cars.get(4);
        System.out.println("Mi auto romántico: "+miAuto);
        
        //Remove the  "Ford"
        cars.remove(2);
        System.out.println(cars);
        
        //Utterer all elements in "for" cycle:
        for (int i = 0; i < cars.size(); i++) {
                System.out.println("Te regalo el auto :" + cars.get(i));
        }
		//second form to utterer
        for (String car : cars) {
        	System.out.println("Auto " + car);
        }
        //Third form:
        cars.forEach(car ->{
        	System.out.println("Autos en forEach: " + car);
        });
        
        //inicializar un array usando una subclase anónima 
        ArrayList<Integer> calificaciones = new ArrayList<Integer>() {{add(9);add(10);add(8);}};
	}

}
