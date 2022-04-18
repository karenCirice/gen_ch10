package operaciones;

public class Aritmetica {
	// atributos de la clase
		// la palabra reservada public es para hacerlas visibles
		// en otros paquetes
		public int a;
		public int b;
		
		// Método suma sin retorno
		public void sumar() {
			int resultado = a +b;
			System.out.println("El resultado es : " + resultado);
		}
		
		// Método sumar con retorno
		public int sumanConReturn() {
			int resultado = a + b;
			return resultado; // Solo se puede devolver un valor
		}
		
		// Método para generar un número aleatorio
		public double numeroRandom(int maxValue) {
			return Math.random()*maxValue;
		}
}
