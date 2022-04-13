package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	int a;
	int b;
	
	//Definimos un m�todo sin retorno (void)
	//y sin argumentos
	void sumar() {
		int resultado = a +b;
		System.out.println("La suma es: "+ resultado);
	}
	
	//Definimos un m�todo con retorno
	// y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}
	
	//Definimos un m�todo con retorno
	//con argumentos de entrada 
	int sumarConArgumentos( int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
		
	}
	
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
}
