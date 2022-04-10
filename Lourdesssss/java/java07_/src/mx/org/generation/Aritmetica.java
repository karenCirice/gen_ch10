package mx.org.generation;

public class Aritmetica {
	//define the attributes of the class
	
	int a;
	int b;
	
	//Define a method without return (void)and without arguments
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: "+resultado);
	}
	
	//Define a method without return and without arguments
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //return = 1 value only
	}
	//We define the method with a return and input arguments
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

