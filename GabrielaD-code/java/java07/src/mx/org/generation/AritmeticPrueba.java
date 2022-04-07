package mx.org.generation;

import java.util.Scanner;

public class AritmeticPrueba {

	public static void main(String[] args) {
		//Instancio un objeto de clase Aritmetica
		Aritmetica operacion = new Aritmetica();
		
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn();
		System.out.println("Resultado return: " + resultado);
		
		int resultadoParametro = operacion.sumaConArgumentos(9, 6);
		System.out.println("Resultado con parámetros: " + resultadoParametro);
		
		System.out.println("Resultado random: " + operacion.usoDeRandom(100));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int i = Integer.parseInt(sc.nextLine( ));
		//int i = sc.nextInt();

		System.out.println("Introduce tu nombre: ");
		String name = sc.nextLine();

		System.out.println("Introduce tu sexo: ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Tu edad es: " + i);
		System.out.println("Tu nombre es: " + name);
		System.out.println("Tu sexo es: " + sexo);
		
		
		

	}
		
		
}
