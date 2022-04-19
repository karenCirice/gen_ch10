package mx.org.generation;

public class Aritmetica {
	// definimos los atributos de la clase
	int a;
	int b;
	
	 //el nombre del constructor debe ser identico a la clase
    //constructor sin par�metros 
    //los constructores no devuelven valor algun, no se le indica
    //un tipo de retorno ni la palabra void
    //se le indica un modificador de acceso:Public
    //cuando se crea el objeto, los parentesis llaman al constructor
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }


	// definimos un m�todo sin retorno (void)
	// y sin argumentos
	public void sumar() { // la palabra reservada void nos indica que la funci�n no tendr� retorno
		int resultado = a + b;
		System.out.println("La suma es: " + resultado);
	}

	// Definimos un m�todo con retorno
	// y sin argumentos
	public int sumarConReturn() { // int es el tipo de retorno que tiene la funci�n
		int resultado = a + b;
		return resultado; // return devuelve 1 solo valor
	}

	// Definimos un m�todo con retorno
	// con argumentos de entrada
	public int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}

	// Definimos un m�todo de la librer�a Math de Java
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}

}
