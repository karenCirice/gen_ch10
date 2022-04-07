package mx.org.generation;

public class ArreglosConcepto {
	public static void main(String[] args) {
		//para definir un arreglo, se utilizan corchetes
		//Estos puedenn ir antes o despues del tipo de arreglo
		int edades[] = new int[5];
		//int edades[] = new int[5]; //Tambien es valido
		String[] nombres = new String[5];
		//Para modificar un elemento , indicar en corchotyes
		//El inidice del elemento, primer inidice = 0;
		//String[] frutas = new String[4];
		
		
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melissa";
		nombres[4] = "Gera";
		nombres[0] = "Yoscelin";
		//Que sucede
		//edades[10]= 24;
		//Sucede un error
		
		
		
		//System.out.println(edades);
		//System.out.println(nombre);
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		// A peticion de danitzia
		//Inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melon", "Mango", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]) ;
			
		}
		System.out.println(frutas.length);
		
		//Para crear matrices
		//Primer corchete es [F]ila
		//Segundo corchete es [C]olumna
		//Recuerda Feliz cumpleaños => Gaby
		int animales[][] = new int [3][4];
		
		animales[0][2] = 20;
		

}
}
