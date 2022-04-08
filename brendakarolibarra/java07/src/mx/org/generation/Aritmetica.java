package mx.org.generation;

public class Aritmetica {

	int a;
	int b;
	
	//Definimos un método sin retorno (void)
	//y sin argumentos
	
	void sumar () {
		int resultado= a + b;
		System.out.println("La suma es:" + resultado);
	}
	
	
	//Definimos un metodo con retorno
	// y sin argumentos
	
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}
	
	//Definimos un método con retorno 
	//con argumentos de entrada
	int sumarConArgumentos (int x, int y) {
		a=x;
		b=y;
		int resultado = a+b;
		return resultado;
	}
	
	//Definimos un metodo de la libreria de java 
	double usoDeRamdon(int limiteSup){
		double numeroRandom= Math.random() * limiteSup;
		return numeroRandom;
	}
	
	
	
	
	
	
}
