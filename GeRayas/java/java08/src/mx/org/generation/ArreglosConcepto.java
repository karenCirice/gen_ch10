package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		//Para definir un arreglo, se utilizan corchetes
		//Estos pueden ir antes o despues del tipo de dato
		int edades[] = new int[5];
		String[] nombres = new String[5];
		
		//Para modificar un elemento, indicar en corchetes
		//El indice del elementro, primer indice = 0;
		
		edades[1]= 20;
		nombres[2]="Carlos";
		nombres[1]="Melissa";
		nombres[4]="Gera";
		nombres[0]="Yos";
		
		//¿Que sucede?
		//edades[10] = 24;
		//Genera un error en tiempo de ejecucion
		
		//System.out.println(edades);
		//System.out.println(nombres);
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		//Inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melon","Mango"};
		
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
			
		}
		System.out.println(frutas.length);
		
		
		//Para crear matrices
		//primer corchete es [F]ila
		//segundo corchete es [C]olumna
		int animales[][] = new int[3][4];
		animales[0][2] = 20;
}
	}
