package mx.org.generation;

public class Aritmetica {
	
	// Definimos los atributos de la clase
	int a;
	int b;
	
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
