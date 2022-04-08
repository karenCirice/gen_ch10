package mx.org.generation;

import java.util.Iterator;

public class ArreglosConcepto {

	public static void main(String[] args) {
		//para definir un arreglo se itilizan corchetes
		//estos pueden ir antes o despues del tipo de dato
		int edades[] = new int[5];
		String[] nombres = new String[5];
		
		//para modificar un elemento, indicar el corchetes
		//el índice del elemento, primer indice = 0;
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melisa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		for(int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		System.out.println("\n");
		
		//Ejemplo de arreglo con datos previamente puestos:
		
		String frutas[] = {
				"Naranjas",
				"Melón",
				"Mango",
				"Uvas"
		};
		
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		
		System.out.println("\n");
		
		//Para crear una matriz el primer corchete es [F]ila y el segundp es [C]olumna
		
		int animales[][] = new int[3][4];
		animales[0][2] = 20;
		System.out.println(animales[0][2]);
	}
}