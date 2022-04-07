package mx.org.generation;

import java.util.Scanner; 

public class AritmeticaPrueba {

	public static void main(String[] args) {
		//Instanciamos la clase aritmetica y creamos un objeto con el nombre operacion. peracion va a ser tipo aritmetica, para que tenga algo teennemos que escribir la operacion new Aritmetica();
		Aritmetica operacion = new Aritmetica();
		operacion.a =5;
		operacion.b =6;
		operacion.sumar();
		
		//Está convirtiendo resultado a integer, y está asignando operacion.sumarConReturn() a la variable resultado
		int resultado= operacion.sumarConReturn();
		System.out.println("Resultado con return :"+resultado);
		
		int resultadoParametro = operacion.sumarConArgumentos(9, 6);
		System.out.println("Resultado con parámetros : " + resultadoParametro);

		System.out.println("N. random :" + operacion.usoDeRandom(100));
		
		//Scanner es para leer datos de la consola
		//Se escribe en aritmetica prueba porque estamos probando las funciones de la clase y aquí estamos preguntando el dato para sumarlo y ponerlo en las funciones, de esta manera será dinámico.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		//int i = sc.nextInt();
		//sc.nextLine();
		int i = Integer.parseInt(sc.nextLine( ));
		
		System.out.println("Introduce tus nombres: ");
		String name = sc.next();
		
		System.out.println("Introduce tu sexo: ");
		//char sexo = sc.next().charAt(0);
		String sexoString =sc.next();
		char sexo= sexoString.charAt(0);
		sexoString.length();
		
		System.out.println("Tu sexo es: " + i);
		System.out.println("Tu nombre es: " + name);
		System.out.println("Tu sexo es: " + sexo);
	

	}

}
