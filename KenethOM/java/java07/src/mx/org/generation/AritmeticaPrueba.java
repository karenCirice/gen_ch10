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
		
		int resultadoParametro = operacion.sumarConArgumentos( 9, 6);
		System.out.println("Resultado con par�metros: "+ resultadoParametro);
		
		System.out.println("N. random :"+ operacion.usoDeRandom(100));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		int i = sc.nextInt();
		System.out.println("Tu edad es:"+i);

	}

}
