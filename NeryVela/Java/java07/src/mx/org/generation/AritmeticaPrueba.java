package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		Aritmetica operacion = new Aritmetica(); //operacion es del tipo aritmetica
		operacion.a = 5;
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn();
		System.out.println("Resultado return:"+ resultado);
		
		int resultadoParametro = operacion.sumarConArgumentos(9, 6);
		System.out.println("Resultado con parametros:" + resultadoParametro);
	
		System.out.println("N. random: " +operacion.usoDeRandom(100));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu edad : ");
	     int i = sc.nextInt();
	     //sc.nextLine();
	     System.out.println("Introduce tu nombre: ");
	     String name = sc.next();
	     System.out.println("Introduce tu sexo: ");
	     String sexoString = sc.next();
	     //char sexo = sc.next().charAt(0);
	     char sexo = sexoString.charAt(0);
	     sexoString.length();
	     System.out.println("Tu edad es: "+i);
	     System.out.println("Tu nombre es: " +name);
	     System.out.println("Tu sexo es " +sexo);
	     
	}

}
