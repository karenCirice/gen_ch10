package mx.org.generation;

public class Aritmetica {
	// Definimos los atributos de la clase
	int a;
	int b;
	
	//Definimos metodos sin retorno (void)
	// y sin argumentos
	
	void sumar () {
		int resultado = a + b;
		System.out.println("La suma es : " + resultado);
	}
	//Definimos metodos con retorno
		// y sin argumentos
	int  sumarConReturn(){
		 int resultado = a+ b;
		 return resultado; // return devuelve 1 solo valor
	 }
	//Definimos un metodo con retorno
	//Con argumentos de entrada
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}
	//Definimos un metodo de la libreria Math de Java
	double usoDeRandom(int limiteSup){
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
}
