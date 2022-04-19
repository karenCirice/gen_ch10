package mx.org.generation;

public class Oop_prueba {
	int atributo; // Es atributo cuando es dentro del clase
	

	//metodo 
	public static void main(String[] args) {
		/**
		 * Definimos 2 variebles locales
		 * cada atributo es una variale, pero una variable 
		 * solo se considera atributo si es miembreo de uns clase
		 * var no se pude utilizar en atributo
		 */
		int numA; // es variable cuando esta dentro de un metodo
		int numB;
		
		Aritmetica operaciones = new Aritmetica();
		int resultado = operaciones.sumarconArgumentos(4,6); //Argumentos: los datos que le pasamos
		//parametros: son los que definimos
		
		System.out.println(resultado);
		System.out.println(operaciones.sumarConReturn());
		
		Aritmetica Calculadora = new Aritmetica();
		
		otroMetodo();
		
	}
	
	/**
	 * PAra que pueda ser usado este metodo en static main
	 * este metodo tambien debe ser de tipo static.
	 */
	

	static void otroMetodo() {
		System.out.println("Se ejecuta otr metodo");
	}
}
