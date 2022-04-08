package Principal;

public class factorial_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorial = 1; // inicializando
		
//		int incremento = 2;
		// factorial = 1;
		
		for (int numero = 1; numero <=5; numero++) {
			
//		for (int numero = 1; numero <=10; numero+=5) { // si se desea incrementar de 5 en 5 se agrega un +=
			
			factorial = numero*factorial; // numero aumenta en 1, // factorial actualiza a si mismo
			
			System.out.println("Resultado: " + factorial); // aqui factorial imprime la actualizacion
			
			/// if (numero == 5) {
				
			//	System.out.println("Resultado: " + (factorial *1*2*3*4*5) );
			//
		 }	
	
	}

}
