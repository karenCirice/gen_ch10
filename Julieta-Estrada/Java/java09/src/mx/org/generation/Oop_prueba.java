package mx.org.generation;

public class Oop_prueba {
	//int atributox; es una variable pero se llama atributo 
	//int atributoy; es una variable pero se llama atributo 
	
	public static void main(String[] args) {
		/*
		 * Definimos 2 variables locales
		 * cada atributo es una variable, pero una variable
		 * solo se considera atributo si es miembro de una clase
		 * "var" no se puede utilizar en atributos 
		 */
		
		int numA; //Esto es una variable
		int numB; //Esto tmabien es una variable
		
		Aritmetica operaciones = new Aritmetica();
		//le llamamos argumentos a los datos 
		//que le pasamos a nuestro métodos
		int resultado = operaciones.sumarConArgumentos(4, 6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
	}

}
