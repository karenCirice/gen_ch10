package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para calcular un número factorial ejemplo 5
		//declara el numero del cual quieres el factorial 
		int num = 10;
		//de donde inicia a multiplicar 
		int fac = 1;
		//ciclo for
		for (int i=1; i<=num;i++) {
			fac *= i;
			System.out.println("El factorial de "+ i + " es " + fac);
			if (i == 10) {
				break;
		}}
	
	}
//el de Ely 	
/*int num = 4, factorial=1, contador = 0;

// Factorial con el ciclo for
//for (int i = 0; i < num; i++) {
//	factorial*= i+1;
//}

// Factorial con ciclo while
while(contador < num) {
	factorial*= contador+1;*/

}
