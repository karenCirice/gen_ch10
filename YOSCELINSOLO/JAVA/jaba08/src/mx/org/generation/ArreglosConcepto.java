/**
 * 
 */
package mx.org.generation;

/**
 * @author Yoscelín RS
 *6 abr. 2022
 */
public class ArreglosConcepto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Para definir un arreglo, se utilizan corchetes
		//Estos pueden ir antes o despues del dato
		int edades[] = new int[5];  //así se define un arreglo podemos poner el nombre del arreglo antes de los [] y el [5] indica la longitu de mi arreglo
		String[] nombres = new String[5]; //segunda forma de definir un arreglo, con los [] antes del nommbre del arreglo
		
		//Para modificar un elemento, indicar en corchetes
		//el índice del elemento, rpimer índice=0
		
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melissa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		//System.out.println(edades);
		//System.out.println(nombres);
		
		//¿Qué sucede?
		//edades[10] =24;  
		// genera un error en tiempo de ejecución
		
	
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
			
		}
		
		//A petición de Danitza
		//Inicializar un arreglo con datos
		
		String frutas[] = {"Naranja", "Melón", "Mango", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas [i]);
	
			
		}
		System.out.println(frutas.length);
		
		//Para crear matrices [F]ila
		//Segundo corchete es [C]olumna
		//Recuerda Figth Club 
		int animales[][] = new int [3][4];
		animales[0][2] = 20;
				

	}

}
