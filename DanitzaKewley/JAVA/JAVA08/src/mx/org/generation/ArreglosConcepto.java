package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		//Para definir un arreglo, se utilizan corchetes
		//Estos pueden ir antes o después del tipo de dato
		int edades[] = new int[5];
		//int[] edades = new int[5]; //También es válido
		String[] nombres = new String[5];
		
		//Para modificar un elemento, indicar en corchetes
		//El indice del elemneto, primer indice = 0;
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melisa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		
		
		//System.out.println(edades);
		//System.out.println(nombres);
				
		//¿Qué sucede?
		//edades[10] = 24; //Miestra un error en tiempo de ejecucion
		//los errores de ejecucion ocurren cuando ya se esta ejecutando el prograaa 
		//y JAVA se da cuenta que algo no es posible de realizar 
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		//A petición de Danitza
		//Inicializr un arreglo con datos
		String frutas[] = {"Naranja", "Melon", "Manago","Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		//Como frutas es un arreglo y los arreglos son metodos podemos poner . frutas
		System.out.println(frutas.length);
		
		//Para crear matrices
		//Primer corchete es [F]ila
		//Segundo corchete es [C]olumna
		//Recuerda Feliz Cumpleaños!
		int animales [][] = new int [3][4];
		animales[0][2] = 20;
		
	}

}
