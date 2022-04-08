package mx.org.generation;

public class Oop_prueba { //esto es una clase

//	int atributoX;
//	int atributoY; //esto es una variable, pero se llama atributo porque esta en clase
	
	//El nombre del constructor debe ser identico a la clase
	// Constructor sin parametros() <--parentesis vacios
	//Los constructores no devuelven valor alguno, por lo que no hay retorno ni void
	/**
	 * Se le indica un modificador de acceso public.
	 * Cuando se crea el objeto, los parametros llaman al constructor
	 * ej. aritmetica operaciones = new Aritmetica
	 */
	
	public static void main(String[] args) { //esto es un metodo
		//Definimos dos variables locales, cada atributo es una variable, pero una variable solo
		//se considera atributo si es miembro de una clase 
		//"var" no se puede utilizar en atributos
		
		int numA; //Esto se considera variable
		int numB; //Esto se considera variable porque esta dentro del metodo(sinonimo de funcion)
		
		Aritmetica operaciones = new Aritmetica();
		//se les llama argumentos a los datos que le pasamos a nuestro metodo
		int resultado = operaciones.sumarConArgumentos(4, 6);
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());

		Aritmetica caluculadora = new Aritmetica(); //los parentesis son el constructor, por default va vacio
		
		otroMetodo();
	}
	
		static void otroMetodo() {
		System.out.println("Se ejecuta otro metodo");
	}
}
