package mx.org.generation;

public class ArreglosConcepto {
	
	public static void main(String[] args) {
		//Para definir un arreglo se utilizan corchetes.
		//Estos pueden ir antes o después del tipo de dato
		int edades[] = new int[5];
		String[] nombres = new String[5];
		
		//Para modificar un elemento, indicar en corchetes
		// el índice del elemento; primer índice =0
		edades[1] = 20;
		nombres[0] = "Carlos";
		nombres[1] = "Melissa";
		nombres[2] = "Gera";
		nombres[3] = "Joss";
		nombres[4] = "Alondra";
		
		//System.out.println(edades);
		//System.out.println(nombres);
		//edades[10] = 24;
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		//Para crear matrices
		//Primer corchete es [F]ila
		//Segun corchete es  [C]olumna
		//Recuerda el Feliz Cumpleaños
		int animales[][] = new int [3][4];
	}
}
