/**
 * 
 */
package mx.org.generation;

/**
 * @author DELL
 *
 * 5 abr. 2022
 */
public class Aritmetica {

	//DEFINIMOS LOS ATRIBUTOS DE LA CLASE
	
	int a;
	int b;
	
	//DEFINIMOS UN METODO SIN RETORNO
	// Y SIN ARGUMENTOS
	void sumar() {
		int resultado = a + b;
		System.out.println("la suma es : " +resultado);
	}
	// DEFINIMOS UN METODO CON RETORNO
	// Y SIN ARGUMENTOS
	int sumarConReturn(){
		int resultado = a + b;
		return resultado;   //RETURN DEVUELVE UN SOLO VALOR
	}
	
	// DEFINIMOS UN METODO CON RETORNO 
	// CON ARGUMENTOS DE ENTRADA
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}
	//DEFINIMOS UN METODO DE LA LIBRERIA MATH DE JAVA
	double usoDeRandom(int limiteSup) {
		double numeroRandom = Math.random()*limiteSup;
		return numeroRandom;
	}
}
