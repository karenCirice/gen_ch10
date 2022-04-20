package mx.org.generation;

public class Aritmetica {
	
	// Definimos los atributos de la clase
	int a;
	int b;
	
	/**
	 * Constructor sin parametros
	 * Los constructores deben ser nombrados exactamente con el mismo nombre
	 * que lleva la clase
	 * Los constructores no devuelven valores por lo que no se le indica ningun
	 * tipo de retorno, tampoco la palabra void
	 * 
	 * Cuando se crea el objeto, los parentesis llaman al contructor
	 * ej. Aritmetica operacions = new Aritmetica();
	 */
	Aritmetica(){
		System.out.println("Ejecutando constructor");
	}
	
	// Definimos los metodos de la clase
	// metodo sin retorno (void) y sin argumentos
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}
	
	// metodo con retorno y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado;
	}
	
	// DEfinimos un método con retorno 
	// con argumentos dde entrada
	/**
	 * Suma dos números y devuelve el resultado
	 * @param x primer número a sumar
	 * @param y segundo número a sumar
	 * @return el resultado de la suma
	 * int x e int y  son mis argumentos del método.
	 */
	int sumarConArgumentos(int x, int y) {
		a=x;
		b=y;
		int resultado = a + b;
		return resultado;
	}
	
	// Definir un metodo usando la funcion random de la clase Math
	double usoDeRandom(int limiteSuperior){
		double numeroRandom = Math.random()*limiteSuperior;
		return numeroRandom;
	}
}
