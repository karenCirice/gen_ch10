package mx.org.generation;

public class Aritmetica {
	//definimos los atributos de la clase 
		int a;
		int b;
		
		/**
		 * El nombre del constructor debe ser IDENTICO a la clase
		 * Costructor sin parametros ()
		 * Los constructores no devuelven valor alguno, no se le indica
		 * un tipo de retorno, tampoco la palabra void.
		 * 
		 * Se le indica un modificador de acceso: Public.
		 * Cuando se crea un objeto, los parentesis llaman al constructor
		 * ej. Aritmetica operaciones = new Aritmetica();
		 */
		public Aritmetica (){
			System.out.println("Ejecutando costructor");
		}
		//Definimos un método sin retorno (void)
		//y sin argumentos
		void sumar() {
			int resultado = a + b;
			System.out.println("La suma es : "+resultado);
		}
		
		//Definimos un método con retorno 
		//y sin argumetos
		int sumarConReturn() {
			int resultado = a + b;
			return resultado; // return devuelve 1 solo valor
		}
		
		//Definimos un método con retorno 
		//y con argumetos de entrada
		/**
		 * Suma dos numeros y se devuelve el resultado 
		 * @param x primer número a sumar
		 * @param y segundo número a sumar
		 * @return el resultado de la suma 
		 * int x e int y son mis argumentos del método
		 */
		int sumarConArgumentos (int x, int y){
			a= x;
			b= y;
			int resultado = a + b;
			return resultado;
		}
		
		double usoDeRandom(int limiteSup){
			double numeroRandom = Math.random() * limiteSup;
			return numeroRandom;
		}
		
		
}
