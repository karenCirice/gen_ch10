package java09;

public class Aritmeticajava {

	//definimos los atributos de la clase
	
	int a;
	int b;
	
	/**
	  * El nombre del constructor debe ser IDENTICO a la clase
	  * Constructor sin parametros (), o sea que los corchetes estan vacios
	  * Los constructores no devuelven valor alguno, no se le indica un tipo
	  * de retorno, tampoco la palabra void
	  * 
	  * Se le indica un modificador de acceso: Public   // tipo publico
	  * Cuando se crea un objeto, los parentesis llaman al constructor
	  * ej. Aritmetica operaciones = new Aritmetica();
	  */
	 Aritmetica(){ // Constructor llamado Aritmetica
	  System.out.println("Ejecutando constructor");
	 }
	 
	
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

}
