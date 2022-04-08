/**
 * 
 */
package mx.org.generation;


public class ArreglosConcepto {

	public static void main(String[] args) {
		//para definir un arreglo, se utilizaban corchetes
		//Estos pueden ir antes o después del tipo de dato
		int edades[] = new int [5];
		String [] nombres = new String[5]; //puedes poner los brackets antes del nombre o despues del nombre dl array
		
		//Para modificar un elemento, indicar entre corchetes
		//el índice del elemento, primer indice =0
		edades[1]=20;
		nombres[0] = "aline";
		nombres[2] = "grace";
		nombres[3]= "laura";
		nombres[4] = "alice";
		
		//System.out.println(edades);
		//System.out.println(nombres);
		
		//Que sucede?
		//edades[10] = 24;
		//Genera un error en tiempo de ejecución
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
	//A peticion de Daniza
	//Inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melon", "Mango", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
			}
		System.out.println(frutas.length);
		
		// PAra crear matrices
		//Primer corchete [F]ila
		//Segundo corchete es [C]olumna;
		int animales[][]=new int[3][4];
		animales[0][2]=20;
		
	}

}
