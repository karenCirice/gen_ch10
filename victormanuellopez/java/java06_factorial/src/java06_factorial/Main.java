package java06_factorial;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = 10;
		int factorial = 1;
		
		for(int i=1; i<=valor; i++) {
			factorial *= i;
			System.out.println("El factorial de: " + i + " es: " + factorial);
		}
	}

}
