package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		// Para definir un arreglo se usan corchetes
		//Pueden ir antes o despues del tipo de datos
		int edades[]= new int[5];
		String[] nombres = new String[5]; 
		
		//Para modificar un elemento, indicar en corchetes
		// el indice del elemento, primer indice = 0;
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melissa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		//System.out.println(edades);
		//System.out.println(nombres);
				
		for(int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		//inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melon", "Mango", "Uva"};
			for (int i = 0; i < frutas.length; i++) {
				System.out.println(frutas[i]);
			}
		System.out.println(frutas.length);
		
		//Para crear matrices
		//Primer corchete es [F]ila
		//Segundo corchete es [C]olumna
		//Recuerda Feliz Cumpleaños
		int animales[][] = new int[3][4];
	}

}
