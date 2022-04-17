package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase
	
			int a;
			int b;
			
			/**
			 * El nombre del constructor debe ser identico a la clase
			 * constructor sin parametros ()
			 * los constructores no devuelven valor alguno, no se le indica un tipo de retorno, tampoco la palabra void
			 * Se le indica un modificador de acceso: Public
			 * Cuando se crea un objeto, los parentesis llaman al constructor
			 * ej. aritmetica operaciones = new Aritmetica();
			 */
			public Aritmetica() {
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
			
			//definimos un metodo con retorno
			//con argumentos de entrada
			/**
			 * Suma dos numeros y se devuelve el resultado
			 * @param x primer numero a sumar
			 * @param y segundo numero a sumar
			 * @return el resultado de la suma
			 * int x e int y son mis argumentos del metodo
			 */
			int sumarConArgumentos(int x, int y) {
				a = x;
				b= y;
				int resultado = a + b;
				return resultado;
			}
			
			//definimos un metodo de la libreria Math de Java
			double usoDeRandom(int limiteSup) {
				double numeroRandom = Math.random() * limiteSup;
				return numeroRandom;
			}
	}




