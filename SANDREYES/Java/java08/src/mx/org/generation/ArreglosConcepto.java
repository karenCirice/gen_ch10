/**
 * 
 */
package mx.org.generation;

import java.util.Iterator;

/**
 * @author DELL
 *
 * 6 abr. 2022
 */
public class ArreglosConcepto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //PARA DEFINIR UN ARREGLO SE UTILIZAN CORCHETES
		// ESTOS PUEDEN IR ANTES O DESPUÉS DEL TIPO DE DATO
		
		int edades []=new int[5];
		//int[] edades=new String[5]; //También es Válido
		String[] nombres = new String[5];
		// PARA MODIFICAR UN ELEMENTO, INDICAR EN CORCHETES
		// EL INDICE DEL ELEMENTO, PRIMER INDICE=0;
		edades[1]=20;
		nombres[2]="Carlos";
		nombres[1]="Melisa";
		nombres[4]="Gera";
		nombres[0]="Yos";
		
		//¿QUE SUCEDE?
		//GENERA UN ERROR EN TIEMPO DE EJECUCIÓN
		// edades[10]=24;  //ERROR EN TIEMPO DE EJECUCIÓN
		
		for (int i = 0; i< nombres.length; i++) {
			String nombre=nombres[i];
			System.out.println(nombre);
		}
		
		//A PETICIÓN DE DANITZA
		//INICIALIZAR UN ARREGLO CON DATOS
		String frutas[] = {"Naranja","Melón","Mango","Uva"};
		for (int i=0; i<frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		System.out.println(frutas.length);
			
	    System.out.println(edades);
		System.out.println(nombres);
		
		//PARA CREAR MATRICES
		//PRIMER CORCHETE ES [F]ILA
		//SEGUNDO CORCHETE ES [C]OLUMNA
		//RECUERDA FELIZ CUMPLEAÑOS ->GABY !!!
		int animales [][] = new int [3][4];
		animales[0][2]=20;
		
		
	}

}
