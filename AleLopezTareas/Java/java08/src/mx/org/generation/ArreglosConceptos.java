package mx.org.generation;

public class ArreglosConceptos {

	public static void main(String[] args) {
		// Para definir un arreglo se utiizan corchetes 
		//estos pueden ir antes o después del tipo de dato
		
		int edades[] = new int[5];
		//int[] edades = new int[5]; también es uan declaración válida
		String[] nombres = new String[5];
		
		//para modificar un elemento, indicar en corchetes el índice
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melissa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		//edades[10] = 24; Genera un error en tiempo de ejecución: exception
		
		System.out.println(edades);
		System.out.println(nombres);
		
		for (int i = 0; i < nombres.length; i++) {
			String names = nombres[i];
			System.out.println(names);
			//System.out.println(nombres[i]);
		}
		
		
		//inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melón", "Mango"," Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		System.out.println(frutas.length);
		
		//para crear matrices
		//primer corchete es fila
		//segundo corchete es columna 
		
		int animales[][] = new int [3][4];
		animales[0][2]=20;
		
		}

}
