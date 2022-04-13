package mx.com.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		
		//Para definir un arreglo, se utilizan corchetes
		//Estos pueden ir antes o después del tipo de dato
		int edades[] = new int[5];
		//int[] edades = new int[5];
		String[] nombres = new String[5];
		
		//Para modificar un elemento, indicar en corchetes
		//el índice del elemento, primer indice = 0;
		edades[1] = 20;
		nombres[0] = "Yos";
		nombres[1] = "Melissa";
		nombres[2] = "Carlos";
		nombres[4] = "Gera";
		
		//Qué sucede?
		//edades[10] = 24;
		
		System.out.println(edades);
		System.out.println(nombres);
		
		for(int i=0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		//A petición de Danitza
		//Inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melón", "Mango", "Uva"};
		for(int i=0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		System.out.println(frutas.length);
		
		//Para crear matrices
		//Primer corchete es [F]ila
		//Sefundo corchete es [C]olumna
		//Recuerda Feliz Cumpleaños
		int animales[][] = new int[3][4];
		animales[0][2] = 20;
		System.out.println(animales[0][2]);
		
	}

}
