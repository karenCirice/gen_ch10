import java.util.Scanner;

public class ciclos {

	
	public static void main(String[] args) {
		/*
		int contador = 10;
		//uso del ciclo while 
		while (contador <= 5) {
			System.out.println("Valor de contador en while " + contador++);
		}
		
		//reinicio
		
		contador = 10;
		//uso del ciclo do while
		do {
			System.out.println("Valor de comntador rn do " + contador++);
		} while (contador <= 5);
		
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Valor de i  en for " + i);
		}
		*/
		//Uso del ciclo for con variable predeclarada
		
		int contador = 2;
		
		for ( ;contador <= 5; contador++) {
			System.out.println("Valor de for  " + contador);
			
			// Numero del que queremos calcular el factorial
			int iNumero = 4;

			// Variable con el valor del factorial
			int iFactorial = 1;

			// Cadena con la salida
			String sCadena = Integer.toString(iNumero) + "! = 1";

			for (int x=2;x<=iNumero;x++) {
			  iFactorial = iFactorial * x;
			  sCadena = sCadena + " x " + Integer.toString(x);
			}

			System.out.println(sCadena + " = " + Integer.toString(iFactorial));
			
			 /**
		     * @param args the command line arguments
		     */
		    public static void main(String[] args) {
		        //Ej.: El factorial de 5 es: 5*4*3*2*1
		        long factorial=1;
		        int num;
		        Scanner numero = new Scanner(System.in);
		        System.out.print("Introduce un número: ");
		        num = numero.nextInt();
		        for (int i = num; i > 0; i--) {
		            factorial = factorial * i;
		        }
		        System.out.println("El factorial de " + num + " es: " + factorial);

		}
		
	}
}
