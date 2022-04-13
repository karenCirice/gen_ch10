package mx.org.generation;

public class Aritmetica {
	// definimos los atributos de la clase
	int a;
	int b;
	
	 //el nombre del constructor debe ser identico a la clase
    //constructor sin parámetros 
    //los constructores no devuelven valor algun, no se le indica
    //un tipo de retorno ni la palabra void
    //se le indica un modificador de acceso:Public
    //cuando se crea el objeto, los parentesis llaman al constructor
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }


	// definimos un método sin retorno (void)
	// y sin argumentos
	public void sumar() { // la palabra reservada void nos indica que la función no tendrá retorno
		int resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}

	// Definimos un método con retorno
	// y sin argumentos
	public int sumarConReturn() { // int es el tipo de retorno que tiene la función
		int resultado = a + b;
		return resultado; // return devuelve 1 solo valor
	}

	// Definimos un método con retorno
	// con argumentos de entrada
	public int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}

	// Definimos un método de la librería Math de Java
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}

}
