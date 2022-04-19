/**
 * 
 */
package mx.org.generation;

/**
 * @author Yoscel�n RS
 *5 abr. 2022
 */
public class Aritmetica {
	//definimos los atributos de la clase
	int a;
	int b;
	
	/**
	 * El nombre del constructor debe ser IDENTICO a la clas
	 * constructor sin par�metros()
	 * Los costructores no devuelven valor alguno, no se le indica
	 * un tipo de retorno, tampoco la palabra void
	 * 
	 * Se le indica un modificador de acceso :Public
	 * Cuando se crea un objeto, los parentesis llaman al constructor
	 * eje. Aritmetica
	 */
	
	public Aritmetica() {   //Esta es la declaraci�n de nuestro constructor, se pone public para que se pueda usar en otras clases
		System.out.println("Ejecutando constructor");
	}
	
	//Definimos un m�todo sin retorno (void)
	//y sin argumentos
	
	void sumar() {      //con la palabra void le decimos que no tiene retorno
		int resultado = a + b;
		System.out.println("La suma es :" + resultado);
	}
	
	//Definimos un m�todo con retorno
	// y sin argumentos
	 int sumarConReturn() {
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}

	 // Definimos un m�todo con retorno
	 //Con argumentos de entrada
	 /**
	  * Suma dos n�meros y se devuelve el resultado
	  * @param x primer n�mero a sumar
	  * @param y segundo n�mero a sumar
	  * @return el resultado de la suma
	  * int x e int y son mis par�metros del m�todo
	  */
	 int sumarConArgumentos (int x, int y) {
		 a= x ;
		 b = y;
		 int resultado = a + b;
			 return resultado;
		 
	 }
	 
	 //Definimos un m�todo de la librer�a Math de Java
	    double usoDeRandom( int limiteSup) {
		 double numeroRandom = Math.random() * limiteSup;
		 return numeroRandom;
	 }
}


/*Cuando se llama un m�todo pero �ste no recibe ni regresa valores*/
//nombre_objeto.nombre_metodo();
/*cuando se llama  un m�todo que s� recibe un valor pero pero no devolver� ning�n valor*/
//nombre_objeto.nombre_metodo(valor);
/*cuando se llama a un m�todo que recibe m�s de un valor pero no devolver� ning�n valor. Los valores recibidos deben separarse por comas*/
//nombre_objeto.nombre_metodo(valor1, valor2, valor3, ..., valorN);
/*cuando se llama un metodo que no recibe valores pero s� regresa valores*/
//tipo_variable variable=nombre_objeto.nombre_Metodo();
/*cuando se llama a un m�todo que s� recibe y regresa valores*/
//tipo_variable variable=nombre_objeto.nombre_metodo(valor);
/*cuando se llama a un m�todo que recibe m�s de un valor y en �l habr� valor de retorno. Los valores recibidos deben separarse por comas*/
//tipo_variable variable=nombre_objeto.nombre_metodo(valor1, valor2, valor3, ..., valorN);
