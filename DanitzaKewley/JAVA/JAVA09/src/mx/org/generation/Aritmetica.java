package mx.org.generation;

/**
 * @author Dany
 *
 */

public class Aritmetica {

	//definimos dos atributos de la clase
		int a;
		int b;
	
		/**
		 * El nombre del constructor debe ser IDENTICO a la clase
		 * Constructoor sin parametros ()
		 * Los constructores NO devuelven valor alguno,
		 * por lo que no se le indica un tipo de retorno,
		 * tampoco la palabra void.
		 * 
		 * Se le indica un modificador de acceso: Public
		 * Cuando se crea el objeto, los parentesis llaman al constructor
		 * ej. Aritmetica operaciones = new Aritmetica();
		 */
		public Aritmetica(){
			System.out.println("Ejecutando constructor");
		}
		
		//Definimos un método sin retorno (void) y sin argumentos
		void sumar() {
			int resultados = a+b;
			System.out.println("La suma es: "+resultados);
		}
		//Definimos un método con retorno y sin argumentos
		int sumarConReturn(){
			int resultado = a + b;
			return resultado; //return devuelve 1 solo valor
		}
		//Definir un método con retorno
		//con argumentos de entrada 
		/**
		 * Suma dos números y se devuelve el resultado
		 * @param x
		 * @param y
		 * @return
		 * int x e int y son mis argumentos del método.
		 */
		
		int sumarConArgumentos(int x, int y) {
			a = x;
			b = y;
			int resultado = a + b;
			return resultado;
		}
		
		//Definimos un método de la librería Math de Java
		double usoDeRandom(int limiteSup){
			double numeroRandom = Math.random()* limiteSup;
			return numeroRandom;
		}
	}


