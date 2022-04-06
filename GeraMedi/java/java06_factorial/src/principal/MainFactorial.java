package principal;

public class MainFactorial {
	
	public static void main(String[] args) {
	int uno = 1;	 //Base donde empieza a multiplicar
	long sum = 1;	//Base para entregarte el resultado, aquí se va sumando resultados
	int val = 20;  	//Valor a cambiar, valor a factorizar

	
	for (uno = 0; uno < val; uno++) {
		sum *= uno+1;    //Es lo mismo que sum = sum * (uno+1)
		System.out.println("El resultado de "+(uno+1)+" factorizado es: "+sum);	//se pone dentro de las llaves para que imprima todas las interacciones, cuando está fuera solo imprime el resultado final
	}
	}	
}








//EJERCICIO DE ELI
//int num = 4, factorial=1, contador = 0;
//
//// Factorial con el ciclo for
////for (int i = 0; i < num; i++) {
////	factorial*= i+1;
////}
//
//// Factorial con ciclo while
//while(contador < num) {
//	factorial*= contador+1;
//	contador++;
//}
//
//System.out.println("El factorial de " + num + " es: " + factorial);

