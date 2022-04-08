package mx.org.generation;

public class ArreglosConcepto {

	public static void main(String[] args) {
		// Para definir un arreglo se utilizan corchetes
		//estos pueden ir antes o despues del tipo de dato
		//los arreglos pueden cambiar su contenido pero no su extensión 
		int edades[]= new int[5]; //se instancia el arreglo de 5 espacios
		String[] nombres = new String[5]; //se pueden poner los [] antes o después
		
		//Para modificar un elemento, indicar en corchetes
		//el índice del elemento, primer índice = 0;
		edades[1] = 20;
		nombres[2] = "Carlos";
		nombres[1] = "Melisa";
		nombres[4] = "Gera";
		nombres[0] = "Yos";
		
		//System.out.println(edades);
		//System.out.println(nombres);
		
		//¿Qué sucede?
		//esto genera un error
		//edades[10]=24; //nos da un error en tiempo de ejecución (exception) porque está fuera del límite de longitud dado al arreglo
		
		for (int i = 0; i < nombres.length; i++) {
			String nombre = nombres[i];
			System.out.println(nombre);
		}
		
		//Inicializar un arreglo con datos
		String frutas[] = {"Naranja", "Melón", "Mango", "Uva"};
		for (int i = 0; i < frutas.length; i++) {
			String string = frutas[i];
			System.out.println(frutas[i]);
		}
		System.out.println(frutas.length); //se usa el método length para imprimir su longitud
		
		//Para crear matrices
		//Primer corchete es [F]ila
		//Segundo corchete es [C]olumna
		int animales[][]= new int [3][4];
		animales[0][2]=20;
		

	}

}
