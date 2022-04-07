package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		// para leer datos dados por el usuario
		Scanner sc = new Scanner(System.in);
		
		//todos los objetos se pasan por referencia (direccion en memoria)
		Aritmetica operacion = new Aritmetica();
		
		operacion.a = 5;
		operacion.b = 6;
		
		operacion.sumar();
		int resultado = operacion.sumarConReturn();
		System.out.println("Resultado return " + resultado);
		
		int resultadoParametro = operacion.sumarConArgumentos(9, 6);
		System.out.println("Resultado con parametros: " + resultadoParametro);
		
		System.out.println("No. random: " + operacion.usoDeRandom(100));
		
		System.out.println("Introduce tu edad: ");
//		int i = sc.nextInt();
//		sc.nextLine();
		int i = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce tu nombre: ");
		String nombre= sc.nextLine();
		System.out.println("Introduce tu sexo: ");
//		char sexo = sc.next().charAt(0);
		String sexoString = sc.next();
		char sexo= sexoString.charAt(0);
		
		System.out.println("Hola, " +nombre+ ", tu edad es: " + i + " y tu sexo es " +sexo);
		
		
	}
	
}
