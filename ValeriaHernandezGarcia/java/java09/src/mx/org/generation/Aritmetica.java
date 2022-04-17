package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	
	int a;
	int b;
	 
	/**
	 * El nombre del constructor debe ser IDENTICO a la clase
	 * Constructor sin par{ametros()
	 * Los constructores no devuelven valor alguno, no se le indica
	 * un tipo de retorno, tampoco la palabra void.
	 * 
	 * Se le indica un modificador de acceso: Public
	 * Cuando se crea un objeto, los parentisis llman al contructor
	 * ej. Aritmetica = new Aritmetica();
	 * */
	Aritmetica(){
	System.out.println("Ejecutando constructor");
	}
	
	//definimos un m�todo sin retorno (void)
	// y sin argumentos
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
	
	//Definimos un m�todo con retorno
	// con argumentos de entrada
	/**Suma dos n�meros y se devuelve el resultado
	 * @param x primer n�mero a sumar
	 * @param y segundo n�mero a sumar
	 * @return el resultado de la suma 
	 * int x e int y son m�s argumentos del m�todo. 
	 */
	
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}
	
	//Definimos un m�todo de librer{ia Math de Java
	double usoDeRandom(int limiteSup){
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
		}
	
}

