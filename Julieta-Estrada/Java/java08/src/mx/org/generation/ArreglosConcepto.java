package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		//Para definir un arreglo, se utilizan corchetes
				//Estos pueden ir antes o después del tipo de dato
				int edades[] = new int[5];
				//int[] edades = new int[5]; //También es válido
				String[] nombres = new String[5];
				
				//Para modificar un elemento, indicar en corchetes
				// el índice del elemento, primer indice = 0;
				edades[1] = 20;
				nombres[2] = "Carlos";
				nombres[1] = "Melissa";
				nombres[4] = "Gera";
				nombres[0] = "Yos";
				
				//System.out.println(edades);
				//System.out.println(nombres);
				
				//¿Qué sucede?
				//Genera un error en tiempo de ejecución
				//edades[10] = 24;
				
				for (int i = 0; i < nombres.length; i++) {
					String nombre = nombres[i];
					System.out.println(nombre);
				}
				
				//A petición de Danitza
				//Inicializar un arreglo con datos
				String frutas[] = {"Naranja", "Melón", "Mango", "Uva"};
				for (int i = 0; i < frutas.length; i++) {			
					System.out.println(frutas[i]);			
				}
				System.out.println(frutas.length);

				///Para crear matrices
				//Primer corchete es fila[F]
				//Segundo corchete es columna [C]
				int animales[][] = new int [3][4];
				animales [0][2]=20;
	}

}
