//Un paquete es un folder donde se clafifican las clases
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
