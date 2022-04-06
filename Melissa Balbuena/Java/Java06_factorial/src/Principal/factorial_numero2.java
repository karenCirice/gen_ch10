package Principal;

public class factorial_numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int factorial = 1; // inicializando
			
			for (int numero = 1; numero <=10; numero++) {
				
				factorial = numero*factorial; // numero aumenta en 1, // factorial actualiza a si mismo
				
				System.out.println("Resultado: " + factorial); // aqui factorial imprime la actualizacion
				

			 }	
		
		}

}
