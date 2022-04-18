package mx.org.generation;

public class aritmetica {
	int a=4;
	int b=6;
	
	
	/*Definimos método sin retorno*/
	void sumar() {
		int resultado=a+b;
		System.out.println("la suma es : "+resultado);
	}
	
	/*
	 * @param x primer numero a sumar
	 * @param y primer numero a sumar
	 * @return el resultado que regresa
	 */
	int sumaRetorno(int x, int y) {
		a=x;
		b=y;
		int resultado=a+b;
		return resultado;
	}
}
