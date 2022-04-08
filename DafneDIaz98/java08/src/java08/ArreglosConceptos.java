package java08;

public class ArreglosConceptos {
	
	public static void main (String[] args) {
		//Para definir un arreglo se utilizan corchetes
		//Estos pueden ir antes o despues del tipo de dato
		int edades[] = new int [5];
		String[] nombres = new String[5];
		System.out.println(edades);
		System.out.println(nombres);
		
		edades[1] = 20;
		nombres[2] = "melisa";
	    nombres[1] = "gera";
	    nombres[4] = "yos";
	    nombres[0] = "yo";
	    
	    for (int i = 0; i < nombres.length; i++) {
	    	String nombre = nombre[i];
	    	Ssytem.out.println(nombre);
		
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
