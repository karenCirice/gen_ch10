package mx.org.generation;

public class aritmetica {
	static int a, b;
	
	public aritmetica(int x, int y) {
		a=x;
		b=y;
	}
	/*Definimos método sin retorno*/
	static void sumar() {
		int resultado=a+b;
		System.out.println("la suma es : "+resultado);
	}
	
	int sumaRetorno() {
		int resultado=a+b;
		return resultado;
	}
}
