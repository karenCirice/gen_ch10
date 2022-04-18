// Un paquete es un folder donde se clasifican las clases
package principal;

import operaciones.Aritmetica;

public class Main {

	public static void main(String[] args) {
		Aritmetica operacion = new Aritmetica();
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
	}

}
