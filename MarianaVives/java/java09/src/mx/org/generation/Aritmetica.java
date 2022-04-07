/**
 * 
 */
package mx.org.generation;

public class Aritmetica {
		//definimos los atributos de la clase
		
		int a;
		int b;
		//El nombre del constructor debe ser IDENTICO a la clase
		//Constructo sin parámetros
		//Los constructores no devuelven valor alguno, no se le indica
		//Un tipo de retorno tampoco la palabra void
		
		//Se le india un mdoifiadore de Acces: Public.
		//Cuando se  crea un objeto , los parentesis llaman al consturctor
		//ej aritmetica operaciones = new Aritmetica ();
		
		public Aritmetica(){ //Constructor
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
		//definimos un método con retorno
		//Con argumentos de entrada
		/**
		 * Suma dos números y devuelve el resultado
		 * @param x
		 * @param y
		 * @return
		 *int x e int y son mis parámetros del método
		 */
		int sumarConArgumentos(int x, int y) {
			a = x;
			b = y;
			int resultado = a + b;
			return resultado;
		}
		
		//Definimos un método de la librería Math de Java:
		double usoDeRandom(int limiteSup){
			double numeroRandom = Math.random()*limiteSup;
			return numeroRandom;
		}
		
		
	}
