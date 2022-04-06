package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		Aritmetica operacion = new Aritmetica();
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn();
		System.out.println("Resultado return: "+resultado);
		
		int resultadoParametro = operacion.sumarConArgumentos(9, 6);
		System.out.println("Resultado con parametros: "+resultadoParametro);
		
		System.out.println("N. Random: "+operacion.usoDeRandom(100));
		
		Scanner texto = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int i = texto.nextInt();
		
		
		System.out.println("Introduce tu sexo: ");
		char sexo = texto.next().charAt(0);
		
		System.out.println("Tu edad es: "+i+" años");
		System.out.println("Tu sexo es: "+sexo);
	}

}
