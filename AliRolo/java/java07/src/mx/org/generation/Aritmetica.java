package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	
	int a;
	int b;
	
	//definimos un metodo sin retorno (void)
	//sin argumentos
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: "+resultado);
	}
	
	//definimos un metodo con retorno
	//y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}
	//definimos un m�todo con retorno
	//Con argumentos de entrada
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a+b;
		return resultado;
	}
	
	//definimos un m�todo de la librer�a Math de Java
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
	
}


