package mx.org.generation;

public class Oop_prueba {

	public static void main(String[] args) {
		/**
		 * Definimos 2 variables locales
		 * cada atributo es una variable, pero una variable
		 * solo se condiera atributo si es miembro de una clase
		 * "Var" no se puede utilizar en atributos
		 */
		int numA;
		int numB;
		
		Aritmetica operaciones = new Aritmetica();
		int resultado = operaciones.sumarConArgumentos(4, 6);
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica calculadora = new Aritmetica();
		
		otroMetodo();

	}
	
	static void otroMetodo() {
		System.out.println("Otro método");
	}
}
