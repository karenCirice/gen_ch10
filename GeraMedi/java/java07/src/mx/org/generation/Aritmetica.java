package mx.org.generation;

public class Aritmetica {
			//Definimos los atributos de la clase
		int a, b;
		
		//Definimos un m�todo sin retorno (void)
		//y sin argumentos
		void sumar() {
			int resultado = a + b;
			System.out.println("La suma es: "+resultado);
		//En java tienes que definir el tipo de devoluci�n que tendr� la funci�n
		//con void se define que la funci�n no regresa nada
		}
		
		int sumarConReturn(){
			int resultado = a + b;
			return resultado;
		//Aqu� se indica que la funci�n arroja un dato, pero solo un resultado
		//Se puso el int al principio para indicar que la respuesta es tipo int
		}
		
		//Definimos m�todo con retorno
		//con argumentos de entrada (Par�metros de entrada x y)
		int sumarConArgumentos(int x, int y) {
			a = x;
			b = y;
			int resultado = a + b;
			return resultado;
		}
		
		//Funcion con operaciones matem�ticas
		//Se define m�todo de la librer�a Math de Java, link abajo
		//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		double UsoDeRandom(int limiteSup){		//Se asigna par�metro el cual cambiar�
			double numeroRandom = Math.random() * limiteSup;  //Se multiplica por limS para que nos de n�meros mayores de 1
			return numeroRandom;
		}
}
