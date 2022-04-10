package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		// to define a array we use corchetes
		//them could stay before or after of this data type 
		//estas son 2 formas en que podemos definir un array:
		
		//first form:
		int edades [] = new int [5];
		//second form:
		String [] nombres = new String[5];
		
		//para acceder a un elemento, indicar en corchetes 
		//el índice del elemento, primer indice = 0.
		edades[0] = 20;
		nombres[1] = "carlos";	
		nombres[2] = "Melisa";
		nombres[3] = "Gera";
		nombres[4] = "Yoss";
		
		//System.out.println(edades);
		//System.out.println(nombres);

		//Qué sucede?
		//genera un error de ejecucion
		//edades[10]=24;
		
		for(int i=0;i<nombres.length;i++) {
			String nombre= nombres[i];
			System.out.println(nombre);
		}
		
		//Inicializar un arreglo con datos:
		String frutas[] = {"naranja","melon", "melon", "mango", "uva"};
		for(int i = 0; i< frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		System.out.println(frutas.length);
		
		//para crear matrices 
		//El primer corchete es [F]ila 
		//el segundo corchete es [C]olumna
		
		int animales [][] = new int [3][4];
		animales [0][2] = 20;
	}

}
