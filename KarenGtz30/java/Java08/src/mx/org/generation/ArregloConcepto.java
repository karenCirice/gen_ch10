package mx.org.generation;

public class ArregloConcepto {

	public static void main(String[] args) {
		//Para definir un arreglo, se utilizan corchetes
		//Estos pueden ir antes o despues del tipo de dato

	/*	int edades[] = new int[5]; //esta es una forma para definir un arreglo en java
		//int[] edades = new int[5]; //es decir, esto tambien es valido
		String[] nombres = new String[5]; //esta es otra forma para definir un arreglo en java
		
		//Para modificar un elemento, indicar en corchetes el indice del elemento, primer indice es cero
		edades[1] = 20;
		nombres[0] = "Karen";
		nombres[1] = "Alex";
		nombres[2] = "Meredith";
		nombres[3] = "Eiden";
		
		System.out.println(edades); //el resultado que da aqui es la referencia dell arreglo, es decir el espacio en memoria donde se encuentra.
		System.out.println(nombres);
		//el valor por default de los int es 0, y del string es null
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre); //la linea de arriba no es completamente necesaria, con solo imprimir nombres[i]
		}
	*/
		
		String frutas[] = {"Naranja", "Melon", "Mango", "Uvas", "Manzana"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		System.out.println(frutas.length);
		
		//Para crear matrices
		//Primer corchete es [F]ila
		//Segundo corchete es [C]olumna
		//Recordar Fight Club <-- Movie
		int animales[][] = new int[3][4];
		animales[0][2] = 20; //para agregar el 20 en esa posicion de la matriz
	}

}
