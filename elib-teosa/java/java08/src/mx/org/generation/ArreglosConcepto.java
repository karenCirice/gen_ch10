package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		// Para definir un arreglo se utilizan corchetes
		// Estos pueden ir antes o despues del tipo de dato
		// ambas formas son válidas
		int edades[] = new int[5];
		String[] nombres = new String[5];
		
		//Para modificar un elemento, indicar en corchetes
		// el indice del elemento, primer indice 0
		edades[1] = 20;
		nombres[0] = "Yos";
		nombres[1] = "Melissa";
		nombres[2] = "Carlos";
		nombres[4] = "Gera";
		
		// Genera un error en tiempo ejecución por fallas en la lógica
		//edades[10]=24; 
		
//		System.out.println(edades);
//		System.out.println(nombres);

		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		//Inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melón", "Mango", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		
		// Imprime el tamaño del arreglo
		System.out.println(frutas.length);
		
		// Para crear matrices
		// PRimer corchete es fila
		// Segundo corchete es columna
		int animales[][] = new int[3][4];
		animales[0][2]=20;
	}

}
