package mx.org.generation;
/**
 * 
 * @author GABRI
 *
 */
public class Aritmetica {
	
	//Definimos los atributos de la clase
	int a;
	int b;
	
	//Definimos un método sin retorno(void)
	//y sin argumentos
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}
	
	//Definimos un método con retorno
	// y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado;
	}
	
	//Definimos un método con retorno
	// con argumentos de entrada
	int sumaConArgumentos(int x,int y) {
		a = x;
		b = y;
		int resultado = a+b;
		return resultado;
	}
	
	//Definimos un método de la librería Math de java
	double usoDeRandom(int limiteSup){
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
}
