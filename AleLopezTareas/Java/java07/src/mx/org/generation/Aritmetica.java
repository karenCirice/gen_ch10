package mx.org.generation;

public class Aritmetica {
	
	int a;
	int b;
	
	//definimos método sin retornpo void, y sin RGUMENTOS
	
	void sumar() {
		int resultado= a+b;
		System.out.println("La suma es: "+ resultado);
	}
	
	//DEFINIMOS UN METODO CON RETORNO
	int sumarConReturn(){
		int resultado= a+b;
		return resultado;
	}
	
	//DEFINIMOS CON ARGUMENTOS CON RETORNO 
	
	int sumarConArguementos(int x, int y) {
		a=x;
		b=y;
		int resultado= a+b;
		return resultado;
	}
	
	
	
	double usoDeRandom(int limiteSup){
		double numeroRandom= Math.random() * limiteSup;
		return numeroRandom;
		}
	
	
}
