package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

	public static void main(String[] args) { //esto fue solo para ejecutar lo que se definió en la clase Aritmetica
		Aritmetica operacion = new Aritmetica();
		operacion.a = 5; 
		operacion.b = 6;
		operacion.sumar();
		
		int resultado = operacion.sumarConReturn(); //como return me regresa el valor, se le asigna a la variable
		System.out.println("Resultado return: "+resultado); //y luego se imprime dicha variable
		
		int resultadoParametro = operacion.sumarConArgumentos(9,6);
		System.out.println("Resultado con parámetros: "+resultadoParametro);
		
		System.out.println("N. random: "+operacion.usoDeRandom(100));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		//int i = sc.nextInt();
		int i = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce tu nombre: ");
		String name = sc.nextLine();
		System.out.println("Introduce tu sexo: ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Tu edad es: "+i);
		System.out.println("Tu nombre es: "+name);
		System.out.println("Tu sexo es: "+sexo);

	}

}
