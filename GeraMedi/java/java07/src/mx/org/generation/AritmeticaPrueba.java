package mx.org.generation;

import java.util.Scanner; //Al a�adir la l�nea 22-23 se import� esta clase, la que contiene scanner

public class AritmeticaPrueba {

	public static void main(String[] args) {     //Se llama Aritmetica.java 
		Aritmetica operacion = new Aritmetica(); //Creamos nuevo objeto, operacion tipo Aritm�tica
		operacion.a = 5;         //a ya est� en el Aritmetica
		operacion.b = 6;		 //b ya est� definida al igual que a
		operacion.sumar();		 //funci�n ya est� definida al igual que a y b
		
		int resultado = operacion.sumarConReturn();  //funci�n dada de alta en Aritmetica.java
		System.out.println("Resultado con return: "+resultado);
		
		int resultadoParametro = operacion.sumarConArgumentos(14, 15);
		System.out.println("Resultado con par�metros: "+resultadoParametro);
		
		//El math viene por defecto en java.lang que lo carga directamente java
		System.out.println("No. random: "+operacion.UsoDeRandom(100));
		
		//Vienen de la p�gina de java, en java util
		//https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
		   Scanner sc = new Scanner(System.in);
		   
		   //Ejemplo con n�meros rango int
		   System.out.println("Introduce tu edad: ");
		   int i = sc.nextInt();
		   
		   //Ejemplo con string (nombre)
		   System.out.println("Introduce tu nombre");
		     String name = sc.next();
		     
		     //Ejemplo con char
		     System.out.println("Introduce tu sexo:");
		     //char sexo = sc.next().charAt(0);
		     String sexoString = sc.next();   // L�nea 37 y 38 es lo mismo que la 36
		     char sexo = sexoString.charAt(0);  // L�nea 37 y 38 es lo mismo que la 36
		     sexoString.length();
		     
		     //Para imprimir resultados
		     System.out.println("Tu edad es: "+i);
		     System.out.println("Tu nombre es: "+name);
		     System.out.println("Tu sexo es: "+sexo);
	}

}
