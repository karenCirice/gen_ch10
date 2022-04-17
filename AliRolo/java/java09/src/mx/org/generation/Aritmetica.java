package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	
	int a;
	int b;
	
	/**
	 * El nombre del constructor debe ser IDÉNTICO a la clase
	 * Constructor sin parámetros
	 * Los constructores no devuelven valor alguno, no se le indica
	 * un tipo de retorno, tampoco la palabra void.
	 * 
	 * Se le indica un modificador de acceso: Public
	 * Cuando se crea un objeto, los parentesis llaman al constructor
	 * Ej. aritmetica operaciones = new Aritmetica();
	 */
	
	
	public Aritmetica (){
		System.out.println("Ejecutando constructor");
	}
	//definimos un metodo sin retorno (void)
	//sin argumentos
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: "+resultado);
	}
	
	//definimos un metodo con retorno
	//y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}
	//definimos un método con retorno
	//Con argumentos de entrada
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a+b;
		return resultado;
	}
	
	//definimos un método de la librería Math de Java
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
	
}


