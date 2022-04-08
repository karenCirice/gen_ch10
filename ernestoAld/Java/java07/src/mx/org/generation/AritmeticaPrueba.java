package mx.org.generation;

import java.util.Scanner;

public class AritmeticaPrueba {

    public static void main(String[] args) {
        Aritmetica operacion = new Aritmetica();
        operacion.a = 5;
        operacion.b = 6;
        operacion.sumar();
        Scanner in = new Scanner(System.in);
        int resultado = operacion.sumarConReturn();
        System.out.println("Resultado return: " + resultado);

        int resultadoParametro = operacion.sumarConArgumentos(9, 6);
        System.out.println("Resultado con parametros :" + resultadoParametro);

        System.out.println("N. random :" + operacion.usoDeRandom(100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad :");
        int i = sc.nextInt();
        System.out.println("Introduce tu nombre :");
        String name = sc.next();

        System.out.println("Tu edad es: " + i);
        System.out.println("Tu nombre es :" + name);
    }
}
