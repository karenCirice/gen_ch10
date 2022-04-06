package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	int a;
	int b;
	
	//Definimos un metodo sin retorno (void)
	void sumar() {
		int resultado = a + b;
		System.out.println("La suma es: "+resultado);
	}
	
	//Definimos un metodo con retorno
	// y sin argumentos
	int sumarConReturn() {
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}
	
	
}
