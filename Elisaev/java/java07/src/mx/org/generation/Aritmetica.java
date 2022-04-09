package mx.org.generation;

public class Aritmetica {
	// definimos los atributos de la clase

	int a;
	int b;

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

	// definimo un metodo de retorno
	// con argumentos de entrada
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
