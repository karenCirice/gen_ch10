package my.org.generation;

public class Aritmetica  {
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
	
	//definimos un metodo con retorno y argumentos 
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a+b;
		return resultado;
	}
	
	//Pertenece a  la libreria Math de Java 
	//usar el random te devuelve un valor dobuble positivo que es igual o mayor a 0.0 pero menor a 1.0
	double usoDeRandom(int limiteSup){
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
}
