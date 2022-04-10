package mx.org.generation;

public class Aritmetica {
	//define the attributes of the class
	
	int a;
	int b;
	/**
	 * El nombre del constructor debe ser IDENTICO a la clase
	 * constructor sin parametros()
	 * los constructores no devuelven valor alguno
	 * por lo que no se le indica un tipo de retorno con la palabra void.
	 * 
	 * Se le indica un modificador de acceso: Public
	 * Cuando se crea un objeto, los parentesis llaman al constructor
	 * ej. Aritmetica operaciones = new Aritmetica().
	 */
	
	Aritmetica (){
		System.out.println("ejecutando constructor");
	}
	
	//Define a method without return (void)and without arguments
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: "+resultado);
	}
	
	//Define a method without return and with arguments
	/**
	 * Suma de los número y se vuelve el resultado
	 * @param x primer numero a sumar
	 * @param y segundo número a sumar
	 * @return el resultado de la suma 
	 * int e int y son mis argumentos del método.
	 */
	
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

