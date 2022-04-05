package mx.org.generation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int edad;
		char sexo;
		String sexoLargo;
		aritmetica alumno=new aritmetica(3, 3);
//		alumno.sumar();
//		int resultadoPrincipal=alumno.sumaRetorno();
//		System.out.println(resultadoPrincipal);
		/*se lee string*/
		System.out.println("Quien eres?");
		String persona=leer.next();
		/*se lee edad*/
		System.out.println("edad: ");
		edad=leer.nextInt();
		/*se lee sexo*/
		System.out.println("tu sexo:");
		sexoLargo=leer.next();
		sexo=sexoLargo.charAt(0);
		System.out.println(persona);
		System.out.println(edad);
		System.out.println(sexo);
		
	}
	

}
