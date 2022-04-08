/**
 * 
 */
package mx.org.generation;

/**
 * @author Yoscelín RS
 *5 abr. 2022
 */
public class Aritmetica {
	//definimos los atributos de la clase
	int a;
	int b;
	
	//Definimos un método sin retorno (void)
	//y sin argumentos
	
	void sumar() {      //con la palabra void le decimos que no tiene retorno
		int resultado = a + b;
		System.out.println("La suma es :" + resultado);
	}
	
	//Definimos un método con retorno
	// y sin argumentos
	 int sumarConReturn() {
		int resultado = a + b;
		return resultado; //return devuelve 1 solo valor
	}

	 // Definimos un método con retorno
	 //Con argumentos de entrada
	 int sumarConArgumentos (int x, int y) {
		 a= x ;
		 b = y;
		 int resultado = a + b;
			 return resultado;
		 
	 }
	 
	 //Definimos un método de la librería Math de Java
	    double usoDeRandom( int limiteSup) {
		 double numeroRandom = Math.random() * limiteSup;
		 return numeroRandom;
	 }
}


/*Cuando se llama un método pero éste no recibe ni regresa valores*/
//nombre_objeto.nombre_metodo();
/*cuando se llama  un método que sí recibe un valor pero pero no devolverá ningún valor*/
//nombre_objeto.nombre_metodo(valor);
/*cuando se llama a un método que recibe más de un valor pero no devolverá ningún valor. Los valores recibidos deben separarse por comas*/
//nombre_objeto.nombre_metodo(valor1, valor2, valor3, ..., valorN);
/*cuando se llama un metodo que no recibe valores pero sí regresa valores*/
//tipo_variable variable=nombre_objeto.nombre_Metodo();
/*cuando se llama a un método que sí recibe y regresa valores*/
//tipo_variable variable=nombre_objeto.nombre_metodo(valor);
/*cuando se llama a un método que recibe más de un valor y en él habrá valor de retorno. Los valores recibidos deben separarse por comas*/
//tipo_variable variable=nombre_objeto.nombre_metodo(valor1, valor2, valor3, ..., valorN);
