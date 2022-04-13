package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase	
	int a;
	int b;
	
	/**
	 * El nombre del constructor debe ser IDENTICO a la clase
	 * Contructor sin parámetros()
	 * Los constructores no devuelven valor alguno, no se le indica
	 * un tipo de retorno, tampoco la palrba void.
	 * 
	 * Se le indica un modificador de acceso: Public.
	 * Cuando se crea un objeto, los parentesis llaman al constructor
	 * ej. Aritmetica operaciones = new Aritmetica();
	 */
	Aritmetica(){
		System.out.println("Ejecutando constructor");
	}
	
	
	//Definimos un método sin retorno (void)
	//y sin argumentos
	void sumar() {
		int resultado  = a + b;
		System.out.println("La suma es :"+resultado);
	}
	
	//Definimos un método con retorno
	// y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; // return devuelve 1 solo valor
	}
	
	//Definimos un método con retorno
	// con argumentos de entrada
	/**
	 * Suma dos números y se devuelve el resultado
	 * @param x primer número a sumar
	 * @param y segundo número a sumar
	 * @return el resultado de la suma
	 * int x e int y son mis parámetros del método.
	 */
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}
	
	//Definimos un método de la librería Math de Java
	/**
	 * 
	 * @param limiteSup
	 * @return
	 */
	double usoDeRandom(int limiteSup){
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
	
		
}
