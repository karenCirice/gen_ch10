package mx.org.generation;

public class Aritmetica {
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
}
