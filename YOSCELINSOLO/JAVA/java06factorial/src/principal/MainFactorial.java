/**
 * 
 */
package principal;

/**
 * @author Yoscelín RS
 *4 abr. 2022
 */
public class MainFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
int numFactorial = 12;
int factorial=1;
int contador = 0;
		
		//uso del ciclo while para factorial
   	       while (contador<numFactorial) {
   	    	   factorial*= contador+1;
   	    	   contador++;
   	       
   	    System.out.println(  " Valor del factorial " + contador + " es: " + factorial);
   	       }

	}

}
