package mx.org.generation;

public class Aritmetica {
	// definimos los atributos de la clase

	int a;
	int b;

	/**
	 * Constructor sin parametros()
	 * Los constructores no devuelven valor alguno, no se le indica 
	 * un tipo de retorno, tampoco la palabra void
	 * 
	 * Se le indica un modificador de acceeso:Public.
	 * Cuando se crea un objeto, los parentesis llama al constuctor
	 * 
	 */
	
	
	Aritmetica() {
		System.out.println("Ejecutando constructor");
	}
	
	
	
	
	// Definimos un metodo sin retorno (void)

	void suma() {
		int resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}

	// Definimos un metodo con retorno
	// y sin argumentos

	int sumarConReturn() {
		int resultado = a + b;
		return resultado; // return solo devuelve un solo valor.

	}

	// definimos un metodo de retorno
	// con argumentos de entrada
	/**
	 * 
	 * @param x primer numero a sumar
	 * @param y segundo numero a sumar
	 * @return el resultado de la suma
	 * int x e int y son mis argumentos del metodo
	 */
	
	
	
	int sumarconArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}

	// Devuelde un numero de o a 1, por eso de multiplica por el 100
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;

	}

}
