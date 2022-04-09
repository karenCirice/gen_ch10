package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

	public static void main(String[] args) {
		//instanciamos la operacion 
		Aritmetica operacion = new Aritmetica();
		operacion.a = 5;
		operacion.b = 6; //llama a las var
		operacion.suma(); //llama a la funcion
		
		int resultado = operacion.sumarConReturn(); //llama al metodo (funcion)
		System.out.println("Resultado return: " +resultado);
		
		int resultadoParametro = operacion.sumarconArgumentos(9, 6);
		System.out.println("Resultado con paramentros: " + resultadoParametro);
	
		System.out.println("N. random: " +operacion.usoDeRandom(100));
	
		
		Scanner sc = new Scanner(System.in);
		//inputs
		System.out.println("Introduce tu edad :");
		//espera un entero
	    int i = sc.nextInt();
	    System.out.println("Introduce tu nombre :");
	    //Espera un string
	    String name = sc.next();
	    sc.nextLine();
	    
	    System.out.println("Introduce tu sexo: ");
//	    // regresa el primer caracter
	    String sexoString = sc.next();
	    char sexo = sc.next().charAt(0);
	    sexoString.length();
	    
	    System.out.println("Tu edad es: "+ i);
	    System.out.println("Tu nombre es :"+ name);
	    System.out.println("Tu sexo es: " +sexo);
		
	}
	

}
