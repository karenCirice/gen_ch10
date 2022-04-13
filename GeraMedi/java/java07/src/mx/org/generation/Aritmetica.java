package mx.org.generation;

public class Aritmetica {
			//Definimos los atributos de la clase
		int a, b;
		
		//Definimos un método sin retorno (void)
		//y sin argumentos
		void sumar() {
			int resultado = a + b;
			System.out.println("La suma es: "+resultado);
		//En java tienes que definir el tipo de devolución que tendrá la función
		//con void se define que la función no regresa nada
		}
		
		int sumarConReturn(){
			int resultado = a + b;
			return resultado;
		//Aquí se indica que la función arroja un dato, pero solo un resultado
		//Se puso el int al principio para indicar que la respuesta es tipo int
		}
		
		//Definimos método con retorno
		//con argumentos de entrada (Parámetros de entrada x y)
		int sumarConArgumentos(int x, int y) {
			a = x;
			b = y;
			int resultado = a + b;
			return resultado;
		}
		
		//Funcion con operaciones matemáticas
		//Se define método de la librería Math de Java, link abajo
		//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		double UsoDeRandom(int limiteSup){		//Se asigna parámetro el cual cambiará
			double numeroRandom = Math.random() * limiteSup;  //Se multiplica por limS para que nos de números mayores de 1
			return numeroRandom;
		}
}
