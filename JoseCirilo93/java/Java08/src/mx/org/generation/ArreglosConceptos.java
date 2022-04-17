package mx.org.generation;

public class ArreglosConceptos {

	public static void main(String[] args) {
		//Para definir un arreglo, se utiliza corchetes
		//Estos pueden ir antes o desp�es del tipo de dato
		int edades[] = new int[5];
		//int[] edades = new int[5]; //Tambien es valido
		String[] nombres = new String[5];
		
		//Para modificar un elemento, indicar en corchetes
		//el indice del elemento, primer indice = 0;
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melissa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		//System.out.println(edades);
		//System.out.println(nombres);
		
		//�Qu� sucede?
		//Genera un error en tiempo de ejecuci�n
		//edades[10] = 24;
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		//A petici�n de Danitza
		//Inicializar un arreglo con datos
		String frutas[] = {"Naranja","Mel�n","Mango", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
				System.out.println(frutas[i]);
		}
		System.out.println(frutas.length);
		
		//Para crear matrices
		//Primer corchetes es [F]ila
		//Segundo Corchete es [C]olumna
		//REcuerda Feliz Cumplea�os -> Gaby!!!!!
		int animales[][] = new int[3][4];
		animales[0][2] = 20;
		
		
		
		
		
	
		
	}

}
