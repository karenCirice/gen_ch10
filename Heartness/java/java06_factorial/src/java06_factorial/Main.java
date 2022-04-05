package java06_factorial;

public class Main {
	public static void main(String[] args)
    {
        int x = 5;
        int factorial = 1;
        
        for(int i = 1; i <= x; i++) {
        	System.out.print(i + " x ");
        	factorial *= i;
        }
        System.out.println(" \n El Factorial de " + x + " es: " + factorial);
        
        //factorial de todos los nmumeros del 1 al 10
        
        factorial = 1;
        
        for(int i = 1; i <= 10; i++) {
        	factorial *= i;
        	System.out.println("Factorial de " + i + " es " + factorial);
        }
    }
}
