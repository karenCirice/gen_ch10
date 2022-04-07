package mx.org.generation;

public class Aritmetica {
	//Definimos los atributos de la clase 
	int a;
	int b;
	

	/**
	 * El nombre del constructor debe ser identico a la clase
	 * Constructor sin parametro
	 * Los constructores no de vuelven valor alguno, no se le indica
	 * un tipode retorno, tampoco la palabra void
	 * 
	 * Se le indica un modificador de acceso: Public
	 * Cuando se crea el objeto, los parentesis llaman al; cosntructores
	 * Por ejemplo Aritmetica
	 */
	
	Aritmetica(){
		System.out.println("Ejecutando el constructor");
	}
	
	
	//definimos un metodo sin retorno (void)
	//Y sin argumentos
	
	void sumar( ) {
		int resultado = a + b;
		System.out.println("La suma es :" + resultado);
	}
	
	//Definimos un metodo con retornos
	//Y sin argumentos
	int sumarConReturn(){
		int resultado = a + b;
		return resultado; //return devuelve solo un valor
	}
	
	//Definimos un metodo con retorno
		// con rgumentos de entrada
	
	/**
	 * Suma dos numeros y se devuelve el resultado
	 * @param x primer numero a sumar
	 * @param y seguindo numero a sumar
	 * @return el resultado de la suma
	 * int x e int y son mis argumentos del metodo
	 */
		
		int sumarConArgumentos(int x, int y) {
			a = x;
			b = y;
			int resultado = a + b;
			return resultado;
		}
		
		//Definimos un metodo de la libreria Math de java
		double usoDeRandom(int limiteSup) {
			double numeroRandom = Math.random() * limiteSup;
			return numeroRandom;
		}
}


//31b7dea0
//id = 27

