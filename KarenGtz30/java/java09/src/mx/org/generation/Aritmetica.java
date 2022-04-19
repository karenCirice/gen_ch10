package mx.org.generation;

public class Aritmetica {
		//definimos los atributos de la clase
	int a;
	int b;
	
	Aritmetica() { //funciona con public o sin public
		System.out.println("Ejecutando constructor");
	}
	
		//definimos un metodo sin retorno (Void)
		//y sin argumentos                  SI NO HAY RETORNO LLEVA VOID
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}
	
		//definimos un metodo con retorno
		//y sin argumentos
	int	sumarConReturn() {
		int resultado = a + b;
		return resultado; //return devuelve un solo valor
	}
	
		//Definimos un metodo con retorno
		//con argumentos de entrada
	/**
	 * Suma dos numeros y se devuelve el resultado
	 * @param x primer numero a sumar
	 * @param y segundo numero a sumar
	 * @return el resultado de la suma
	 * int x e int y son mis argumentos del metodo
	 */
	
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
		
	}
		//Definimos un metodo de la libreria Math de Java
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
}
