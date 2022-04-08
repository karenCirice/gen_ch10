package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	int a;
	int b;
	
	/**
	 * Constructor sin parametros()
	 * Los constructores no devuelven valor alguno
	 * no se le indica un tipo de retorno, tampoco la 
	 * palabra void
	 * 
	 * Se le indica un modificador de acceso: Public
	 * Cuando se crea un objeto, los parentesis llaman al
	 * constructor
	 */
	public Aritmetica() {
		System.out.println("Ejecutando constructor");
	}
	
	//Definimos un metodo sin retorno (void)
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: "+resultado);
	}
	
	//Definimos un metodo con retorno
	// y sin argumentos
	int sumarConReturn() {
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}
	
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}
	
}
