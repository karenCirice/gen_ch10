package mx.org.generation;

public class Aritmetica {
	//Definimos los atributos de la clase 
	int a;
	int b;
	
	//definimos un metodo sin retorno (void)
	
	void sumar( ) {
		int resultado = a + b;
		System.out.println("La suma es :" + resultado);
	}
	
	//Definimos un metodo con retornos
	//Y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //return devuelve solo un valor
	}
	
	//Definimos un metodo con retorno
		// con rgumentos de entrada
		
		int sumarConArgumentos(int x, int y) {
			a = x;
			b = y;
			int resultado = a + b;
			return resultado;
		}
		
		//Definimos un metodo de la libreria Math de java
		double usoDeRandom(int limiteSup) {
			double numeroRandom = Math.random() * limiteSup;
			return numeroRandom;
		}
}


