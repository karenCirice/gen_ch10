package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		// Para definir un arreglo, se utilzaon corchetes
		// estos pueden ir antes o despues del tipo.

		// Formmas de definir un arreglo.
		int edades[] = new int[5]; // se define la longitud del array
		String[] nombres = new String[5];

		// para modificar un elemento, indifcar en corcheter
		// el indice del elemento, pricer indice=0
		edades[1] = 20;
		nombres[2] = "Elisa";
		nombres[3] = "Juan";
		nombres[4] = "ana";
		nombres[0] = "Gera";

		// Error en tiempo ejecucion
		// edades[10] =24

		System.out.println(edades);
		System.out.println(nombres);

		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);

		}

		// inicializar un arreglo con datos
		// for + ctrl + space
		String frutas[] = {"Naranja", "Melón", "Mango", "Uva"};
		for (int i = 0; i < frutas.length; i++) {			
			System.out.println(frutas[i]);			
		}
		System.out.println(frutas.length);

		
		//para crear matrices
		//primer corchete es la [f]ila
		//segundo corchete es [C]olumnas
		
		int animales[][] = new int[3][4];
		animales[0][2] = 20;
		
		
	}
}
