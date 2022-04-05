package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aritmetica operacion = new Aritmetica();
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn();
		System.out.println("Resultado return: " + resultado);
		
		int resultadoParametro = operacion.sumarConArgumentos(9, 6);
		System.out.println("Resultado con parametros: "+ resultadoParametro);
		
		System.out.println("Numero random: "+ operacion.usoDeRandom(100));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		
		int i = sc.nextInt();
		System.out.println("Introduce tu nombre");
		String nombre = sc.next();
		System.out.println("Introduce tu sexo");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Tu edad es: "+i);
		System.out.println("Tu nombre es: "+ nombre);
		System.out.println("Tu sexo es: "+ sexo);
		
	}

}
