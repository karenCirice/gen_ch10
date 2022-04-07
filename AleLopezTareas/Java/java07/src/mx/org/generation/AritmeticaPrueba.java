package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inicializo una variable llamada operacion qeu proviene de la clase Aritmetica
		Aritmetica operacion = new Aritmetica();
		
		//aplico los metodos
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn();
		System.out.println("El resultado return es :  "+resultado);
		
		int resultadoParametro = operacion.sumarConArguementos(9, 6);
		System.out.println("Resultado con parámetros: "+resultadoParametro);
		
		
		System.out.println("N.random : "+operacion.usoDeRandom(100));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int i =sc.nextInt();
		System.out.println("Introduce tu nombre: ");
		String name= sc.next();
		
		System.out.println("Tu edad es: "+i);
		System.out.println("Tu nombre es: "+name);
		
		
		
	
		

	}

}
