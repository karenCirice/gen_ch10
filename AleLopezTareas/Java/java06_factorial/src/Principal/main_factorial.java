package Principal;

public class main_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// factorial del 5 con for 
		/*	int factorial = 1;
			
			for (int x = 2 ; x <= 5 ; x++) {
				  factorial = factorial * x;
			
			}
			System.out.println("El factorial de 5 es:  " + factorial );

		}*/
		
		
		// impresión de los factoriales del 1-10
		    
			int factorial = 1, numero=10;
		
		    for (int i = 1 ; i <= numero ; i++) {
			  factorial = factorial * i;
			  
			  System.out.println("El factorial de " + i + " es:  " + factorial );
		
		    }
		   


	}

}
