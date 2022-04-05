package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	int a;
	int b;
	
	//definimos metodos sin retorno (void)
	//y sin argumentos
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}
	
	//definimos un método con retorno
	//y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //devuelve un solo valor
	}
	
	//definimos un metodo con retorno
	//con argumentos de entrada
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}
	
	double usoDeRandom(int limiteSup){
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
}
