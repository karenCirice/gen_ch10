package mx.org.generation;

public class ArreglosConceptos {

	public static void main(String[] args) {
		//para definir un agrreglo, se utilizan corchetes
		//EStos pueden ir antes o despues del tipo de dato
		int edades[] = new int [5]; //puede ser arreglo string u otro. Los corchetes pueden estar antes o despues de la variable
		String[] nombres = new String [5];
		
		
		//Para modificar un elemento indicar en corchetes en indice del elemento
		//El indice del elemento es 0
		edades[1] = 20; //en el indice 1 le asignamos 20
		nombres[2] = "Carlos"; //en el indice 2 se le asigna nombres
		nombres[1] = "Melissa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		//Que sucede?
		//edades[10] = 24;
		//
		//System.out.println(edades);
		//System.out.println(nombres);
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres [i]; //aqui se extrae nombre por nombre, por eso esta en singular
			System.out.println(nombre);
			
			
			//Inicializar un arreglo con datos
			String frutas[] = {"Naranja", "Melon", "Mango", "Uvas"};
			for (int j = 0; j < frutas.length; j++) {
				System.out.println(frutas [j]);
			}
			System.out.println(frutas.length);
			
			//Para crear matrices
			//Primer corchete es [F]ila (horizontal)
			//Segundo corchete es [C]olumna (vertical)
			int animales[][]=new int [3][4];
			animales[0][2] = 20;
			
			//Otra forma de itear con for
			for (String car : cars) {
				System.out.println("Auto "+car);
			}	
				
				//tercera forma de iterar usando for Each
				cars.forEach(car ->){
					System.out.println("Autos en forEach: "+ car);
				});
				}
			}
		}
		
	}

}
